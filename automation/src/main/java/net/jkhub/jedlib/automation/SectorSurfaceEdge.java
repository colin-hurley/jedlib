package net.jkhub.jedlib.automation;

/**
 * This class identifies an edge by its surface-scoped index.
 */
public final class SectorSurfaceEdge {

	/**
	 * The level-wide sector index.
	 */
	private int sectorIndex;

	/**
	 * The sector-scoped surface index.
	 */
	private int surfaceIndex;

	/**
	 * The surface-scoped edge index.
	 */
	private int edgeIndex;

	/**
	 * Construct a new instance and initialize fields to -1.
	 */
	public SectorSurfaceEdge() {
		this(-1, -1, -1);
	}

	/**
	 * Construct a new instance and initialize fields to the specified values.
	 * 
	 * @param sectorIndex
	 *            the sector index
	 * @param surfaceIndex
	 *            the surface index
	 * @param edgeIndex
	 *            the edge index
	 */
	public SectorSurfaceEdge(int sectorIndex, int surfaceIndex, int edgeIndex) {
		this.sectorIndex = sectorIndex;
		this.surfaceIndex = surfaceIndex;
		this.edgeIndex = edgeIndex;
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

	/**
	 * @return the edge index
	 */
	public int getEdgeIndex() {
		return edgeIndex;
	}

	/**
	 * @param edgeIndex
	 *            the edge index to set
	 */
	public void setEdgeIndex(int edgeIndex) {
		this.edgeIndex = edgeIndex;
	}

	@Override
	public String toString() {
		return "SectorSurfaceEdge [sectorIndex=" + sectorIndex + ", surfaceIndex=" + surfaceIndex + ", edgeIndex="
				+ edgeIndex + "]";
	}

}
