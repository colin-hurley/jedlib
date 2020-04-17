package net.jkhub.jedlib.automation;

/**
 * This class specifies a rotation with pitch, yaw, and roll components to
 * indicate how something is oriented in 3D space. All components normally fall
 * between 0 and 360 degreees, but larger values and negative values are also
 * permitted.
 */
public final class Orientation {

	/**
	 * The pitch component (rotation about the X axis).
	 */
	private double pitch;

	/**
	 * The yaw component (rotation about the Z axis).
	 */
	private double yaw;

	/**
	 * The roll component (rotation about the Y axis).
	 */
	private double roll;

	/**
	 * Construct a new instance and initialize fields to zero.
	 */
	public Orientation() {
		this(0.0, 0.0, 0.0);
	}

	/**
	 * Construct a new instance and initialize fields to the specified values.
	 * 
	 * @param pitch
	 *            the pitch component
	 * @param yaw
	 *            the yaw component
	 * @param roll
	 *            the roll component
	 */
	public Orientation(double pitch, double yaw, double roll) {
		this.pitch = pitch;
		this.yaw = yaw;
		this.roll = roll;
	}

	/**
	 * @return the pitch component
	 */
	public double getPitch() {
		return pitch;
	}

	/**
	 * @param pitch
	 *            the pitch component to set
	 */
	public void setPitch(double pitch) {
		this.pitch = pitch;
	}

	/**
	 * @return the yaw component
	 */
	public double getYaw() {
		return yaw;
	}

	/**
	 * @param yaw
	 *            the yaw component to set
	 */
	public void setYaw(double yaw) {
		this.yaw = yaw;
	}

	/**
	 * @return the roll component
	 */
	public double getRoll() {
		return roll;
	}

	/**
	 * @param roll
	 *            the roll component to set
	 */
	public void setRoll(double roll) {
		this.roll = roll;
	}

	@Override
	public String toString() {
		return "Orientation [pitch=" + pitch + ", yaw=" + yaw + ", roll=" + roll + "]";
	}

}
