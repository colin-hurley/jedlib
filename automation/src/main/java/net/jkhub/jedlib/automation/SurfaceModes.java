package net.jkhub.jedlib.automation;

/**
 * This class represents the various modes that a surface may have.
 */
public final class SurfaceModes {

	/**
	 * The geometry mode for the surface.
	 */
	private int geometryMode;

	/**
	 * The light mode for the surface.
	 */
	private int lightMode;

	/**
	 * The texture mode for the surface.
	 */
	private int textureMode;

	/**
	 * Construct a new instance and initialize fields to zero.
	 */
	public SurfaceModes() {
		this(0, 0, 0);
	}

	/**
	 * Construct a new instance and initialize fields to the specified values.
	 * 
	 * @param geometryMode
	 *            the geometry mode
	 * @param lightMode
	 *            the light mode
	 * @param textureMode
	 *            the texture mode
	 */
	public SurfaceModes(int geometryMode, int lightMode, int textureMode) {
		this.geometryMode = geometryMode;
		this.lightMode = lightMode;
		this.textureMode = textureMode;
	}

	/**
	 * @return the geometry mode
	 */
	public int getGeometryMode() {
		return geometryMode;
	}

	/**
	 * @param geometryMode
	 *            the geometry mode to set
	 */
	public void setGeometryMode(int geometryMode) {
		this.geometryMode = geometryMode;
	}

	/**
	 * @return the light mode
	 */
	public int getLightMode() {
		return lightMode;
	}

	/**
	 * @param lightMode
	 *            the light mode to set
	 */
	public void setLightMode(int lightMode) {
		this.lightMode = lightMode;
	}

	/**
	 * @return the texture mode
	 */
	public int getTextureMode() {
		return textureMode;
	}

	/**
	 * @param textureMode
	 *            the texture mode to set
	 */
	public void setTextureMode(int textureMode) {
		this.textureMode = textureMode;
	}

	@Override
	public String toString() {
		return "SurfaceModes [geometryMode=" + geometryMode + ", lightMode=" + lightMode + ", textureMode="
				+ textureMode + "]";
	}

}
