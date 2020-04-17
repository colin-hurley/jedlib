package net.jkhub.jedlib.automation;

import org.eclipse.swt.ole.win32.OleAutomation;
import org.eclipse.swt.ole.win32.Variant;

/**
 * This class represents a thing placed in a level.
 * <p>
 * This class corresponds to {@code TOLEThing} from {@code JED_OLE.pas}.
 */
public final class Thing extends OleObject {

	Thing(OleAutomation automation) {
		super(automation);
	}

	// Public body

	/**
	 * TODO: Add description
	 * <p>
	 * Original content from {@code JED_OLE.pas}:
	 * 
	 * <pre>
	 * Procedure Release;
	 * </pre>
	 */
	public void release() {
		proc("Release");
	}

	/**
	 * TODO: Add description
	 * <p>
	 * Original content from {@code JED_OLE.pas}:
	 * 
	 * <pre>
	 * Procedure Update;
	 * </pre>
	 */
	public void update() {
		proc("Update");
	}

	/**
	 * TODO: Add description
	 * <p>
	 * Original content from {@code JED_OLE.pas}:
	 * 
	 * <pre>
	 * Procedure GetXYZ(var x,y,z:double);
	 * </pre>
	 * 
	 * @return TODO: Add description
	 */
	public Vector getXYZ() {
		try (ByRefVariants variants = allocateDoubleByRefVariants(3)) {
			Variant x = variants.get(0);
			Variant y = variants.get(1);
			Variant z = variants.get(2);
			proc("GetXYZ", x, y, z);
			return new Vector(x.getDouble(), y.getDouble(), z.getDouble());
		}
	}

	/**
	 * TODO: Add description
	 * <p>
	 * Original content from {@code JED_OLE.pas}:
	 * 
	 * <pre>
	 * Procedure SetXYZ(x,y,z:double);
	 * </pre>
	 * 
	 * @param x
	 *            TODO
	 * @param y
	 *            TODO
	 * @param z
	 *            TODO
	 */
	public void setXYZ(double x, double y, double z) {
		proc("SetXYZ", x, y, z);
	}

	/**
	 * TODO: Add description
	 * <p>
	 * Original content from {@code JED_OLE.pas}:
	 * 
	 * <pre>
	 * Procedure GetOrient(var pch,yaw,rol:double);
	 * </pre>
	 * 
	 * @return TODO: Add description
	 */
	public Orientation getOrient() {
		try (ByRefVariants variants = allocateDoubleByRefVariants(3)) {
			Variant pch = variants.get(0);
			Variant yaw = variants.get(1);
			Variant rol = variants.get(2);
			proc("GetOrient", pch, yaw, rol);
			return new Orientation(pch.getDouble(), yaw.getDouble(), rol.getDouble());
		}
	}

	/**
	 * TODO: Add description
	 * <p>
	 * Original content from {@code JED_OLE.pas}:
	 * 
	 * <pre>
	 * Procedure SetOrient(pch,yaw,rol:double);
	 * </pre>
	 * 
	 * @param pch
	 *            TODO
	 * @param yaw
	 *            TODO
	 * @param rol
	 *            TODO
	 */
	public void setOrient(double pch, double yaw, double rol) {
		proc("SetOrient", pch, yaw, rol);
	}

	/**
	 * TODO: Add description
	 * <p>
	 * Original content from {@code JED_OLE.pas}:
	 * 
	 * <pre>
	 * Procedure GetValue(n:Integer;var name,val:string);
	 * </pre>
	 * 
	 * @param n
	 *            TODO
	 * @return TODO: Add description
	 */
	public ThingProperty getValue(int n) {
		try (ByRefVariants variants = allocateStringByRefVariants(2)) {
			Variant name = variants.get(0);
			Variant val = variants.get(1);
			proc("GetValue", n, name, val);
			return new ThingProperty(name.getString(), val.getString());
		}
	}

	/**
	 * TODO: Add description
	 * <p>
	 * Original content from {@code JED_OLE.pas}:
	 * 
	 * <pre>
	 * Procedure SetValue(n:Integer;const name,val:string);
	 * </pre>
	 * 
	 * @param n
	 *            TODO
	 * @param name
	 *            TODO
	 * @param val
	 *            TODO
	 */
	public void setValue(int n, String name, String val) {
		proc("SetValue", n, name, val);
	}

	/**
	 * TODO: Add description
	 * <p>
	 * Original content from {@code JED_OLE.pas}:
	 * 
	 * <pre>
	 * Function GetValueName(n:Integer):String;
	 * </pre>
	 * 
	 * @param n
	 *            TODO
	 * @return TODO: Add description
	 */
	public String getValueName(int n) {
		return func("GetValueName", n).getString();
	}

	/**
	 * TODO: Add description
	 * <p>
	 * Original content from {@code JED_OLE.pas}:
	 * 
	 * <pre>
	 * Function GetValueData(n:integer):string;
	 * </pre>
	 * 
	 * @param n
	 *            TODO
	 * @return TODO: Add description
	 */
	public String getValueData(int n) {
		return func("GetValueData", n).getString();
	}

	/**
	 * TODO: Add description
	 * <p>
	 * Original content from {@code JED_OLE.pas}:
	 * 
	 * <pre>
	 * Function AddValue(const name,val:string):integer;
	 * </pre>
	 * 
	 * @param name
	 *            TODO
	 * @param val
	 *            TODO
	 * @return TODO: Add description
	 */
	public int addValue(String name, String val) {
		return func("AddValue", name, val).getInt();
	}

	/**
	 * TODO: Add description
	 * <p>
	 * Original content from {@code JED_OLE.pas}:
	 * 
	 * <pre>
	 * Procedure InsertValue(n:Integer;const name,val:string);
	 * </pre>
	 * 
	 * @param n
	 *            TODO
	 * @param name
	 *            TODO
	 * @param val
	 *            TODO
	 */
	public void insertValue(int n, String name, String val) {
		proc("InsertValue", n, name, val);
	}

	/**
	 * TODO: Add description
	 * <p>
	 * Original content from {@code JED_OLE.pas}:
	 * 
	 * <pre>
	 * Procedure DeleteValue(n:integer);
	 * </pre>
	 * 
	 * @param n
	 *            TODO
	 */
	public void deleteValue(int n) {
		proc("DeleteValue", n);
	}

	/**
	 * TODO: Add description
	 * <p>
	 * Original content from {@code JED_OLE.pas}:
	 * 
	 * <pre>
	 * Property X:double read GetX;
	 * </pre>
	 * 
	 * @return TODO: Add description
	 */
	public double getX() {
		return get("X").getDouble();
	}

	/**
	 * TODO: Add description
	 * <p>
	 * Original content from {@code JED_OLE.pas}:
	 * 
	 * <pre>
	 * Property Y:double read GetY;
	 * </pre>
	 * 
	 * @return TODO: Add description
	 */
	public double getY() {
		return get("Y").getDouble();
	}

	/**
	 * TODO: Add description
	 * <p>
	 * Original content from {@code JED_OLE.pas}:
	 * 
	 * <pre>
	 * Property Z:double read GetZ;
	 * </pre>
	 * 
	 * @return TODO: Add description
	 */
	public double getZ() {
		return get("Z").getDouble();
	}

	/**
	 * TODO: Add description
	 * <p>
	 * Original content from {@code JED_OLE.pas}:
	 * 
	 * <pre>
	 * Property PCH:double read GetPCH;
	 * </pre>
	 * 
	 * @return TODO: Add description
	 */
	public double getPCH() {
		return get("PCH").getDouble();
	}

	/**
	 * TODO: Add description
	 * <p>
	 * Original content from {@code JED_OLE.pas}:
	 * 
	 * <pre>
	 * Property YAW:double read GetYAW;
	 * </pre>
	 * 
	 * @return TODO: Add description
	 */
	public double getYAW() {
		return get("YAW").getDouble();
	}

	/**
	 * TODO: Add description
	 * <p>
	 * Original content from {@code JED_OLE.pas}:
	 * 
	 * <pre>
	 * Property ROL:double read GetROL;
	 * </pre>
	 * 
	 * @return TODO: Add description
	 */
	public double getROL() {
		return get("ROL").getDouble();
	}

	/**
	 * TODO: Add description
	 * <p>
	 * Original content from {@code JED_OLE.pas}:
	 * 
	 * <pre>
	 * Property NValues:Integer read GetNValues;
	 * </pre>
	 * 
	 * @return TODO: Add description
	 */
	public int getNValues() {
		return get("NValues").getInt();
	}

	/**
	 * TODO: Add description
	 * <p>
	 * Original content from {@code JED_OLE.pas}:
	 * 
	 * <pre>
	 * Property Sector:Integer read GetSec write SetSec;
	 * </pre>
	 * 
	 * @return TODO: Add description
	 */
	public int getSec() {
		return get("Sector").getInt();
	}

	/**
	 * TODO: Add description
	 * <p>
	 * Original content from {@code JED_OLE.pas}:
	 * 
	 * <pre>
	 * Property Sector:Integer read GetSec write SetSec;
	 * </pre>
	 * 
	 * @param sector
	 *            TODO
	 */
	public void setSec(int sector) {
		set("Sector", sector);
	}

	/**
	 * TODO: Add description
	 * <p>
	 * Original content from {@code JED_OLE.pas}:
	 * 
	 * <pre>
	 * Property Template:string read GetName write setName;
	 * </pre>
	 * 
	 * @return TODO: Add description
	 */
	public String getName() {
		return get("Template").getString();
	}

	/**
	 * TODO: Add description
	 * <p>
	 * Original content from {@code JED_OLE.pas}:
	 * 
	 * <pre>
	 * Property Template:string read GetName write setName;
	 * </pre>
	 * 
	 * @param template
	 *            TODO
	 */
	public void setName(String template) {
		set("Template", template);
	}

	/**
	 * TODO: Add description
	 * <p>
	 * Original content from {@code JED_OLE.pas}:
	 * 
	 * <pre>
	 * Property layer:integer read GetLayer write SetLayer;
	 * </pre>
	 * 
	 * @return TODO: Add description
	 */
	public int getLayer() {
		return get("layer").getInt();
	}

	/**
	 * TODO: Add description
	 * <p>
	 * Original content from {@code JED_OLE.pas}:
	 * 
	 * <pre>
	 * Property layer:integer read GetLayer write SetLayer;
	 * </pre>
	 * 
	 * @param layer
	 *            TODO
	 */
	public void setLayer(int layer) {
		set("layer", layer);
	}

}
