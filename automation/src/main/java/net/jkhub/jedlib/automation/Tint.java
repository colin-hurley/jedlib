package net.jkhub.jedlib.automation;

/**
 * This class specifies a color tint with red, green, and blue components. All
 * components should be in the 0-1 range (inclusive).
 */
public final class Tint {

	/**
	 * The red component.
	 */
	private double red;

	/**
	 * The green component.
	 */
	private double green;

	/**
	 * The blue component.
	 */
	private double blue;

	/**
	 * Construct a new instance and initialize fields to zero.
	 */
	public Tint() {
		this(0.0, 0.0, 0.0);
	}

	/**
	 * Construct a new instance and initialize fields to the specified values.
	 * 
	 * @param red
	 *            the red component
	 * @param green
	 *            the green component
	 * @param blue
	 *            the blue component
	 */
	public Tint(double red, double green, double blue) {
		this.red = red;
		this.green = green;
		this.blue = blue;
	}

	/**
	 * @return the red component
	 */
	public double getRed() {
		return red;
	}

	/**
	 * @param red
	 *            the red component to set
	 */
	public void setRed(double red) {
		this.red = red;
	}

	/**
	 * @return the green component
	 */
	public double getGreen() {
		return green;
	}

	/**
	 * @param green
	 *            the green component to set
	 */
	public void setGreen(double green) {
		this.green = green;
	}

	/**
	 * @return the blue component
	 */
	public double getBlue() {
		return blue;
	}

	/**
	 * @param blue
	 *            the blue component to set
	 */
	public void setBlue(double blue) {
		this.blue = blue;
	}

	@Override
	public String toString() {
		return "Tint [red=" + red + ", green=" + green + ", blue=" + blue + "]";
	}

}
