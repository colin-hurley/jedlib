package net.jkhub.jedlib.automation;

/**
 * This class represents a 3D bounding box for a thing or template. The box is
 * formed by specifying two position vectors at diagonally opposite corners of a
 * rectangular prism. The box is not required to be symmetric around the origin
 * position (0/0/0).
 */
public final class BoundingBox {

	/**
	 * The first corner of the bounding box.
	 */
	private Vector position1;

	/**
	 * The second corner of the bounding box.
	 */
	private Vector position2;

	/**
	 * Construct a new instance and initialize fields to zero.
	 */
	public BoundingBox() {
		this(new Vector(), new Vector());
	}

	/**
	 * Construct a new instance and initialize fields to the specified values.
	 * 
	 * @param position1
	 *            the first corner of the bounding box
	 * @param position2
	 *            the second corner of the bounding box
	 * @throws NullPointerException
	 *             if any value is null
	 */
	public BoundingBox(Vector position1, Vector position2) {
		setPosition1(position1);
		setPosition2(position2);
	}

	/**
	 * @return the first corner of the bounding box
	 */
	public Vector getPosition1() {
		return position1;
	}

	/**
	 * @param position1
	 *            the first corner of the bounding box to set
	 */
	public void setPosition1(Vector position1) {
		this.position1 = position1;
	}

	/**
	 * @return the second corner of the bounding box
	 */
	public Vector getPosition2() {
		return position2;
	}

	/**
	 * @param position2
	 *            the second corner of the bounding box to set
	 */
	public void setPosition2(Vector position2) {
		this.position2 = position2;
	}

	@Override
	public String toString() {
		return "BoundingBox [position1=" + position1 + ", position2=" + position2 + "]";
	}

}
