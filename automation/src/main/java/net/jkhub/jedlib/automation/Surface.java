package net.jkhub.jedlib.automation;

import org.eclipse.swt.ole.win32.OleAutomation;
import org.eclipse.swt.ole.win32.Variant;

/**
 * This class represents a surface placed in a level.
 * <p>
 * This class corresponds to {@code TOLESurface} from {@code JED_OLE.pas}.
 */
public final class Surface extends OleObject {

	Surface(OleAutomation automation) {
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
	 * Procedure UpdateSector;
	 * </pre>
	 */
	public void updateSector() {
		proc("UpdateSector");
	}

	/**
	 * TODO: Add description
	 * <p>
	 * Original content from {@code JED_OLE.pas}:
	 * 
	 * <pre>
	 * Procedure GetNormal(var x,y,z:double);
	 * </pre>
	 * 
	 * @return TODO: Add description
	 */
	public Vector getNormal() {
		try (ByRefVariants variants = allocateDoubleByRefVariants(3)) {
			Variant x = variants.get(0);
			Variant y = variants.get(1);
			Variant z = variants.get(2);
			proc("GetNormal", x, y, z);
			return new Vector(x.getDouble(), y.getDouble(), z.getDouble());
		}
	}

	/**
	 * TODO: Add description
	 * <p>
	 * Original content from {@code JED_OLE.pas}:
	 * 
	 * <pre>
	 * Procedure GetAdjoin(var sc,sf:integer);
	 * </pre>
	 * 
	 * @return TODO: Add description
	 */
	public SectorSurface getAdjoin() {
		try (ByRefVariants variants = allocateIntegerByRefVariants(2)) {
			Variant sc = variants.get(0);
			Variant sf = variants.get(1);
			proc("GetAdjoin", sc, sf);
			return new SectorSurface(sc.getInt(), sf.getInt());
		}
	}

	/**
	 * TODO: Add description
	 * <p>
	 * Original content from {@code JED_OLE.pas}:
	 * 
	 * <pre>
	 * Procedure SetAdjoin(sc,sf:integer);
	 * </pre>
	 * 
	 * @param sc
	 *            TODO
	 * @param sf
	 *            TODO
	 */
	public void setAdjoin(int sc, int sf) {
		proc("SetAdjoin", sc, sf);
	}

	/**
	 * TODO: Add description
	 * <p>
	 * Original content from {@code JED_OLE.pas}:
	 * 
	 * <pre>
	 * Procedure GetFlags(var AdjoinFlags, SurfFlags, FaceFlags:Longint);
	 * </pre>
	 * 
	 * @return TODO: Add description
	 */
	public SurfaceFlags getFlags() {
		try (ByRefVariants variants = allocateIntegerByRefVariants(3)) {
			Variant adjoinFlags = variants.get(0);
			Variant surfFlags = variants.get(1);
			Variant faceFlags = variants.get(2);
			proc("GetFlags", adjoinFlags, surfFlags, faceFlags);
			return new SurfaceFlags(adjoinFlags.getInt(), surfFlags.getInt(), faceFlags.getInt());
		}
	}

	/**
	 * TODO: Add description
	 * <p>
	 * Original content from {@code JED_OLE.pas}:
	 * 
	 * <pre>
	 * Procedure SetFlags(AdjoinFlags, SurfFlags, FaceFlags:Longint);
	 * </pre>
	 * 
	 * @param adjoinFlags
	 *            TODO
	 * @param surfFlags
	 *            TODO
	 * @param faceFlags
	 *            TODO
	 */
	public void setFlags(int adjoinFlags, int surfFlags, int faceFlags) {
		proc("SetFlags", adjoinFlags, surfFlags, faceFlags);
	}

	/**
	 * TODO: Add description
	 * <p>
	 * Original content from {@code JED_OLE.pas}:
	 * 
	 * <pre>
	 * Procedure GetGeoLightTex(var geo,light,tex:integer);
	 * </pre>
	 * 
	 * @return TODO: Add description
	 */
	public SurfaceModes getGeoLightTex() {
		try (ByRefVariants variants = allocateIntegerByRefVariants(3)) {
			Variant geo = variants.get(0);
			Variant light = variants.get(1);
			Variant tex = variants.get(2);
			proc("GetGeoLightTex", geo, light, tex);
			return new SurfaceModes(geo.getInt(), light.getInt(), tex.getInt());
		}
	}

	/**
	 * TODO: Add description
	 * <p>
	 * Original content from {@code JED_OLE.pas}:
	 * 
	 * <pre>
	 * Procedure SetGeoLightTex(geo,light,tex:integer);
	 * </pre>
	 * 
	 * @param geo
	 *            TODO
	 * @param light
	 *            TODO
	 * @param tex
	 *            TODO
	 */
	public void setGeoLightTex(int geo, int light, int tex) {
		proc("SetGeoLightTex", geo, light, tex);
	}

	// {Vertices}

	/**
	 * TODO: Add description
	 * <p>
	 * Original content from {@code JED_OLE.pas}:
	 * 
	 * <pre>
	 * Procedure InsertVertex(n:integer;nvx:integer);
	 * </pre>
	 * 
	 * @param n
	 *            TODO
	 * @param nvx
	 *            TODO
	 */
	public void insertVertex(int n, int nvx) {
		proc("InsertVertex", n, nvx);
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
	 * Function GetVertex(n:integer):Integer;
	 * </pre>
	 * 
	 * @param n
	 *            TODO
	 * @return TODO: Add description
	 */
	public int getVertex(int n) {
		return func("GetVertex", n).getInt();
	}

	/**
	 * TODO: Add description
	 * <p>
	 * Original content from {@code JED_OLE.pas}:
	 * 
	 * <pre>
	 * Procedure SetVertex(n:integer;nvx:integer);
	 * </pre>
	 * 
	 * @param n
	 *            TODO
	 * @param nvx
	 *            TODO
	 */
	public void setVertex(int n, int nvx) {
		proc("SetVertex", n, nvx);
	}

	/**
	 * TODO: Add description
	 * <p>
	 * Original content from {@code JED_OLE.pas}:
	 * 
	 * <pre>
	 * Procedure GetVertexUV(n:integer;var u,v:double);
	 * </pre>
	 * 
	 * @param n
	 *            TODO
	 * @return TODO: Add description
	 */
	public UV getVertexUV(int n) {
		try (ByRefVariants variants = allocateDoubleByRefVariants(2)) {
			Variant u = variants.get(0);
			Variant v = variants.get(1);
			proc("GetVertexUV", n, u, v);
			return new UV(u.getDouble(), v.getDouble());
		}
	}

	/**
	 * TODO: Add description
	 * <p>
	 * Original content from {@code JED_OLE.pas}:
	 * 
	 * <pre>
	 * Procedure SetVertexUV(n:integer;u,v:double);
	 * </pre>
	 * 
	 * @param n
	 *            TODO
	 * @param u
	 *            TODO
	 * @param v
	 *            TODO
	 */
	public void setVertexUV(int n, double u, double v) {
		proc("SetVertexUV", n, u, v);
	}

	/**
	 * TODO: Add description
	 * <p>
	 * Original content from {@code JED_OLE.pas}:
	 * 
	 * <pre>
	 * Function GetVertexLight(n:integer):double;
	 * </pre>
	 * 
	 * @param n
	 *            TODO
	 * @return TODO: Add description
	 */
	public double getVertexLight(int n) {
		return func("GetVertexLight", n).getDouble();
	}

	/**
	 * TODO: Add description
	 * <p>
	 * Original content from {@code JED_OLE.pas}:
	 * 
	 * <pre>
	 * Procedure SetVertexLight(n:integer;light:double);
	 * </pre>
	 * 
	 * @param n
	 *            TODO
	 * @param light
	 *            TODO
	 */
	public void setVertexLight(int n, double light) {
		proc("SetVertexLight", n, light);
	}

	/**
	 * TODO: Add description
	 * <p>
	 * Original content from {@code JED_OLE.pas}:
	 * 
	 * <pre>
	 * Procedure GetVertexRGB(n:integer;var r,g,b:double);
	 * </pre>
	 * 
	 * @param n
	 *            TODO
	 * @return TODO: Add description
	 */
	public Tint getVertexRGB(int n) {
		try (ByRefVariants variants = allocateDoubleByRefVariants(3)) {
			Variant r = variants.get(0);
			Variant g = variants.get(1);
			Variant b = variants.get(2);
			proc("GetVertexRGB", n, r, g, b);
			return new Tint(r.getDouble(), g.getDouble(), b.getDouble());
		}
	}

	/**
	 * TODO: Add description
	 * <p>
	 * Original content from {@code JED_OLE.pas}:
	 * 
	 * <pre>
	 * Procedure SetVertexRGB(n:integer;r,g,b:double);
	 * </pre>
	 * 
	 * @param n
	 *            TODO
	 * @param r
	 *            TODO
	 * @param g
	 *            TODO
	 * @param b
	 *            TODO
	 */
	public void setVertexRGB(int n, double r, double g, double b) {
		proc("SetVertexRGB", n, r, g, b);
	}

	/**
	 * TODO: Add description
	 * <p>
	 * Original content from {@code JED_OLE.pas}:
	 * 
	 * <pre>
	 * Function GetAdjoinSC:Integer;
	 * </pre>
	 * 
	 * @return TODO: Add description
	 */
	public int getAdjoinSC() {
		return func("GetAdjoinSC").getInt();
	}

	/**
	 * TODO: Add description
	 * <p>
	 * Original content from {@code JED_OLE.pas}:
	 * 
	 * <pre>
	 * Function GetAdjoinSF:Integer;
	 * </pre>
	 * 
	 * @return TODO: Add description
	 */
	public int getAdjoinSF() {
		return func("GetAdjoinSF").getInt();
	}

	/**
	 * TODO: Add description
	 * <p>
	 * Original content from {@code JED_OLE.pas}:
	 * 
	 * <pre>
	 * Function GetVertexU(n:integer):Double;
	 * </pre>
	 * 
	 * @param n
	 *            TODO
	 * @return TODO: Add description
	 */
	public double getVertexU(int n) {
		return func("GetVertexU", n).getDouble();
	}

	/**
	 * TODO: Add description
	 * <p>
	 * Original content from {@code JED_OLE.pas}:
	 * 
	 * <pre>
	 * Function GetVertexV(n:integer):Double;
	 * </pre>
	 * 
	 * @param n
	 *            TODO
	 * @return TODO: Add description
	 */
	public double getVertexV(int n) {
		return func("GetVertexV", n).getDouble();
	}

	/**
	 * TODO: Add description
	 * <p>
	 * Original content from {@code JED_OLE.pas}:
	 * 
	 * <pre>
	 * Function GetVertexR(n:integer):Double;
	 * </pre>
	 * 
	 * @param n
	 *            TODO
	 * @return TODO: Add description
	 */
	public double getVertexR(int n) {
		return func("GetVertexR", n).getDouble();
	}

	/**
	 * TODO: Add description
	 * <p>
	 * Original content from {@code JED_OLE.pas}:
	 * 
	 * <pre>
	 * Function GetVertexG(n:integer):Double;
	 * </pre>
	 * 
	 * @param n
	 *            TODO
	 * @return TODO: Add description
	 */
	public double getVertexG(int n) {
		return func("GetVertexG", n).getDouble();
	}

	/**
	 * TODO: Add description
	 * <p>
	 * Original content from {@code JED_OLE.pas}:
	 * 
	 * <pre>
	 * Function GetVertexB(n:integer):Double;
	 * </pre>
	 * 
	 * @param n
	 *            TODO
	 * @return TODO: Add description
	 */
	public double getVertexB(int n) {
		return func("GetVertexB", n).getDouble();
	}

	// {0.9}

	/**
	 * TODO: Add description
	 * <p>
	 * Original content from {@code JED_OLE.pas}:
	 * 
	 * <pre>
	 * Function IsConvex:Wordbool;
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
	 * Function IsPlanar:Wordbool;
	 * </pre>
	 * 
	 * @return TODO: Add description
	 */
	public boolean isPlanar() {
		return func("IsPlanar").getBoolean();
	}

	/**
	 * TODO: Add description
	 * <p>
	 * Original content from {@code JED_OLE.pas}:
	 * 
	 * <pre>
	 * Property AdjoinFlags:Integer read GetAdjFlags write SetAdjFlags;
	 * </pre>
	 * 
	 * @return TODO: Add description
	 */
	public int getAdjFlags() {
		return get("AdjoinFlags").getInt();
	}

	/**
	 * TODO: Add description
	 * <p>
	 * Original content from {@code JED_OLE.pas}:
	 * 
	 * <pre>
	 * Property AdjoinFlags:Integer read GetAdjFlags write SetAdjFlags;
	 * </pre>
	 * 
	 * @param adjoinFlags
	 *            TODO
	 */
	public void setAdjFlags(int adjoinFlags) {
		set("AdjoinFlags", adjoinFlags);
	}

	/**
	 * TODO: Add description
	 * <p>
	 * Original content from {@code JED_OLE.pas}:
	 * 
	 * <pre>
	 * Property SurfFlags:Integer read GetSurfFlags write SetSurfFlags;
	 * </pre>
	 * 
	 * @return TODO: Add description
	 */
	public int getSurfFlags() {
		return get("SurfFlags").getInt();
	}

	/**
	 * TODO: Add description
	 * <p>
	 * Original content from {@code JED_OLE.pas}:
	 * 
	 * <pre>
	 * Property SurfFlags:Integer read GetSurfFlags write SetSurfFlags;
	 * </pre>
	 * 
	 * @param surfFlags
	 *            TODO
	 */
	public void setSurfFlags(int surfFlags) {
		set("SurfFlags", surfFlags);
	}

	/**
	 * TODO: Add description
	 * <p>
	 * Original content from {@code JED_OLE.pas}:
	 * 
	 * <pre>
	 * Property FaceFlags:Integer read GetFaceFlags write SetAdjFlags;
	 * </pre>
	 * 
	 * @return TODO: Add description
	 */
	public int getFaceFlags() {
		return get("FaceFlags").getInt();
	}

	/**
	 * TODO: Add description
	 * <p>
	 * <b>Note: This method does not work correctly. JED incorrectly sets the adjoin
	 * flags instead of the face flags.</b>
	 * <p>
	 * Original content from {@code JED_OLE.pas}:
	 * 
	 * <pre>
	 * Property FaceFlags:Integer read GetFaceFlags write SetAdjFlags;
	 * </pre>
	 * 
	 * @param faceFlags
	 *            TODO
	 */
	public void setFaceFlags(int faceFlags) {
		set("FaceFlags", faceFlags);
	}

	/**
	 * TODO: Add description
	 * <p>
	 * Original content from {@code JED_OLE.pas}:
	 * 
	 * <pre>
	 * Property Geo:integer read GetGeo;
	 * </pre>
	 * 
	 * @return TODO: Add description
	 */
	public int getGeo() {
		return get("Geo").getInt();
	}

	/**
	 * TODO: Add description
	 * <p>
	 * Original content from {@code JED_OLE.pas}:
	 * 
	 * <pre>
	 * Property Light:integer read GetLight;
	 * </pre>
	 * 
	 * @return TODO: Add description
	 */
	public int getLight() {
		return get("Light").getInt();
	}

	/**
	 * TODO: Add description
	 * <p>
	 * Original content from {@code JED_OLE.pas}:
	 * 
	 * <pre>
	 * Property Tex:integer read GetTex;
	 * </pre>
	 * 
	 * @return TODO: Add description
	 */
	public int getTex() {
		return get("Tex").getInt();
	}

	/**
	 * TODO: Add description
	 * <p>
	 * Original content from {@code JED_OLE.pas}:
	 * 
	 * <pre>
	 * Property Material:string read GetMAT write SetMat;
	 * </pre>
	 * 
	 * @return TODO: Add description
	 */
	public String getMAT() {
		return get("Material").getString();
	}

	/**
	 * TODO: Add description
	 * <p>
	 * Original content from {@code JED_OLE.pas}:
	 * 
	 * <pre>
	 * Property Material:string read GetMAT write SetMat;
	 * </pre>
	 * 
	 * @param material
	 *            TODO
	 */
	public void setMat(String material) {
		set("Material", material);
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
	 * <b>Note: This method does not work correctly. JED incorrectly returns the U
	 * scale instead of the TX scale.</b>
	 * <p>
	 * Original content from {@code JED_OLE.pas}:
	 * 
	 * <pre>
	 * Property TXScale:double read GetUScale write SetTXScale;
	 * </pre>
	 * 
	 * @return TODO: Add description
	 */
	public double getTXScale() {
		return get("TXScale").getDouble();
	}

	/**
	 * TODO: Add description
	 * <p>
	 * Original content from {@code JED_OLE.pas}:
	 * 
	 * <pre>
	 * Property TXScale:double read GetUScale write SetTXScale;
	 * </pre>
	 * 
	 * @param tXScale
	 *            TODO
	 */
	public void setTXScale(double tXScale) {
		set("TXScale", tXScale);
	}

	/**
	 * TODO: Add description
	 * <p>
	 * Original content from {@code JED_OLE.pas}:
	 * 
	 * <pre>
	 * Property UScale:double read GetUScale write SetUScale;
	 * </pre>
	 * 
	 * @return TODO: Add description
	 */
	public double getUScale() {
		return get("UScale").getDouble();
	}

	/**
	 * TODO: Add description
	 * <p>
	 * Original content from {@code JED_OLE.pas}:
	 * 
	 * <pre>
	 * Property UScale:double read GetUScale write SetUScale;
	 * </pre>
	 * 
	 * @param uScale
	 *            TODO
	 */
	public void setUScale(double uScale) {
		set("UScale", uScale);
	}

	/**
	 * TODO: Add description
	 * <p>
	 * Original content from {@code JED_OLE.pas}:
	 * 
	 * <pre>
	 * Property VScale:double read GetVScale write SetVScale;
	 * </pre>
	 * 
	 * @return TODO: Add description
	 */
	public double getVScale() {
		return get("VScale").getDouble();
	}

	/**
	 * TODO: Add description
	 * <p>
	 * Original content from {@code JED_OLE.pas}:
	 * 
	 * <pre>
	 * Property VScale:double read GetVScale write SetVScale;
	 * </pre>
	 * 
	 * @param vScale
	 *            TODO
	 */
	public void setVScale(double vScale) {
		set("VScale", vScale);
	}

	/**
	 * TODO: Add description
	 * <p>
	 * Original content from {@code JED_OLE.pas}:
	 * 
	 * <pre>
	 * Property NormalX:double read GetNormX;
	 * </pre>
	 * 
	 * @return TODO: Add description
	 */
	public double getNormX() {
		return get("NormalX").getDouble();
	}

	/**
	 * TODO: Add description
	 * <p>
	 * Original content from {@code JED_OLE.pas}:
	 * 
	 * <pre>
	 * Property NormalY:double read GetNormY;
	 * </pre>
	 * 
	 * @return TODO: Add description
	 */
	public double getNormY() {
		return get("NormalY").getDouble();
	}

	/**
	 * TODO: Add description
	 * <p>
	 * Original content from {@code JED_OLE.pas}:
	 * 
	 * <pre>
	 * Property NormalZ:double read GetNormZ;
	 * </pre>
	 * 
	 * @return TODO: Add description
	 */
	public double getNormZ() {
		return get("NormalZ").getDouble();
	}

	// {0.85}

	/**
	 * TODO: Add description
	 * <p>
	 * Original content from {@code JED_OLE.pas}:
	 * 
	 * <pre>
	 * Property Nvertices:Integer read GetNVertices;
	 * </pre>
	 * 
	 * @return TODO: Add description
	 */
	public int getNVertices() {
		return get("Nvertices").getInt();
	}

}
