package net.jkhub.jedlib.automation;

import org.eclipse.swt.ole.win32.OleAutomation;

/**
 * This class represents a COG script placed in a level.
 * <p>
 * This class corresponds to {@code TOLECOG} from {@code JED_OLE.pas}.
 */
public final class Cog extends OleObject {

	Cog(OleAutomation automation) {
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
	 * Function GetValue(n:Integer):string;
	 * </pre>
	 * 
	 * @param n
	 *            TODO
	 * @return TODO: Add description
	 */
	public String getValue(int n) {
		return func("GetValue", n).getString();
	}

	/**
	 * TODO: Add description
	 * <p>
	 * Original content from {@code JED_OLE.pas}:
	 * 
	 * <pre>
	 * Function SetValue(n:Integer;const val:string):WordBool;
	 * </pre>
	 * 
	 * @param n
	 *            TODO
	 * @param val
	 *            TODO
	 * @return TODO: Add description
	 */
	public boolean setValue(int n, String val) {
		return func("SetValue", n, val).getBoolean();
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
	 * Function GetValueType(n:Integer):String;
	 * </pre>
	 * 
	 * @param n
	 *            TODO
	 * @return TODO: Add description
	 */
	public String getValueType(int n) {
		return func("GetValueType", n).getString();
	}

	/**
	 * TODO: Add description
	 * <p>
	 * Original content from {@code JED_OLE.pas}:
	 * 
	 * <pre>
	 * Procedure SetValueType(n:Integer;vtype:string);
	 * </pre>
	 * 
	 * @param n
	 *            TODO
	 * @param vtype
	 *            TODO
	 */
	public void setValueType(int n, String vtype) {
		proc("SetValueType", n, vtype);
	}

	/**
	 * TODO: Add description
	 * <p>
	 * Original content from {@code JED_OLE.pas}:
	 * 
	 * <pre>
	 * Procedure SetValueName(n:Integer;name:string);
	 * </pre>
	 * 
	 * @param n
	 *            TODO
	 * @param name
	 *            TODO
	 */
	public void setValueName(int n, String name) {
		proc("SetValueName", n, name);
	}

	/**
	 * TODO: Add description
	 * <p>
	 * Original content from {@code JED_OLE.pas}:
	 * 
	 * <pre>
	 * Function AddValue(const name,val,vtype:string):integer;
	 * </pre>
	 * 
	 * @param name
	 *            TODO
	 * @param val
	 *            TODO
	 * @param vtype
	 *            TODO
	 * @return TODO: Add description
	 */
	public int addValue(String name, String val, String vtype) {
		return func("AddValue", name, val, vtype).getInt();
	}

	/**
	 * TODO: Add description
	 * <p>
	 * Original content from {@code JED_OLE.pas}:
	 * 
	 * <pre>
	 * Procedure InsertValue(n:Integer;const name,val,vtype:string);
	 * </pre>
	 * 
	 * @param n
	 *            TODO
	 * @param name
	 *            TODO
	 * @param val
	 *            TODO
	 * @param vtype
	 *            TODO
	 */
	public void insertValue(int n, String name, String val, String vtype) {
		proc("InsertValue", n, name, val, vtype);
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
	 * Property FileName:string read GetName write setName;
	 * </pre>
	 * 
	 * @return TODO: Add description
	 */
	public String getName() {
		return get("FileName").getString();
	}

	/**
	 * TODO: Add description
	 * <p>
	 * Original content from {@code JED_OLE.pas}:
	 * 
	 * <pre>
	 * Property FileName:string read GetName write setName;
	 * </pre>
	 * 
	 * @param fileName
	 *            TODO
	 */
	public void setName(String fileName) {
		set("FileName", fileName);
	}

}
