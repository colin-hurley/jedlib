package net.jkhub.jedlib.automation;

import java.util.Objects;

/**
 * This class describes the direction of the X, Y, and Z axes.
 */
public final class Axes {

	/**
	 * The direction of the X axis. Cannot be null.
	 */
	private Vector x;

	/**
	 * The direction of the Y axis. Cannot be null.
	 */
	private Vector y;

	/**
	 * The direction of the Z axis. Cannot be null.
	 */
	private Vector z;

	/**
	 * Construct a new instance and initialize fields to zero.
	 */
	public Axes() {
		this(new Vector(), new Vector(), new Vector());
	}

	/**
	 * Construct a new instance and initialize fields to the specified values.
	 * 
	 * @param x
	 *            the X axis
	 * @param y
	 *            the Y axis
	 * @param z
	 *            the Z axis
	 * @throws NullPointerException
	 *             if any value is null
	 */
	public Axes(Vector x, Vector y, Vector z) {
		setX(x);
		setY(y);
		setZ(z);
	}

	/**
	 * @return the X axis
	 */
	public Vector getX() {
		return x;
	}

	/**
	 * @param x
	 *            the X axis to set
	 * @throws NullPointerException
	 *             if the value is null
	 */
	public void setX(Vector x) {
		this.x = Objects.requireNonNull(x, "x must not be null");
	}

	/**
	 * @return the y axis
	 */
	public Vector getY() {
		return y;
	}

	/**
	 * @param y
	 *            the Y axis to set
	 * @throws NullPointerException
	 *             if the value is null
	 */
	public void setY(Vector y) {
		this.y = Objects.requireNonNull(y, "y must not be null");
	}

	/**
	 * @return the Z axis
	 */
	public Vector getZ() {
		return z;
	}

	/**
	 * @param z
	 *            the Z axis to set
	 * @throws NullPointerException
	 *             if the value is null
	 */
	public void setZ(Vector z) {
		this.z = Objects.requireNonNull(z, "z must not be null");
	}

	@Override
	public String toString() {
		return "Axes [x=" + x + ", y=" + y + ", z=" + z + "]";
	}

}
