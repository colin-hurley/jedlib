package net.jkhub.jedlib.automation;

import org.eclipse.swt.ole.win32.OleAutomation;
import org.eclipse.swt.ole.win32.Variant;

/**
 * This class represents a sector placed in a level.
 * <p>
 * This class corresponds to {@code TOLESector} from {@code JED_OLE.pas}.
 */
public final class Sector extends OleObject {

	Sector(OleAutomation automation) {
		super(automation);
	}

	// Public body

	/**
	 * TODO: Add description
	 * <p>
	 * Original content from {@code JED_OLE.pas}:
	 * 
	 * <pre>
	 * Function AddSurface:Integer;
	 * </pre>
	 * 
	 * @return TODO: Add description
	 */
	public int addSurface() {
		return func("AddSurface").getInt();
	}

	/**
	 * TODO: Add description
	 * <p>
	 * Original content from {@code JED_OLE.pas}:
	 * 
	 * <pre>
	 * Function InsertSurface(n:integer):integer;
	 * </pre>
	 * 
	 * @param n
	 *            TODO
	 * @return TODO: Add description
	 */
	public int insertSurface(int n) {
		return func("InsertSurface", n).getInt();
	}

	/**
	 * TODO: Add description
	 * <p>
	 * Original content from {@code JED_OLE.pas}:
	 * 
	 * <pre>
	 * Procedure DeleteSurface(n:integer);
	 * </pre>
	 * 
	 * @param n
	 *            TODO
	 */
	public void deleteSurface(int n) {
		proc("DeleteSurface", n);
	}

	/**
	 * TODO: Add description
	 * <p>
	 * Original content from {@code JED_OLE.pas}:
	 * 
	 * <pre>
	 * Function GetSurface(n:integer):Variant;
	 * </pre>
	 * 
	 * @param n
	 *            TODO
	 * @return TODO: Add description
	 */
	public Surface getSurface(int n) {
		OleAutomation automation = func("GetSurface", n).getAutomation();
		return new Surface(automation);
	}

	/**
	 * TODO: Add description
	 * <p>
	 * Original content from {@code JED_OLE.pas}:
	 * 
	 * <pre>
	 * Function AddVertex(x,y,z:double):Integer;
	 * </pre>
	 * 
	 * @param x
	 *            TODO
	 * @param y
	 *            TODO
	 * @param z
	 *            TODO
	 * @return TODO: Add description
	 */
	public int addVertex(double x, double y, double z) {
		return func("AddVertex", x, y, z).getInt();
	}

	/**
	 * TODO: Add description
	 * <p>
	 * Original content from {@code JED_OLE.pas}:
	 * 
	 * <pre>
	 * Function FindVertex(x,y,z:double):Integer;
	 * </pre>
	 * 
	 * @param x
	 *            TODO
	 * @param y
	 *            TODO
	 * @param z
	 *            TODO
	 * @return TODO: Add description
	 */
	public int findVertex(double x, double y, double z) {
		return func("FindVertex", x, y, z).getInt();
	}

	/**
	 * TODO: Add description
	 * <p>
	 * Original content from {@code JED_OLE.pas}:
	 * 
	 * <pre>
	 * Procedure DeleteVertex(n:integer);
	 * </pre>
	 * 
	 * @param n
	 *            TODO
	 */
	public void deleteVertex(int n) {
		proc("DeleteVertex", n);
	}

	/**
	 * TODO: Add description
	 * <p>
	 * Original content from {@code JED_OLE.pas}:
	 * 
	 * <pre>
	 * Procedure GetVertex(n:integer;var x,y,z:double);
	 * </pre>
	 * 
	 * @param n
	 *            TODO
	 * @return TODO: Add description
	 */
	public Vector getVertex(int n) {
		try (ByRefVariants variants = allocateDoubleByRefVariants(3)) {
			Variant x = variants.get(0);
			Variant y = variants.get(1);
			Variant z = variants.get(2);
			proc("GetVertex", n, x, y, z);
			return new Vector(x.getDouble(), y.getDouble(), z.getDouble());
		}
	}

	/**
	 * TODO: Add description
	 * <p>
	 * Original content from {@code JED_OLE.pas}:
	 * 
	 * <pre>
	 * Procedure SetVertex(n:integer;x,y,z:double);
	 * </pre>
	 * 
	 * @param n
	 *            TODO
	 * @param x
	 *            TODO
	 * @param y
	 *            TODO
	 * @param z
	 *            TODO
	 */
	public void setVertex(int n, double x, double y, double z) {
		proc("SetVertex", n, x, y, z);
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
	 * Procedure GetTint(var r,g,b:double);
	 * </pre>
	 * 
	 * @return TODO: Add description
	 */
	public Tint getTint() {
		try (ByRefVariants variants = allocateDoubleByRefVariants(3)) {
			Variant r = variants.get(0);
			Variant g = variants.get(1);
			Variant b = variants.get(2);
			proc("GetTint", r, g, b);
			return new Tint(r.getDouble(), g.getDouble(), b.getDouble());
		}
	}

	/**
	 * TODO: Add description
	 * <p>
	 * Original content from {@code JED_OLE.pas}:
	 * 
	 * <pre>
	 * Procedure SetTint(r,g,b:double);
	 * </pre>
	 * 
	 * @param r
	 *            TODO
	 * @param g
	 *            TODO
	 * @param b
	 *            TODO
	 */
	public void setTint(double r, double g, double b) {
		proc("SetTint", r, g, b);
	}

	// {0.9}

	/**
	 * TODO: Add description
	 * <p>
	 * Original content from {@code JED_OLE.pas}:
	 * 
	 * <pre>
	 * Function IsConvex:WordBool;
	 * </pre>
	 * 
	 * @return TODO: Add description
	 */
	public boolean isConvex() {
		return func("IsConvex").getBoolean();
	}

	/**
	 * TODO: Add description
	 * <p>
	 * Original content from {@code JED_OLE.pas}:
	 * 
	 * <pre>
	 * Property NVertices:Integer read GetNVertices;
	 * </pre>
	 * 
	 * @return TODO: Add description
	 */
	public int getNVertices() {
		return get("NVertices").getInt();
	}

	/**
	 * TODO: Add description
	 * <p>
	 * Original content from {@code JED_OLE.pas}:
	 * 
	 * <pre>
	 * Property NSurfaces:Integer read GetNSurfaces;
	 * </pre>
	 * 
	 * @return TODO: Add description
	 */
	public int getNSurfaces() {
		return get("NSurfaces").getInt();
	}

	/**
	 * TODO: Add description
	 * <p>
	 * Original content from {@code JED_OLE.pas}:
	 * 
	 * <pre>
	 * Property Tinx_R:double read GetTintR;
	 * </pre>
	 * 
	 * @return TODO: Add description
	 */
	public double getTintR() {
		return get("Tinx_R").getDouble();
	}

	/**
	 * TODO: Add description
	 * <p>
	 * Original content from {@code JED_OLE.pas}:
	 * 
	 * <pre>
	 * Property Tinx_G:double read GetTintG;
	 * </pre>
	 * 
	 * @return TODO: Add description
	 */
	public double getTintG() {
		return get("Tinx_G").getDouble();
	}

	/**
	 * TODO: Add description
	 * <p>
	 * Original content from {@code JED_OLE.pas}:
	 * 
	 * <pre>
	 * Property Tinx_B:double read GetTintB;
	 * </pre>
	 * 
	 * @return TODO: Add description
	 */
	public double getTintB() {
		return get("Tinx_B").getDouble();
	}

	/**
	 * TODO: Add description
	 * <p>
	 * Original content from {@code JED_OLE.pas}:
	 * 
	 * <pre>
	 * Property Flags:longint read GetFlags write SetFlags;
	 * </pre>
	 * 
	 * @return TODO: Add description
	 */
	public int getFlags() {
		return get("Flags").getInt();
	}

	/**
	 * TODO: Add description
	 * <p>
	 * Original content from {@code JED_OLE.pas}:
	 * 
	 * <pre>
	 * Property Flags:longint read GetFlags write SetFlags;
	 * </pre>
	 * 
	 * @param flags
	 *            TODO
	 */
	public void setFlags(int flags) {
		set("Flags", flags);
	}

	/**
	 * TODO: Add description
	 * <p>
	 * Original content from {@code JED_OLE.pas}:
	 * 
	 * <pre>
	 * Property Ambient:double read GetAmbient write SetAmbient;
	 * </pre>
	 * 
	 * @return TODO: Add description
	 */
	public double getAmbient() {
		return get("Ambient").getDouble();
	}

	/**
	 * TODO: Add description
	 * <p>
	 * Original content from {@code JED_OLE.pas}:
	 * 
	 * <pre>
	 * Property Ambient:double read GetAmbient write SetAmbient;
	 * </pre>
	 * 
	 * @param ambient
	 *            TODO
	 */
	public void setAmbient(double ambient) {
		set("Ambient", ambient);
	}

	/**
	 * TODO: Add description
	 * <p>
	 * Original content from {@code JED_OLE.pas}:
	 * 
	 * <pre>
	 * Property ExtraLight:double read GetExtra write SetExtra;
	 * </pre>
	 * 
	 * @return TODO: Add description
	 */
	public double getExtra() {
		return get("ExtraLight").getDouble();
	}

	/**
	 * TODO: Add description
	 * <p>
	 * Original content from {@code JED_OLE.pas}:
	 * 
	 * <pre>
	 * Property ExtraLight:double read GetExtra write SetExtra;
	 * </pre>
	 * 
	 * @param extraLight
	 *            TODO
	 */
	public void setExtra(double extraLight) {
		set("ExtraLight", extraLight);
	}

	/**
	 * TODO: Add description
	 * <p>
	 * Original content from {@code JED_OLE.pas}:
	 * 
	 * <pre>
	 * Property ColorMap:String read GetCMP write SetCMP;
	 * </pre>
	 * 
	 * @return TODO: Add description
	 */
	public String getCMP() {
		return get("ColorMap").getString();
	}

	/**
	 * TODO: Add description
	 * <p>
	 * Original content from {@code JED_OLE.pas}:
	 * 
	 * <pre>
	 * Property ColorMap:String read GetCMP write SetCMP;
	 * </pre>
	 * 
	 * @param colorMap
	 *            TODO
	 */
	public void setCMP(String colorMap) {
		set("ColorMap", colorMap);
	}

	/**
	 * TODO: Add description
	 * <p>
	 * Original content from {@code JED_OLE.pas}:
	 * 
	 * <pre>
	 * Property Sound:string read GetSound write SetSound;
	 * </pre>
	 * 
	 * @return TODO: Add description
	 */
	public String getSound() {
		return get("Sound").getString();
	}

	/**
	 * TODO: Add description
	 * <p>
	 * Original content from {@code JED_OLE.pas}:
	 * 
	 * <pre>
	 * Property Sound:string read GetSound write SetSound;
	 * </pre>
	 * 
	 * @param sound
	 *            TODO
	 */
	public void setSound(String sound) {
		set("Sound", sound);
	}

	/**
	 * TODO: Add description
	 * <p>
	 * Original content from {@code JED_OLE.pas}:
	 * 
	 * <pre>
	 * Property Volume:double read GetVol write SetVol;
	 * </pre>
	 * 
	 * @return TODO: Add description
	 */
	public double getVol() {
		return get("Volume").getDouble();
	}

	/**
	 * TODO: Add description
	 * <p>
	 * Original content from {@code JED_OLE.pas}:
	 * 
	 * <pre>
	 * Property Volume:double read GetVol write SetVol;
	 * </pre>
	 * 
	 * @param volume
	 *            TODO
	 */
	public void setVol(double volume) {
		set("Volume", volume);
	}

	/**
	 * TODO: Add description
	 * <p>
	 * Original content from {@code JED_OLE.pas}:
	 * 
	 * <pre>
	 * Property Layer:Integer read GetLayer write SetLayer;
	 * </pre>
	 * 
	 * @return TODO: Add description
	 */
	public int getLayer() {
		return get("Layer").getInt();
	}

	/**
	 * TODO: Add description
	 * <p>
	 * Original content from {@code JED_OLE.pas}:
	 * 
	 * <pre>
	 * Property Layer:Integer read GetLayer write SetLayer;
	 * </pre>
	 * 
	 * @param layer
	 *            TODO
	 */
	public void setLayer(int layer) {
		set("Layer", layer);
	}

}
