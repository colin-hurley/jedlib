package net.jkhub.jedlib.automation;

/**
 * This class identifies a vertex by its sector-scoped index.
 */
public final class SectorVertex {

	/**
	 * The level-wide sector index.
	 */
	private int sectorIndex;

	/**
	 * The sector-scoped vertex index.
	 */
	private int vertexIndex;

	/**
	 * Construct a new instance and initialize fields to -1.
	 */
	public SectorVertex() {
		this(-1, -1);
	}

	/**
	 * Construct a new instance and initialize fields to the specified values.
	 * 
	 * @param sectorIndex
	 *            the sector index
	 * @param vertexIndex
	 *            the vertex index
	 */
	public SectorVertex(int sectorIndex, int vertexIndex) {
		this.sectorIndex = sectorIndex;
		this.vertexIndex = vertexIndex;
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
	 * @return the vertex index
	 */
	public int getVertexIndex() {
		return vertexIndex;
	}

	/**
	 * @param vertexIndex
	 *            the vertex index to set
	 */
	public void setVertexIndex(int vertexIndex) {
		this.vertexIndex = vertexIndex;
	}

	@Override
	public String toString() {
		return "SectorVertex [sectorIndex=" + sectorIndex + ", vertexIndex=" + vertexIndex + "]";
	}

}
