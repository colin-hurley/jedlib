package net.jkhub.jedlib.automation;

import org.eclipse.swt.ole.win32.OleAutomation;
import org.eclipse.swt.ole.win32.Variant;

/**
 * This class represents a light placed in a level.
 * <p>
 * This class corresponds to {@code TOLELight} from {@code JED_OLE.pas}.
 */
public final class Light extends OleObject {

	Light(OleAutomation automation) {
		super(automation);
	}

	// Public body

	/**
	 * TODO: Add description
	 * <p>
	 * Original content from {@code JED_OLE.pas}:
	 * 
	 * <pre>
	 * Procedure Update;
	 * </pre>
	 */
	public void update() {
		proc("Update");
	}

	/**
	 * TODO: Add description
	 * <p>
	 * Original content from {@code JED_OLE.pas}:
	 * 
	 * <pre>
	 * Procedure Release;
	 * </pre>
	 */
	public void release() {
		proc("Release");
	}

	/**
	 * TODO: Add description
	 * <p>
	 * Original content from {@code JED_OLE.pas}:
	 * 
	 * <pre>
	 * Procedure GetXYZ(var x,y,z:double);
	 * </pre>
	 * 
	 * @return TODO: Add description
	 */
	public Vector getXYZ() {
		try (ByRefVariants variants = allocateDoubleByRefVariants(3)) {
			Variant x = variants.get(0);
			Variant y = variants.get(1);
			Variant z = variants.get(2);
			proc("GetXYZ", x, y, z);
			return new Vector(x.getDouble(), y.getDouble(), z.getDouble());
		}
	}

	/**
	 * TODO: Add description
	 * <p>
	 * Original content from {@code JED_OLE.pas}:
	 * 
	 * <pre>
	 * Procedure SetXYZ(x,y,z:double);
	 * </pre>
	 * 
	 * @param x
	 *            TODO
	 * @param y
	 *            TODO
	 * @param z
	 *            TODO
	 */
	public void setXYZ(double x, double y, double z) {
		proc("SetXYZ", x, y, z);
	}

	/**
	 * TODO: Add description
	 * <p>
	 * Original content from {@code JED_OLE.pas}:
	 * 
	 * <pre>
	 * Procedure GetRGB(var r,g,b:double);
	 * </pre>
	 * 
	 * @return TODO: Add description
	 */
	public Tint getRGB() {
		try (ByRefVariants variants = allocateDoubleByRefVariants(3)) {
			Variant r = variants.get(0);
			Variant g = variants.get(1);
			Variant b = variants.get(2);
			proc("GetRGB", r, g, b);
			return new Tint(r.getDouble(), g.getDouble(), b.getDouble());
		}
	}

	/**
	 * TODO: Add description
	 * <p>
	 * Original content from {@code JED_OLE.pas}:
	 * 
	 * <pre>
	 * Procedure SetRGB(r,g,b:double);
	 * </pre>
	 * 
	 * @param r
	 *            TODO
	 * @param g
	 *            TODO
	 * @param b
	 *            TODO
	 */
	public void setRGB(double r, double g, double b) {
		proc("SetRGB", r, g, b);
	}

	/**
	 * TODO: Add description
	 * <p>
	 * Original content from {@code JED_OLE.pas}:
	 * 
	 * <pre>
	 * Procedure GetIntensity(var white,rgb:double);
	 * </pre>
	 * 
	 * @return TODO: Add description
	 */
	public LightIntensity getIntensity() {
		try (ByRefVariants variants = allocateDoubleByRefVariants(2)) {
			Variant white = variants.get(0);
			Variant rgb = variants.get(1);
			proc("GetIntensity", white, rgb);
			return new LightIntensity(white.getDouble(), rgb.getDouble());
		}
	}

	/**
	 * TODO: Add description
	 * <p>
	 * Original content from {@code JED_OLE.pas}:
	 * 
	 * <pre>
	 * Procedure SetIntensity(white,rgb:double);
	 * </pre>
	 * 
	 * @param white
	 *            TODO
	 * @param rgb
	 *            TODO
	 */
	public void setIntensity(double white, double rgb) {
		proc("SetIntensity", white, rgb);
	}

	/**
	 * TODO: Add description
	 * <p>
	 * Original content from {@code JED_OLE.pas}:
	 * 
	 * <pre>
	 * Property R:double read GetR;
	 * </pre>
	 * 
	 * @return TODO: Add description
	 */
	public double getR() {
		return get("R").getDouble();
	}

	/**
	 * TODO: Add description
	 * <p>
	 * Original content from {@code JED_OLE.pas}:
	 * 
	 * <pre>
	 * Property G:double read GetG;
	 * </pre>
	 * 
	 * @return TODO: Add description
	 */
	public double getG() {
		return get("G").getDouble();
	}

	/**
	 * TODO: Add description
	 * <p>
	 * Original content from {@code JED_OLE.pas}:
	 * 
	 * <pre>
	 * Property B:double read GetB;
	 * </pre>
	 * 
	 * @return TODO: Add description
	 */
	public double getB() {
		return get("B").getDouble();
	}

	/**
	 * TODO: Add description
	 * <p>
	 * Original content from {@code JED_OLE.pas}:
	 * 
	 * <pre>
	 * Property X:double read GetX;
	 * </pre>
	 * 
	 * @return TODO: Add description
	 */
	public double getX() {
		return get("X").getDouble();
	}

	/**
	 * TODO: Add description
	 * <p>
	 * Original content from {@code JED_OLE.pas}:
	 * 
	 * <pre>
	 * Property Y:double read GetY;
	 * </pre>
	 * 
	 * @return TODO: Add description
	 */
	public double getY() {
		return get("Y").getDouble();
	}

	/**
	 * TODO: Add description
	 * <p>
	 * Original content from {@code JED_OLE.pas}:
	 * 
	 * <pre>
	 * Property Z:double read GetZ;
	 * </pre>
	 * 
	 * @return TODO: Add description
	 */
	public double getZ() {
		return get("Z").getDouble();
	}

	/**
	 * TODO: Add description
	 * <p>
	 * Original content from {@code JED_OLE.pas}:
	 * 
	 * <pre>
	 * Property Intensity:double read GetInt;
	 * </pre>
	 * 
	 * @return TODO: Add description
	 */
	public double getInt() {
		return get("Intensity").getDouble();
	}

	/**
	 * TODO: Add description
	 * <p>
	 * Original content from {@code JED_OLE.pas}:
	 * 
	 * <pre>
	 * Property RGBIntensity:double read GetRGBInt;
	 * </pre>
	 * 
	 * @return TODO: Add description
	 */
	public double getRGBInt() {
		return get("RGBIntensity").getDouble();
	}

	/**
	 * TODO: Add description
	 * <p>
	 * Original content from {@code JED_OLE.pas}:
	 * 
	 * <pre>
	 * Property Range:double read GetRange write SetRange;
	 * </pre>
	 * 
	 * @return TODO: Add description
	 */
	public double getRange() {
		return get("Range").getDouble();
	}

	/**
	 * TODO: Add description
	 * <p>
	 * Original content from {@code JED_OLE.pas}:
	 * 
	 * <pre>
	 * Property Range:double read GetRange write SetRange;
	 * </pre>
	 * 
	 * @param range
	 *            TODO
	 */
	public void setRange(double range) {
		set("Range", range);
	}

	/**
	 * TODO: Add description
	 * <p>
	 * Original content from {@code JED_OLE.pas}:
	 * 
	 * <pre>
	 * Property Layer:integer read GetLayer write SetLayer;
	 * </pre>
	 * 
	 * @return TODO: Add description
	 */
	public int getLayer() {
		return get("Layer").getInt();
	}

	/**
	 * TODO: Add description
	 * <p>
	 * Original content from {@code JED_OLE.pas}:
	 * 
	 * <pre>
	 * Property Layer:integer read GetLayer write SetLayer;
	 * </pre>
	 * 
	 * @param layer
	 *            TODO
	 */
	public void setLayer(int layer) {
		set("Layer", layer);
	}

	/**
	 * TODO: Add description
	 * <p>
	 * Original content from {@code JED_OLE.pas}:
	 * 
	 * <pre>
	 * Property Flags:integer read GetFlags write SetFlags;
	 * </pre>
	 * 
	 * @return TODO: Add description
	 */
	public int getFlags() {
		return get("Flags").getInt();
	}

	/**
	 * TODO: Add description
	 * <p>
	 * Original content from {@code JED_OLE.pas}:
	 * 
	 * <pre>
	 * Property Flags:integer read GetFlags write SetFlags;
	 * </pre>
	 * 
	 * @param flags
	 *            TODO
	 */
	public void setFlags(int flags) {
		set("Flags", flags);
	}

}
