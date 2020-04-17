package net.jkhub.jedlib.automation;

import org.eclipse.swt.ole.win32.OleAutomation;

/**
 * This class represents a level.
 * <p>
 * This class corresponds to {@code TOLELevel} from {@code JED_OLE.pas}.
 */
public final class Level extends OleObject {

	Level(OleAutomation automation) {
		super(automation);
	}

	// Public body

	/**
	 * TODO: Add description
	 * <p>
	 * Original content from {@code JED_OLE.pas}:
	 * 
	 * <pre>
	 * Function GetSector(n:integer):variant;
	 * </pre>
	 * 
	 * @param n
	 *            TODO
	 * @return TODO: Add description
	 */
	public Sector getSector(int n) {
		OleAutomation automation = func("GetSector", n).getAutomation();
		return new Sector(automation);
	}

	/**
	 * TODO: Add description
	 * <p>
	 * Original content from {@code JED_OLE.pas}:
	 * 
	 * <pre>
	 * Function GetSurface(sc,sf:integer):variant;
	 * </pre>
	 * 
	 * @param sc
	 *            TODO
	 * @param sf
	 *            TODO
	 * @return TODO: Add description
	 */
	public Surface getSurface(int sc, int sf) {
		OleAutomation automation = func("GetSurface", sc, sf).getAutomation();
		return new Surface(automation);
	}

	/**
	 * TODO: Add description
	 * <p>
	 * Original content from {@code JED_OLE.pas}:
	 * 
	 * <pre>
	 * Function GetThing(n:integer):variant;
	 * </pre>
	 * 
	 * @param n
	 *            TODO
	 * @return TODO: Add description
	 */
	public Thing getThing(int n) {
		OleAutomation automation = func("GetThing", n).getAutomation();
		return new Thing(automation);
	}

	/**
	 * TODO: Add description
	 * <p>
	 * Original content from {@code JED_OLE.pas}:
	 * 
	 * <pre>
	 * Function GetLight(n:integer):variant;
	 * </pre>
	 * 
	 * @param n
	 *            TODO
	 * @return TODO: Add description
	 */
	public Light getLight(int n) {
		OleAutomation automation = func("GetLight", n).getAutomation();
		return new Light(automation);
	}

	/**
	 * TODO: Add description
	 * <p>
	 * Original content from {@code JED_OLE.pas}:
	 * 
	 * <pre>
	 * Function GetCOG(n:integer):variant; {0.81}
	 * </pre>
	 * 
	 * @param n
	 *            TODO
	 * @return TODO: Add description
	 */
	public Cog getCOG(int n) {
		OleAutomation automation = func("GetCOG", n).getAutomation();
		return new Cog(automation);
	}

	/**
	 * TODO: Add description
	 * <p>
	 * Original content from {@code JED_OLE.pas}:
	 * 
	 * <pre>
	 * Procedure DeleteSector(n:integer);
	 * </pre>
	 * 
	 * @param n
	 *            TODO
	 */
	public void deleteSector(int n) {
		proc("DeleteSector", n);
	}

	/**
	 * TODO: Add description
	 * <p>
	 * Original content from {@code JED_OLE.pas}:
	 * 
	 * <pre>
	 * Procedure DeleteThing(n:integer);
	 * </pre>
	 * 
	 * @param n
	 *            TODO
	 */
	public void deleteThing(int n) {
		proc("DeleteThing", n);
	}

	/**
	 * TODO: Add description
	 * <p>
	 * Original content from {@code JED_OLE.pas}:
	 * 
	 * <pre>
	 * Procedure DeleteLight(n:integer);
	 * </pre>
	 * 
	 * @param n
	 *            TODO
	 */
	public void deleteLight(int n) {
		proc("DeleteLight", n);
	}

	/**
	 * TODO: Add description
	 * <p>
	 * Original content from {@code JED_OLE.pas}:
	 * 
	 * <pre>
	 * Procedure DeleteCOG(n:integer); {0.81}
	 * </pre>
	 * 
	 * @param n
	 *            TODO
	 */
	public void deleteCOG(int n) {
		proc("DeleteCOG", n);
	}

	/**
	 * TODO: Add description
	 * <p>
	 * Original content from {@code JED_OLE.pas}:
	 * 
	 * <pre>
	 * Function AddSector:Integer;
	 * </pre>
	 * 
	 * @return TODO: Add description
	 */
	public int addSector() {
		return func("AddSector").getInt();
	}

	/**
	 * TODO: Add description
	 * <p>
	 * Original content from {@code JED_OLE.pas}:
	 * 
	 * <pre>
	 * Function AddThing:Integer;
	 * </pre>
	 * 
	 * @return TODO: Add description
	 */
	public int addThing() {
		return func("AddThing").getInt();
	}

	/**
	 * TODO: Add description
	 * <p>
	 * Original content from {@code JED_OLE.pas}:
	 * 
	 * <pre>
	 * Function AddLight:Integer;
	 * </pre>
	 * 
	 * @return TODO: Add description
	 */
	public int addLight() {
		return func("AddLight").getInt();
	}

	/**
	 * TODO: Add description
	 * <p>
	 * Original content from {@code JED_OLE.pas}:
	 * 
	 * <pre>
	 * Function AddCOG(const name:string):Integer; {0.81}
	 * </pre>
	 * 
	 * @param name
	 *            TODO
	 * @return TODO: Add description
	 */
	public int addCOG(String name) {
		return func("AddCOG", name).getInt();
	}

	/**
	 * TODO: Add description
	 * <p>
	 * Original content from {@code JED_OLE.pas}:
	 * 
	 * <pre>
	 * Function GetLayerName(n:integer):String;
	 * </pre>
	 * 
	 * @param n
	 *            TODO
	 * @return TODO: Add description
	 */
	public String getLayerName(int n) {
		return func("GetLayerName", n).getString();
	}

	/**
	 * TODO: Add description
	 * <p>
	 * Original content from {@code JED_OLE.pas}:
	 * 
	 * <pre>
	 * Function AddLayer(const name:string):integer;
	 * </pre>
	 * 
	 * @param name
	 *            TODO
	 * @return TODO: Add description
	 */
	public int addLayer(String name) {
		return func("AddLayer", name).getInt();
	}

	// {0.85}

	/**
	 * TODO: Add description
	 * <p>
	 * Original content from {@code JED_OLE.pas}:
	 * 
	 * <pre>
	 * Property NLayers:integer read GetNLayers;
	 * </pre>
	 * 
	 * @return TODO: Add description
	 */
	public int getNLayers() {
		return get("NLayers").getInt();
	}

	/**
	 * TODO: Add description
	 * <p>
	 * Original content from {@code JED_OLE.pas}:
	 * 
	 * <pre>
	 * Property NSectors:integer read GetNSectors;
	 * </pre>
	 * 
	 * @return TODO: Add description
	 */
	public int getNSectors() {
		return get("NSectors").getInt();
	}

	/**
	 * TODO: Add description
	 * <p>
	 * Original content from {@code JED_OLE.pas}:
	 * 
	 * <pre>
	 * Property NThings:integer read GetNThings;
	 * </pre>
	 * 
	 * @return TODO: Add description
	 */
	public int getNThings() {
		return get("NThings").getInt();
	}

	/**
	 * TODO: Add description
	 * <p>
	 * Original content from {@code JED_OLE.pas}:
	 * 
	 * <pre>
	 * Property NLights:integer read GetNLights;
	 * </pre>
	 * 
	 * @return TODO: Add description
	 */
	public int getNLights() {
		return get("NLights").getInt();
	}

	/**
	 * TODO: Add description
	 * <p>
	 * Original content from {@code JED_OLE.pas}:
	 * 
	 * <pre>
	 * Property MasterCMP:string read GetMasterCMP write SetMasterCMP;
	 * </pre>
	 * 
	 * @return TODO: Add description
	 */
	public String getMasterCMP() {
		return get("MasterCMP").getString();
	}

	/**
	 * TODO: Add description
	 * <p>
	 * Original content from {@code JED_OLE.pas}:
	 * 
	 * <pre>
	 * Property MasterCMP:string read GetMasterCMP write SetMasterCMP;
	 * </pre>
	 * 
	 * @param masterCMP
	 *            TODO
	 */
	public void setMasterCMP(String masterCMP) {
		set("MasterCMP", masterCMP);
	}

}
