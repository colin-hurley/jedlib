package net.jkhub.jedlib.automation;

/**
 * This class represents intensity values for a light. All intensities should be
 * in the 0-1 range (inclusive).
 */
public final class LightIntensity {

	/**
	 * The intensity of the light's white component.
	 */
	private double white;

	/**
	 * The intensity of the light's color (RGB) component.
	 */
	private double rgb;

	/**
	 * Construct a new instance and initialize fields to zero.
	 */
	public LightIntensity() {
		this(0.0, 0.0);
	}

	/**
	 * Construct a new instance and initialize fields to the specified values.
	 * 
	 * @param white
	 *            the intensity of the white component
	 * @param rgb
	 *            the intensity of the color (RGB) component
	 */
	public LightIntensity(double white, double rgb) {
		this.white = white;
		this.rgb = rgb;
	}

	/**
	 * @return the white intensity
	 */
	public double getWhite() {
		return white;
	}

	/**
	 * @param white
	 *            the white intensity to set
	 */
	public void setWhite(double white) {
		this.white = white;
	}

	/**
	 * @return the RGB intensity
	 */
	public double getRgb() {
		return rgb;
	}

	/**
	 * @param rgb
	 *            the RGB intensity to set
	 */
	public void setRgb(double rgb) {
		this.rgb = rgb;
	}

	@Override
	public String toString() {
		return "LightIntensity [white=" + white + ", rgb=" + rgb + "]";
	}

}
