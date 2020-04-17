package net.jkhub.jedlib.automation;

import org.eclipse.swt.internal.win32.OS;
import org.eclipse.swt.ole.win32.OLE;
import org.eclipse.swt.ole.win32.OleAutomation;
import org.eclipse.swt.ole.win32.Variant;

/**
 * This class represents a COG script placed in a level.
 * <p>
 * This class is somewhat similar to the {@code OleAuto.TAutoObject} class in
 * Delphi. However, one notable difference is that an {@code OleObject} "has an"
 * {@code IDispatch} as a private field while a {@code TAutoObject} "is an"
 * {@code IDispatch} itself.
 */
public abstract class OleObject implements AutoCloseable {

	/**
	 * The number of bytes used to hold a value for a variant of type {@code VT_R8}
	 * (double).
	 */
	private static final int VT_R8_SIZEOF = 8;

	/**
	 * The number of bytes used to hold a value for a variant of type {@code VT_I4}
	 * (int).
	 */
	private static final int VT_I4_SIZEOF = 4;

	/**
	 * The number of bytes used to hold a value for a variant of type
	 * {@code VT_BSTR} (string).
	 */
	private static final int VT_BSTR_SIZEOF = 8;

	private final OleAutomation automation;

	protected OleObject(OleAutomation automation) {
		if (automation == null) {
			throw new NullPointerException("automation cannot be null");
		}
		this.automation = automation;
	}

	/**
	 * Get the underlying {@link OleAutomation} for this object. Useful for precise
	 * control in cases where the wrapper library is incomplete or has defects.
	 * 
	 * @return a {@link OleAutomation} object
	 */
	public final OleAutomation getAutomation() {
		return automation;
	}

	@Override
	public final void close() {
		automation.dispose();
	}

	protected Variant func(String name, Object... args) {
		int dispId = getDispId(name);
		return automation.invoke(dispId, wrapArgs(args));
	}

	protected void proc(String name, Object... args) {
		int dispId = getDispId(name);
		automation.invokeNoReply(dispId, wrapArgs(args));
	}

	protected Variant get(String name) {
		int dispId = getDispId(name);
		return automation.getProperty(dispId);
	}

	protected void set(String name, Object value) {
		int dispId = getDispId(name);
		automation.setProperty(dispId, wrapArg(value));
	}

	private int getDispId(String name) {
		return automation.getIDsOfNames(new String[] { name })[0];
	}

	private Variant wrapArg(Object arg) {
		if (arg instanceof Variant) {
			// No conversion needed
			return (Variant) arg;
		} else if (arg instanceof String) {
			return new Variant((String) arg);
		} else if (arg instanceof Boolean) {
			return new Variant((Boolean) arg);
		} else if (arg instanceof Long) {
			return new Variant((Long) arg);
		} else if (arg instanceof Integer) {
			return new Variant((Integer) arg);
		} else if (arg instanceof Short) {
			return new Variant((Short) arg);
		} else if (arg instanceof Double) {
			return new Variant((Double) arg);
		} else if (arg instanceof Float) {
			return new Variant((Float) arg);
		}
		throw new IllegalArgumentException("Unknown type: " + arg.getClass().getName());
	}

	private Variant[] wrapArgs(Object... args) {
		Variant[] values = new Variant[args.length];
		for (int i = 0; i < args.length; i++) {
			Object arg = args[i];
			Variant value = wrapArg(arg);
			values[i] = value;
		}
		return values;
	}

	/**
	 * This utility class helps manage memory allocation for {@code VT_BYREF}
	 * variants. Note that memory is allocated immediately while the variants
	 * themselves are created lazily.
	 * <p>
	 * XXX: Is there any way to do this without relying on internal/non-API SWT
	 * code?
	 */
	protected static final class ByRefVariants implements AutoCloseable {

		/**
		 * A pointer to the block of allocated memory.
		 */
		private final long ptr;

		/**
		 * How many bytes are used to store each value.
		 */
		private final int elementSize;

		/**
		 * The variant type flags, including {@code VT_BYREF}.
		 */
		private final short variantType;

		/**
		 * The variants that have been allocated, or {@code null} if this object has
		 * been disposed.
		 */
		private Variant[] variants;

		private ByRefVariants(int count, int elementSize, int variantType) {
			this.elementSize = elementSize;
			this.variantType = (short) variantType;
			this.variants = new Variant[count]; // up to 'count' variants may be created
			this.ptr = OS.GlobalAlloc(OS.GMEM_FIXED | OS.GMEM_ZEROINIT, count * elementSize);
		}

		/**
		 * Retrieve a variant. The variants are indexed from {@code 0} to
		 * {@code count-1}, where {@code count} is the number of variant elements that
		 * were originally requested.
		 * 
		 * @param index
		 *            identifies which variant to retrieve
		 * @return the {@link Variant}
		 * @throws IllegalStateException
		 *             if this object has been disposed
		 * @throws ArrayIndexOutOfBoundsException
		 *             if the index does not correspond to an allocated variant
		 */
		public Variant get(int index) {
			if (variants == null) {
				throw new IllegalStateException("Object has been disposed");
			}
			// Retrieve the requested variant
			Variant variant = variants[index]; // this throws exception on bad index
			if (variant == null) {
				// Lazy variant creation
				variant = new Variant(ptr + index * elementSize, variantType);
				variants[index] = variant;
			}
			return variant;
		}

		/**
		 * Dispose this object and release all memory and resources.
		 */
		@Override
		public void close() {
			if (variants == null) {
				// Already disposed
				return;
			}
			variants = null;
			OS.GlobalFree(ptr);
		}

	}

	/**
	 * Allocate {@code VT_I4 | VT_BYREF} variants for integer values.
	 * 
	 * @param count
	 *            how many variants to allocate
	 * @return the allocated items
	 */
	protected static ByRefVariants allocateIntegerByRefVariants(int count) {
		return new ByRefVariants(count, VT_I4_SIZEOF, OLE.VT_I4 | OLE.VT_BYREF);
	}

	/**
	 * Allocate {@code VT_R8 | VT_BYREF} variants for double values.
	 * 
	 * @param count
	 *            how many variants to allocate
	 * @return the allocated items
	 */
	protected static ByRefVariants allocateDoubleByRefVariants(int count) {
		return new ByRefVariants(count, VT_R8_SIZEOF, OLE.VT_R8 | OLE.VT_BYREF);
	}

	/**
	 * Allocate {@code VT_BSTR | VT_BYREF} variants for string values.
	 * 
	 * @param count
	 *            how many variants to allocate
	 * @return the allocated items
	 */
	protected static ByRefVariants allocateStringByRefVariants(int count) {
		return new ByRefVariants(count, VT_BSTR_SIZEOF, OLE.VT_BSTR | OLE.VT_BYREF);
	}

}
