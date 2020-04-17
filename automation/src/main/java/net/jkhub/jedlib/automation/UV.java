package net.jkhub.jedlib.automation;

/**
 * This class represents coordinates for UV mapping of 2D textures.
 */
public final class UV {

	/**
	 * The U coordinate.
	 */
	private double u;

	/**
	 * The V coordinate.
	 */
	private double v;

	/**
	 * Construct a new instance and initialize fields to zero.
	 */
	public UV() {
		this(0.0, 0.0);
	}

	/**
	 * Construct a new instance and initialize fields to the specified values.
	 * 
	 * @param u
	 *            the U coordinate
	 * @param v
	 *            the V coordinate
	 */
	public UV(double u, double v) {
		this.u = u;
		this.v = v;
	}

	/**
	 * @return the U coordinate
	 */
	public double getU() {
		return u;
	}

	/**
	 * @param u
	 *            the U coordinate to set
	 */
	public void setU(double u) {
		this.u = u;
	}

	/**
	 * @return the V coordinate
	 */
	public double getV() {
		return v;
	}

	/**
	 * @param v
	 *            the V coordinate to set
	 */
	public void setV(double v) {
		this.v = v;
	}

	@Override
	public String toString() {
		return "UV [u=" + u + ", v=" + v + "]";
	}

}
