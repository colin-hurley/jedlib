package net.jkhub.jedlib.automation;

/**
 * This class identifies a surface by its sector-scoped index.
 */
public final class SectorSurface {

	/**
	 * The level-wide sector index.
	 */
	private int sectorIndex;

	/**
	 * The sector-scoped surface index.
	 */
	private int surfaceIndex;

	/**
	 * Construct a new instance and initialize fields to -1.
	 */
	public SectorSurface() {
		this(-1, -1);
	}

	/**
	 * Construct a new instance and initialize fields to the specified values.
	 * 
	 * @param sectorIndex
	 *            the sector index
	 * @param surfaceIndex
	 *            the surface index
	 */
	public SectorSurface(int sectorIndex, int surfaceIndex) {
		this.sectorIndex = sectorIndex;
		this.surfaceIndex = surfaceIndex;
	}

	/**
	 * @return the sector index
	 */
	public int getSectorIndex() {
		return sectorIndex;
	}

	/**
	 * @param sectorIndex
	 *            the sector index to set
	 */
	public void setSectorIndex(int sectorIndex) {
		this.sectorIndex = sectorIndex;
	}

	/**
	 * @return the surface index
	 */
	public int getSurfaceIndex() {
		return surfaceIndex;
	}

	/**
	 * @param surfaceIndex
	 *            the surface index to set
	 */
	public void setSurfaceIndex(int surfaceIndex) {
		this.surfaceIndex = surfaceIndex;
	}

	@Override
	public String toString() {
		return "SectorSurface [sectorIndex=" + sectorIndex + ", surfaceIndex=" + surfaceIndex + "]";
	}

}
