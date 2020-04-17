package net.jkhub.jedlib.automation;

import java.util.Objects;

/**
 * This class represents a name-value pair for a thing.
 */
public final class ThingProperty {

	/**
	 * The name of the property.
	 */
	private String name;

	/**
	 * The value of the property.
	 */
	private String value;

	/**
	 * Construct a new instance and initialize fields to an empty string.
	 */
	public ThingProperty() {
		this("", "");
	}

	/**
	 * Construct a new instance and initialize fields to the specified values.
	 * 
	 * @param name
	 *            the name
	 * @param value
	 *            the value
	 * @throws NullPointerException
	 *             if any value is null
	 */
	public ThingProperty(String name, String value) {
		setName(name);
		setValue(value);
	}

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name
	 *            the name to set
	 * @throws NullPointerException
	 *             if the value is null
	 */
	public void setName(String name) {
		this.name = Objects.requireNonNull(name, "name must not be null");
	}

	/**
	 * @return the value
	 */
	public String getValue() {
		return value;
	}

	/**
	 * @param value
	 *            the value to set
	 * @throws NullPointerException
	 *             if the value is null
	 */
	public void setValue(String value) {
		this.value = Objects.requireNonNull(value, "value must not be null");
	}

	@Override
	public String toString() {
		return "ThingProperty [name=" + name + ", value=" + value + "]";
	}

}
