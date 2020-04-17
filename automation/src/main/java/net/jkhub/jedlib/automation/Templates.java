package net.jkhub.jedlib.automation;

import org.eclipse.swt.ole.win32.OleAutomation;
import org.eclipse.swt.ole.win32.Variant;

/**
 * This class represents the list of templates that may be used in a level.
 * <p>
 * This class corresponds to {@code TOLETemplates} from {@code JED_OLE.pas}.
 */
// {0.85}
public final class Templates extends OleObject {

	Templates(OleAutomation automation) {
		super(automation);
	}

	// Public body

	// From JED_OLE.pas:

	/**
	 * TODO: Add description
	 * <p>
	 * Original content from {@code JED_OLE.pas}:
	 * 
	 * <pre>
	 * Procedure ClearTemplates;
	 * </pre>
	 */
	public void clearTemplates() {
		proc("ClearTemplates");
	}

	/**
	 * TODO: Add description
	 * <p>
	 * Original content from {@code JED_OLE.pas}:
	 * 
	 * <pre>
	 * Function NTemplates:integer;
	 * </pre>
	 * 
	 * @return TODO: Add description
	 */
	public int nTemplates() {
		return func("NTemplates").getInt();
	}

	/**
	 * TODO: Add description
	 * <p>
	 * Original content from {@code JED_OLE.pas}:
	 * 
	 * <pre>
	 * Function GetTemplateName(n:integer):String;
	 * </pre>
	 * 
	 * @param n
	 *            TODO
	 * @return TODO: Add description
	 */
	public String getTemplateName(int n) {
		return func("GetTemplateName", n).getString();
	}

	/**
	 * TODO: Add description
	 * <p>
	 * Original content from {@code JED_OLE.pas}:
	 * 
	 * <pre>
	 * Function GetTemplateParent(n:integer):string;
	 * </pre>
	 * 
	 * @param n
	 *            TODO
	 * @return TODO: Add description
	 */
	public String getTemplateParent(int n) {
		return func("GetTemplateParent", n).getString();
	}

	/**
	 * TODO: Add description
	 * <p>
	 * Original content from {@code JED_OLE.pas}:
	 * 
	 * <pre>
	 * Function GetTemplateValues(n:integer):String;
	 * </pre>
	 * 
	 * @param n
	 *            TODO
	 * @return TODO: Add description
	 */
	public String getTemplateValues(int n) {
		return func("GetTemplateValues", n).getString();
	}

	/**
	 * TODO: Add description
	 * <p>
	 * Original content from {@code JED_OLE.pas}:
	 * 
	 * <pre>
	 * Function GetTemplateDescription(n:integer):String;
	 * </pre>
	 * 
	 * @param n
	 *            TODO
	 * @return TODO: Add description
	 */
	public String getTemplateDescription(int n) {
		return func("GetTemplateDescription", n).getString();
	}

	/**
	 * TODO: Add description
	 * <p>
	 * Original content from {@code JED_OLE.pas}:
	 * 
	 * <pre>
	 * Procedure SetTemplateDescription(n:integer;const desc:string);
	 * </pre>
	 * 
	 * @param n
	 *            TODO
	 * @param desc
	 *            TODO
	 */
	public void setTemplateDescription(int n, String desc) {
		proc("SetTemplateDescription", n, desc);
	}

	/**
	 * TODO: Add description
	 * <p>
	 * Original content from {@code JED_OLE.pas}:
	 * 
	 * <pre>
	 * Procedure GetTemplateBBox(n:integer;var x1,y1,z1,x2,y2,z2:double);
	 * </pre>
	 * 
	 * @param n
	 *            TODO
	 * @return TODO: Add description
	 */
	public BoundingBox getTemplateBBox(int n) {
		try (ByRefVariants variants = allocateDoubleByRefVariants(6)) {
			Variant x1 = variants.get(0);
			Variant y1 = variants.get(1);
			Variant z1 = variants.get(2);
			Variant x2 = variants.get(3);
			Variant y2 = variants.get(4);
			Variant z2 = variants.get(5);
			proc("GetTemplateBBox", n, x1, y1, z1, x2, y2, z2);
			Vector position1 = new Vector(x1.getDouble(), y1.getDouble(), z1.getDouble());
			Vector position2 = new Vector(x2.getDouble(), y2.getDouble(), z2.getDouble());
			return new BoundingBox(position1, position2);
		}
	}

	/**
	 * TODO: Add description
	 * <p>
	 * Original content from {@code JED_OLE.pas}:
	 * 
	 * <pre>
	 * Function GetTemplateBBoxEx(n:integer;what:integer):double;
	 * </pre>
	 * 
	 * @param n
	 *            TODO
	 * @param what
	 *            TODO
	 * @return TODO: Add description
	 */
	public double getTemplateBBoxEx(int n, int what) {
		return func("GetTemplateBBoxEx", n, what).getDouble();
	}

	/**
	 * TODO: Add description
	 * <p>
	 * Original content from {@code JED_OLE.pas}:
	 * 
	 * <pre>
	 * Procedure SetTemplateBBox(n:integer;x1,y1,z1,x2,y2,z2:double);
	 * </pre>
	 * 
	 * @param n
	 *            TODO
	 * @param x1
	 *            TODO
	 * @param y1
	 *            TODO
	 * @param z1
	 *            TODO
	 * @param x2
	 *            TODO
	 * @param y2
	 *            TODO
	 * @param z2
	 *            TODO
	 */
	public void setTemplateBBox(int n, double x1, double y1, double z1, double x2, double y2, double z2) {
		proc("SetTemplateBBox", n, x1, y1, z1, x2, y2, z2);
	}

	/**
	 * TODO: Add description
	 * <p>
	 * Original content from {@code JED_OLE.pas}:
	 * 
	 * <pre>
	 * Procedure DeleteTemplate(n:integer);
	 * </pre>
	 * 
	 * @param n
	 *            TODO
	 */
	public void deleteTemplate(int n) {
		proc("DeleteTemplate", n);
	}

	/**
	 * TODO: Add description
	 * <p>
	 * Original content from {@code JED_OLE.pas}:
	 * 
	 * <pre>
	 * Function AddTemplate(const name,parent,values:string):integer;
	 * </pre>
	 * 
	 * @param name
	 *            TODO
	 * @param parent
	 *            TODO
	 * @param values
	 *            TODO
	 * @return TODO: Add description
	 */
	public int addTemplate(String name, String parent, String values) {
		return func("AddTemplate", name, parent, values).getInt();
	}

	/**
	 * TODO: Add description
	 * <p>
	 * Original content from {@code JED_OLE.pas}:
	 * 
	 * <pre>
	 * Function FindTemplate(const name:string):integer;
	 * </pre>
	 * 
	 * @param name
	 *            TODO
	 * @return TODO: Add description
	 */
	public int findTemplate(String name) {
		return func("FindTemplate", name).getInt();
	}

	/**
	 * TODO: Add description
	 * <p>
	 * Original content from {@code JED_OLE.pas}:
	 * 
	 * <pre>
	 * Procedure LoadTemplates(const filename:string);
	 * </pre>
	 * 
	 * @param filename
	 *            TODO
	 */
	public void loadTemplates(String filename) {
		proc("LoadTemplates", filename);
	}

	/**
	 * TODO: Add description
	 * <p>
	 * Original content from {@code JED_OLE.pas}:
	 * 
	 * <pre>
	 * Procedure SaveTemplates(const filename:string);
	 * </pre>
	 * 
	 * @param filename
	 *            TODO
	 */
	public void saveTemplates(String filename) {
		proc("SaveTemplates", filename);
	}

}
