package net.jkhub.jedlib.automation;

/**
 * This class specifies a position or direction in 3D space.
 */
public final class Vector {

	/**
	 * The X coordinate.
	 */
	private double x;

	/**
	 * The Y coordinate.
	 */
	private double y;

	/**
	 * The Z coordinate.
	 */
	private double z;

	/**
	 * Construct a new instance and initialize fields to zero.
	 */
	public Vector() {
		this(0.0, 0.0, 0.0);
	}

	/**
	 * Construct a new instance and initialize fields to the specified values.
	 * 
	 * @param x
	 *            the x coordinate
	 * @param y
	 *            the x coordinate
	 * @param z
	 *            the x coordinate
	 */
	public Vector(double x, double y, double z) {
		this.x = x;
		this.y = y;
		this.z = z;
	}

	/**
	 * @return the X coordinate
	 */
	public double getX() {
		return x;
	}

	/**
	 * @param x
	 *            the X coordinate to set
	 */
	public void setX(double x) {
		this.x = x;
	}

	/**
	 * @return the Y coordinate
	 */
	public double getY() {
		return y;
	}

	/**
	 * @param y
	 *            the Y coordinate to set
	 */
	public void setY(double y) {
		this.y = y;
	}

	/**
	 * @return the Z coordinate
	 */
	public double getZ() {
		return z;
	}

	/**
	 * @param z
	 *            the Z coordinate to set
	 */
	public void setZ(double z) {
		this.z = z;
	}

	@Override
	public String toString() {
		return "Vector [x=" + x + ", y=" + y + ", z=" + z + "]";
	}

}
