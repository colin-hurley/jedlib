package net.jkhub.jedlib.automation;

/**
 * This class represents the various types of flags that a surface may have.
 */
public final class SurfaceFlags {

	/**
	 * The adjoin flags for the surface.
	 */
	private int adjoinFlags;

	/**
	 * The surface flags for the surface.
	 */
	private int surfaceFlags;

	/**
	 * The face flags for the surface.
	 */
	private int faceFlags;

	/**
	 * Construct a new instance and initialize fields to zero.
	 */
	public SurfaceFlags() {
		this(0x0, 0x0, 0x0);
	}

	/**
	 * Construct a new instance and initialize fields to the specified values.
	 * 
	 * @param adjoinFlags
	 *            the adjoin flags
	 * @param surfaceFlags
	 *            the surface flags
	 * @param faceFlags
	 *            the face flags
	 */
	public SurfaceFlags(int adjoinFlags, int surfaceFlags, int faceFlags) {
		this.adjoinFlags = adjoinFlags;
		this.surfaceFlags = surfaceFlags;
		this.faceFlags = faceFlags;
	}

	/**
	 * @return the adjoin flags
	 */
	public int getAdjoinFlags() {
		return adjoinFlags;
	}

	/**
	 * @param adjoinFlags
	 *            the adjoin flags to set
	 */
	public void setAdjoinFlags(int adjoinFlags) {
		this.adjoinFlags = adjoinFlags;
	}

	/**
	 * @return the surface flags
	 */
	public int getSurfaceFlags() {
		return surfaceFlags;
	}

	/**
	 * @param surfaceFlags
	 *            the surface flags to set
	 */
	public void setSurfaceFlags(int surfaceFlags) {
		this.surfaceFlags = surfaceFlags;
	}

	/**
	 * @return the face flags
	 */
	public int getFaceFlags() {
		return faceFlags;
	}

	/**
	 * @param faceFlags
	 *            the face flags to set
	 */
	public void setFaceFlags(int faceFlags) {
		this.faceFlags = faceFlags;
	}

	@Override
	public String toString() {
		return "SurfaceFlags [adjoinFlags=" + Integer.toHexString(adjoinFlags) + ", surfaceFlags="
				+ Integer.toHexString(surfaceFlags) + ", faceFlags=" + Integer.toHexString(faceFlags) + "]";
	}

}
