package net.jkhub.jedlib.automation;

/**
 * This class identifies a frame by its thing-scoped index.
 */
public final class ThingFrame {

	/**
	 * The level-wide thing index.
	 */
	private int thingIndex;

	/**
	 * The thing-scoped frame index.
	 */
	private int frameIndex;

	/**
	 * Construct a new instance and initialize fields to -1.
	 */
	public ThingFrame() {
		this(-1, -1);
	}

	/**
	 * Construct a new instance and initialize fields to the specified values.
	 * 
	 * @param thingIndex
	 *            the thing index
	 * @param frameIndex
	 *            the frame index
	 */
	public ThingFrame(int thingIndex, int frameIndex) {
		this.thingIndex = thingIndex;
		this.frameIndex = frameIndex;
	}

	/**
	 * @return the thing index
	 */
	public int getThingIndex() {
		return thingIndex;
	}

	/**
	 * @param thingIndex
	 *            the thing index to set
	 */
	public void setThingIndex(int thingIndex) {
		this.thingIndex = thingIndex;
	}

	/**
	 * @return the frame index
	 */
	public int getFrameIndex() {
		return frameIndex;
	}

	/**
	 * @param frameIndex
	 *            the frame index to set
	 */
	public void setFrameIndex(int frameIndex) {
		this.frameIndex = frameIndex;
	}

	@Override
	public String toString() {
		return "ThingFrame [thingIndex=" + thingIndex + ", frameIndex=" + frameIndex + "]";
	}

}
