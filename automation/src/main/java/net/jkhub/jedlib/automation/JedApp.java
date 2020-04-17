package net.jkhub.jedlib.automation;

import org.eclipse.swt.ole.win32.OLE;
import org.eclipse.swt.ole.win32.OleAutomation;
import org.eclipse.swt.ole.win32.Variant;

/**
 * This class represents the JED application.
 * <p>
 * This class corresponds to {@code TJEDApp} from {@code JED_OLE.pas}.
 */
public final class JedApp extends OleObject {

	/**
	 * The prog ID under which JED registers itself by default.
	 */
	public static final String JED_PROG_ID = "JED.App";

	JedApp(OleAutomation automation) {
		super(automation);
	}

	// Public body

	// {Functions}

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
	 * Procedure NewLevel(mots:WordBool);
	 * </pre>
	 * 
	 * @param mots
	 *            TODO
	 */
	public void newLevel(boolean mots) {
		proc("NewLevel", mots);
	}

	/**
	 * TODO: Add description
	 * <p>
	 * Original content from {@code JED_OLE.pas}:
	 * 
	 * <pre>
	 * Procedure OpenLevel(const name:string);
	 * </pre>
	 * 
	 * @param name
	 *            TODO
	 */
	public void openLevel(String name) {
		proc("OpenLevel", name);
	}

	/**
	 * TODO: Add description
	 * <p>
	 * Original content from {@code JED_OLE.pas}:
	 * 
	 * <pre>
	 * Procedure SaveJED(const name:string);
	 * </pre>
	 * 
	 * @param name
	 *            TODO
	 */
	public void saveJED(String name) {
		proc("SaveJED", name);
	}

	/**
	 * TODO: Add description
	 * <p>
	 * Original content from {@code JED_OLE.pas}:
	 * 
	 * <pre>
	 * Procedure SaveJKL(const name:string);
	 * </pre>
	 * 
	 * @param name
	 *            TODO
	 */
	public void saveJKL(String name) {
		proc("SaveJKL", name);
	}

	/**
	 * TODO: Add description
	 * <p>
	 * Original content from {@code JED_OLE.pas}:
	 * 
	 * <pre>
	 * Procedure UpdateMap;
	 * </pre>
	 */
	public void updateMap() {
		proc("UpdateMap");
	}

	/**
	 * TODO: Add description
	 * <p>
	 * Original content from {@code JED_OLE.pas}:
	 * 
	 * <pre>
	 * Procedure GetCurSF(var sc,sf:integer);
	 * </pre>
	 * 
	 * @return TODO: Add description
	 */
	public SectorSurface getCurSF() {
		try (ByRefVariants variants = allocateIntegerByRefVariants(2)) {
			Variant sc = variants.get(0);
			Variant sf = variants.get(1);
			proc("GetCurSF", sc, sf);
			return new SectorSurface(sc.getInt(), sf.getInt());
		}
	}

	/**
	 * TODO: Add description
	 * <p>
	 * Original content from {@code JED_OLE.pas}:
	 * 
	 * <pre>
	 * Procedure SetCurSF(sc,sf:integer);
	 * </pre>
	 * 
	 * @param sc
	 *            TODO
	 * @param sf
	 *            TODO
	 */
	public void setCurSF(int sc, int sf) {
		proc("SetCurSF", sc, sf);
	}

	/**
	 * TODO: Add description
	 * <p>
	 * Original content from {@code JED_OLE.pas}:
	 * 
	 * <pre>
	 * Procedure GetCurVX(var sc,vx:integer);
	 * </pre>
	 * 
	 * @return TODO: Add description
	 */
	public SectorVertex getCurVX() {
		try (ByRefVariants variants = allocateIntegerByRefVariants(2)) {
			Variant sc = variants.get(0);
			Variant vx = variants.get(1);
			proc("GetCurVX", sc, vx);
			return new SectorVertex(sc.getInt(), vx.getInt());
		}
	}

	/**
	 * TODO: Add description
	 * <p>
	 * Original content from {@code JED_OLE.pas}:
	 * 
	 * <pre>
	 * Procedure SetCurVX(sc,vx:integer);
	 * </pre>
	 * 
	 * @param sc
	 *            TODO
	 * @param vx
	 *            TODO
	 */
	public void setCurVX(int sc, int vx) {
		proc("SetCurVX", sc, vx);
	}

	/**
	 * TODO: Add description
	 * <p>
	 * Original content from {@code JED_OLE.pas}:
	 * 
	 * <pre>
	 * Procedure GetCurED(var sc,sf,ed:integer);
	 * </pre>
	 * 
	 * @return TODO: Add description
	 */
	public SectorSurfaceEdge getCurED() {
		try (ByRefVariants variants = allocateIntegerByRefVariants(3)) {
			Variant sc = variants.get(0);
			Variant sf = variants.get(1);
			Variant ed = variants.get(2);
			proc("GetCurED", sc, sf, ed);
			return new SectorSurfaceEdge(sc.getInt(), sf.getInt(), ed.getInt());
		}
	}

	/**
	 * TODO: Add description
	 * <p>
	 * Original content from {@code JED_OLE.pas}:
	 * 
	 * <pre>
	 * Procedure SetCurED(sc,sf,ed:integer);
	 * </pre>
	 * 
	 * @param sc
	 *            TODO
	 * @param sf
	 *            TODO
	 * @param ed
	 *            TODO
	 */
	public void setCurED(int sc, int sf, int ed) {
		proc("SetCurED", sc, sf, ed);
	}

	/**
	 * TODO: Add description
	 * <p>
	 * Original content from {@code JED_OLE.pas}:
	 * 
	 * <pre>
	 * Procedure GetCurFR(var th,fr:integer);
	 * </pre>
	 * 
	 * @return TODO: Add description
	 */
	public ThingFrame getCurFR() {
		try (ByRefVariants variants = allocateIntegerByRefVariants(2)) {
			Variant th = variants.get(0);
			Variant fr = variants.get(1);
			proc("GetCurFR", th, fr);
			return new ThingFrame(th.getInt(), fr.getInt());
		}
	}

	/**
	 * TODO: Add description
	 * <p>
	 * Original content from {@code JED_OLE.pas}:
	 * 
	 * <pre>
	 * Procedure SetCurFR(th,fr:integer);
	 * </pre>
	 * 
	 * @param th
	 *            TODO
	 * @param fr
	 *            TODO
	 */
	public void setCurFR(int th, int fr) {
		proc("SetCurFR", th, fr);
	}

	// {Picking}

	/**
	 * TODO: Add description
	 * <p>
	 * Original content from {@code JED_OLE.pas}:
	 * 
	 * <pre>
	 * Function PickThing(const curThing:String):String;
	 * </pre>
	 * 
	 * @param curThing
	 *            TODO
	 * @return TODO: Add description
	 */
	public String pickThing(String curThing) {
		return func("PickThing", curThing).getString();
	}

	/**
	 * TODO: Add description
	 * <p>
	 * Original content from {@code JED_OLE.pas}:
	 * 
	 * <pre>
	 * Function PickTemplate(const curtpl:string):string;
	 * </pre>
	 * 
	 * @param curtpl
	 *            TODO
	 * @return TODO: Add description
	 */
	public String pickTemplate(String curtpl) {
		return func("PickTemplate", curtpl).getString();
	}

	/**
	 * TODO: Add description
	 * <p>
	 * Original content from {@code JED_OLE.pas}:
	 * 
	 * <pre>
	 * Function PickCMP(const CurCMP:string):string;
	 * </pre>
	 * 
	 * @param curCMP
	 *            TODO
	 * @return TODO: Add description
	 */
	public String pickCMP(String curCMP) {
		return func("PickCMP", curCMP).getString();
	}

	/**
	 * TODO: Add description
	 * <p>
	 * Original content from {@code JED_OLE.pas}:
	 * 
	 * <pre>
	 * Function PickWav(CurWav:string):string;
	 * </pre>
	 * 
	 * @param curWav
	 *            TODO
	 * @return TODO: Add description
	 */
	public String pickWav(String curWav) {
		return func("PickWav", curWav).getString();
	}

	/**
	 * TODO: Add description
	 * <p>
	 * Original content from {@code JED_OLE.pas}:
	 * 
	 * <pre>
	 * Function PickMAT(CurMAT:string):string;
	 * </pre>
	 * 
	 * @param curMAT
	 *            TODO
	 * @return TODO: Add description
	 */
	public String pickMAT(String curMAT) {
		return func("PickMAT", curMAT).getString();
	}

	/**
	 * TODO: Add description
	 * <p>
	 * Original content from {@code JED_OLE.pas}:
	 * 
	 * <pre>
	 * Function PickCOG(CurCog:string):string;
	 * </pre>
	 * 
	 * @param curCog
	 *            TODO
	 * @return TODO: Add description
	 */
	public String pickCOG(String curCog) {
		return func("PickCOG", curCog).getString();
	}

	// { Function PickLayer(CurLayer:string):string;}

	/**
	 * TODO: Add description
	 * <p>
	 * Original content from {@code JED_OLE.pas}:
	 * 
	 * <pre>
	 * Function Pick3DO(const cur3do:String):String;
	 * </pre>
	 * 
	 * @param cur3do
	 *            TODO
	 * @return TODO: Add description
	 */
	public String pick3DO(String cur3do) {
		return func("Pick3DO", cur3do).getString();
	}

	/**
	 * TODO: Add description
	 * <p>
	 * Original content from {@code JED_OLE.pas}:
	 * 
	 * <pre>
	 * Function PickAI(const CurAI:string):string;
	 * </pre>
	 * 
	 * @param curAI
	 *            TODO
	 * @return TODO: Add description
	 */
	public String pickAI(String curAI) {
		return func("PickAI", curAI).getString();
	}

	/**
	 * TODO: Add description
	 * <p>
	 * Original content from {@code JED_OLE.pas}:
	 * 
	 * <pre>
	 * Function PickKEY(const CurKEY:string):string;
	 * </pre>
	 * 
	 * @param curKEY
	 *            TODO
	 * @return TODO: Add description
	 */
	public String pickKEY(String curKEY) {
		return func("PickKEY", curKEY).getString();
	}

	/**
	 * TODO: Add description
	 * <p>
	 * Original content from {@code JED_OLE.pas}:
	 * 
	 * <pre>
	 * Function PickSND(const CurSND:string):string;
	 * </pre>
	 * 
	 * @param curSND
	 *            TODO
	 * @return TODO: Add description
	 */
	public String pickSND(String curSND) {
		return func("PickSND", curSND).getString();
	}

	/**
	 * TODO: Add description
	 * <p>
	 * Original content from {@code JED_OLE.pas}:
	 * 
	 * <pre>
	 * Function PickPUP(const CurPUP:string):string;
	 * </pre>
	 * 
	 * @param curPUP
	 *            TODO
	 * @return TODO: Add description
	 */
	public String pickPUP(String curPUP) {
		return func("PickPUP", curPUP).getString();
	}

	// {0.81}

	/**
	 * TODO: Add description
	 * <p>
	 * Original content from {@code JED_OLE.pas}:
	 * 
	 * <pre>
	 * Function PickSPR(const CurSPR:string):string;
	 * </pre>
	 * 
	 * @param curSPR
	 *            TODO
	 * @return TODO: Add description
	 */
	public String pickSPR(String curSPR) {
		return func("PickSPR", curSPR).getString();
	}

	/**
	 * TODO: Add description
	 * <p>
	 * Original content from {@code JED_OLE.pas}:
	 * 
	 * <pre>
	 * Function PickPAR(const CurPAR:string):string;
	 * </pre>
	 * 
	 * @param curPAR
	 *            TODO
	 * @return TODO: Add description
	 */
	public String pickPAR(String curPAR) {
		return func("PickPAR", curPAR).getString();
	}

	/**
	 * TODO: Add description
	 * <p>
	 * Original content from {@code JED_OLE.pas}:
	 * 
	 * <pre>
	 * Function PickPER(const CurPER:string):string;
	 * </pre>
	 * 
	 * @param curPER
	 *            TODO
	 * @return TODO: Add description
	 */
	public String pickPER(String curPER) {
		return func("PickPER", curPER).getString();
	}

	/**
	 * TODO: Add description
	 * <p>
	 * Original content from {@code JED_OLE.pas}:
	 * 
	 * <pre>
	 * Procedure ReloadTemplates;
	 * </pre>
	 */
	public void reloadTemplates() {
		proc("ReloadTemplates");
	}

	/**
	 * TODO: Add description
	 * <p>
	 * Original content from {@code JED_OLE.pas}:
	 * 
	 * <pre>
	 * Procedure PanMessage(mtype:integer;const msg:string);
	 * </pre>
	 * 
	 * @param mtype
	 *            TODO
	 * @param msg
	 *            TODO
	 */
	public void panMessage(int mtype, String msg) {
		proc("PanMessage", mtype, msg);
	}

	/**
	 * TODO: Add description
	 * <p>
	 * Original content from {@code JED_OLE.pas}:
	 * 
	 * <pre>
	 * Procedure SendKey(shift:integer;key:integer);
	 * </pre>
	 * 
	 * @param shift
	 *            TODO
	 * @param key
	 *            TODO
	 */
	public void sendKey(int shift, int key) {
		proc("SendKey", shift, key);
	}

	/**
	 * TODO: Add description
	 * <p>
	 * Original content from {@code JED_OLE.pas}:
	 * 
	 * <pre>
	 * Function ExecuteMenu(const itemref:string):WordBool;
	 * </pre>
	 * 
	 * @param itemref
	 *            TODO
	 * @return TODO: Add description
	 */
	public boolean executeMenu(String itemref) {
		return func("ExecuteMenu", itemref).getBoolean();
	}

	// {/0.81}

	// {0.85}

	/**
	 * TODO: Add description
	 * <p>
	 * Original content from {@code JED_OLE.pas}:
	 * 
	 * <pre>
	 * Function EditSectorFlags(flags:LongInt):LongInt;
	 * </pre>
	 * 
	 * @param flags
	 *            TODO
	 * @return TODO: Add description
	 */
	public int editSectorFlags(int flags) {
		return func("EditSectorFlags", flags).getInt();
	}

	/**
	 * TODO: Add description
	 * <p>
	 * Original content from {@code JED_OLE.pas}:
	 * 
	 * <pre>
	 * Function EditSurfaceFlags(flags:LongInt):LongInt;
	 * </pre>
	 * 
	 * @param flags
	 *            TODO
	 * @return TODO: Add description
	 */
	public int editSurfaceFlags(int flags) {
		return func("EditSurfaceFlags", flags).getInt();
	}

	/**
	 * TODO: Add description
	 * <p>
	 * Original content from {@code JED_OLE.pas}:
	 * 
	 * <pre>
	 * Function EditAdjoinFlags(flags:LongInt):LongInt;
	 * </pre>
	 * 
	 * @param flags
	 *            TODO
	 * @return TODO: Add description
	 */
	public int editAdjoinFlags(int flags) {
		return func("EditAdjoinFlags", flags).getInt();
	}

	/**
	 * TODO: Add description
	 * <p>
	 * Original content from {@code JED_OLE.pas}:
	 * 
	 * <pre>
	 * Function EditThingFlags(flags:LongInt):LongInt;
	 * </pre>
	 * 
	 * @param flags
	 *            TODO
	 * @return TODO: Add description
	 */
	public int editThingFlags(int flags) {
		return func("EditThingFlags", flags).getInt();
	}

	/**
	 * TODO: Add description
	 * <p>
	 * Original content from {@code JED_OLE.pas}:
	 * 
	 * <pre>
	 * Function EditFaceFlags(flags:LongInt):LongInt;
	 * </pre>
	 * 
	 * @param flags
	 *            TODO
	 * @return TODO: Add description
	 */
	public int editFaceFlags(int flags) {
		return func("EditFaceFlags", flags).getInt();
	}

	/**
	 * TODO: Add description
	 * <p>
	 * Original content from {@code JED_OLE.pas}:
	 * 
	 * <pre>
	 * Function EditLightFlags(flags:Longint):LongInt;
	 * </pre>
	 * 
	 * @param flags
	 *            TODO
	 * @return TODO: Add description
	 */
	public int editLightFlags(int flags) {
		return func("EditLightFlags", flags).getInt();
	}

	/**
	 * TODO: Add description
	 * <p>
	 * Original content from {@code JED_OLE.pas}:
	 * 
	 * <pre>
	 * Function PickGeo(geo:integer):integer;
	 * </pre>
	 * 
	 * @param geo
	 *            TODO
	 * @return TODO: Add description
	 */
	public int pickGeo(int geo) {
		return func("PickGeo", geo).getInt();
	}

	/**
	 * TODO: Add description
	 * <p>
	 * Original content from {@code JED_OLE.pas}:
	 * 
	 * <pre>
	 * Function PickLightMode(lmode:integer):integer;
	 * </pre>
	 * 
	 * @param lmode
	 *            TODO
	 * @return TODO: Add description
	 */
	public int pickLightMode(int lmode) {
		return func("PickLightMode", lmode).getInt();
	}

	/**
	 * TODO: Add description
	 * <p>
	 * Original content from {@code JED_OLE.pas}:
	 * 
	 * <pre>
	 * Function PickTEX(tex:integer):integer;
	 * </pre>
	 * 
	 * @param tex
	 *            TODO
	 * @return TODO: Add description
	 */
	public int pickTEX(int tex) {
		return func("PickTEX", tex).getInt();
	}

	// {Stuff}

	/**
	 * TODO: Add description
	 * <p>
	 * Original content from {@code JED_OLE.pas}:
	 * 
	 * <pre>
	 * Procedure GetCamXYZ(var x,y,z:double);
	 * </pre>
	 * 
	 * @return TODO: Add description
	 */
	public Vector getCamXYZ() {
		try (ByRefVariants variants = allocateDoubleByRefVariants(3)) {
			Variant x = variants.get(0);
			Variant y = variants.get(1);
			Variant z = variants.get(2);
			proc("GetCamXYZ", x, y, z);
			return new Vector(x.getDouble(), y.getDouble(), z.getDouble());
		}
	}

	/**
	 * TODO: Add description
	 * <p>
	 * Original content from {@code JED_OLE.pas}:
	 * 
	 * <pre>
	 * Procedure GetGridXYZ(var x,y,z:double);
	 * </pre>
	 * 
	 * @return TODO: Add description
	 */
	public Vector getGridXYZ() {
		try (ByRefVariants variants = allocateDoubleByRefVariants(3)) {
			Variant x = variants.get(0);
			Variant y = variants.get(1);
			Variant z = variants.get(2);
			proc("GetGridXYZ", x, y, z);
			return new Vector(x.getDouble(), y.getDouble(), z.getDouble());
		}
	}

	// {0.81}

	/**
	 * TODO: Add description
	 * <p>
	 * Original content from {@code JED_OLE.pas}:
	 * 
	 * <pre>
	 * Procedure SetCamXYZ(x,y,z:double);
	 * </pre>
	 * 
	 * @param x
	 *            TODO
	 * @param y
	 *            TODO
	 * @param z
	 *            TODO
	 */
	public void setCamXYZ(double x, double y, double z) {
		proc("SetCamXYZ", x, y, z);
	}

	/**
	 * TODO: Add description
	 * <p>
	 * Original content from {@code JED_OLE.pas}:
	 * 
	 * <pre>
	 * Procedure SetGridXYZ(x,y,z:double);
	 * </pre>
	 * 
	 * @param x
	 *            TODO
	 * @param y
	 *            TODO
	 * @param z
	 *            TODO
	 */
	public void setGridXYZ(double x, double y, double z) {
		proc("SetGridXYZ", x, y, z);
	}

	/**
	 * TODO: Add description
	 * <p>
	 * Original content from {@code JED_OLE.pas}:
	 * 
	 * <pre>
	 * Procedure GetGridAxes(var xx,xy,xz,yx,yy,yz,zx,zy,zz:double);
	 * </pre>
	 * 
	 * @return TODO: Add description
	 */
	public Axes getGridAxes() {
		try (ByRefVariants variants = allocateDoubleByRefVariants(9)) {
			Variant xx = variants.get(0);
			Variant xy = variants.get(1);
			Variant xz = variants.get(2);
			Variant yx = variants.get(3);
			Variant yy = variants.get(4);
			Variant yz = variants.get(5);
			Variant zx = variants.get(6);
			Variant zy = variants.get(7);
			Variant zz = variants.get(8);
			proc("GetGridAxes", xx, xy, xz, yx, yy, yz, zx, zy, zz);
			Vector x = new Vector(xx.getDouble(), xy.getDouble(), xz.getDouble());
			Vector y = new Vector(yx.getDouble(), yy.getDouble(), yz.getDouble());
			Vector z = new Vector(zx.getDouble(), zy.getDouble(), zz.getDouble());
			return new Axes(x, y, z);
		}
	}

	/**
	 * TODO: Add description
	 * <p>
	 * Original content from {@code JED_OLE.pas}:
	 * 
	 * <pre>
	 * Function GetGridAxis(naxis,ncoord:integer):double;
	 * </pre>
	 * 
	 * @param naxis
	 *            TODO
	 * @param ncoord
	 *            TODO
	 * @return TODO: Add description
	 */
	public double getGridAxis(int naxis, int ncoord) {
		return func("GetGridAxis", naxis, ncoord).getDouble();
	}

	/**
	 * TODO: Add description
	 * <p>
	 * Original content from {@code JED_OLE.pas}:
	 * 
	 * <pre>
	 * Procedure SetGridAxes(xx,xy,xz,yx,yy,yz:double);
	 * </pre>
	 * 
	 * @param xx
	 *            TODO
	 * @param xy
	 *            TODO
	 * @param xz
	 *            TODO
	 * @param yx
	 *            TODO
	 * @param yy
	 *            TODO
	 * @param yz
	 *            TODO
	 */
	public void setGridAxes(double xx, double xy, double xz, double yx, double yy, double yz) {
		proc("SetGridAxes", xx, xy, xz, yx, yy, yz);
	}

	/**
	 * TODO: Add description
	 * <p>
	 * Original content from {@code JED_OLE.pas}:
	 * 
	 * <pre>
	 * Procedure GetCamAxes(var xx,xy,xz,yx,yy,yz,zx,zy,zz:double);
	 * </pre>
	 * 
	 * @return TODO: Add description
	 */
	public Axes getCamAxes() {
		try (ByRefVariants variants = allocateDoubleByRefVariants(9)) {
			Variant xx = variants.get(0);
			Variant xy = variants.get(1);
			Variant xz = variants.get(2);
			Variant yx = variants.get(3);
			Variant yy = variants.get(4);
			Variant yz = variants.get(5);
			Variant zx = variants.get(6);
			Variant zy = variants.get(7);
			Variant zz = variants.get(8);
			proc("GetCamAxes", xx, xy, xz, yx, yy, yz, zx, zy, zz);
			Vector x = new Vector(xx.getDouble(), xy.getDouble(), xz.getDouble());
			Vector y = new Vector(yx.getDouble(), yy.getDouble(), yz.getDouble());
			Vector z = new Vector(zx.getDouble(), zy.getDouble(), zz.getDouble());
			return new Axes(x, y, z);
		}
	}

	/**
	 * TODO: Add description
	 * <p>
	 * Original content from {@code JED_OLE.pas}:
	 * 
	 * <pre>
	 * Function GetCamAxis(naxis,ncoord:integer):double;
	 * </pre>
	 * 
	 * @param naxis
	 *            TODO
	 * @param ncoord
	 *            TODO
	 * @return TODO: Add description
	 */
	public double getCamAxis(int naxis, int ncoord) {
		return func("GetCamAxis", naxis, ncoord).getDouble();
	}

	/**
	 * TODO: Add description
	 * <p>
	 * Original content from {@code JED_OLE.pas}:
	 * 
	 * <pre>
	 * Procedure SetCamAxes(xx,xy,xz,yx,yy,yz:double);
	 * </pre>
	 * 
	 * @param xx
	 *            TODO
	 * @param xy
	 *            TODO
	 * @param xz
	 *            TODO
	 * @param yx
	 *            TODO
	 * @param yy
	 *            TODO
	 * @param yz
	 *            TODO
	 */
	public void setCamAxes(double xx, double xy, double xz, double yx, double yy, double yz) {
		proc("SetCamAxes", xx, xy, xz, yx, yy, yz);
	}

	/**
	 * TODO: Add description
	 * <p>
	 * Original content from {@code JED_OLE.pas}:
	 * 
	 * <pre>
	 * Procedure SetPreviewCamXYZ(x,y,z:double);
	 * </pre>
	 * 
	 * @param x
	 *            TODO
	 * @param y
	 *            TODO
	 * @param z
	 *            TODO
	 */
	public void setPreviewCamXYZ(double x, double y, double z) {
		proc("SetPreviewCamXYZ", x, y, z);
	}

	/**
	 * TODO: Add description
	 * <p>
	 * Original content from {@code JED_OLE.pas}:
	 * 
	 * <pre>
	 * Procedure GetPreviewCamXYZ(var x,y,z:double);
	 * </pre>
	 * 
	 * @return TODO: Add description
	 */
	public Vector getPreviewCamXYZ() {
		try (ByRefVariants variants = allocateDoubleByRefVariants(3)) {
			Variant x = variants.get(0);
			Variant y = variants.get(1);
			Variant z = variants.get(2);
			proc("GetPreviewCamXYZ", x, y, z);
			return new Vector(x.getDouble(), y.getDouble(), z.getDouble());
		}
	}

	/**
	 * TODO: Add description
	 * <p>
	 * Original content from {@code JED_OLE.pas}:
	 * 
	 * <pre>
	 * Procedure SetPreviewCamPY(pch,yaw:double);
	 * </pre>
	 * 
	 * @param pch
	 *            TODO
	 * @param yaw
	 *            TODO
	 */
	public void setPreviewCamPY(double pch, double yaw) {
		proc("SetPreviewCamPY", pch, yaw);
	}

	/**
	 * TODO: Add description
	 * <p>
	 * Original content from {@code JED_OLE.pas}:
	 * 
	 * <pre>
	 * Procedure GetPreviewCamPY(var pch,yaw:double);
	 * </pre>
	 * 
	 * @return TODO: Add description
	 */
	public Orientation getPreviewCamPY() {
		try (ByRefVariants variants = allocateDoubleByRefVariants(2)) {
			Variant pch = variants.get(0);
			Variant yaw = variants.get(1);
			proc("GetPreviewCamPY", pch, yaw);
			return new Orientation(pch.getDouble(), yaw.getDouble(), 0.0);
		}
	}

	/**
	 * TODO: Add description
	 * <p>
	 * Original content from {@code JED_OLE.pas}:
	 * 
	 * <pre>
	 * Function GetPreviewCamParam(what:integer):double;
	 * </pre>
	 * 
	 * @param what
	 *            TODO
	 * @return TODO: Add description
	 */
	public double getPreviewCamParam(int what) {
		return func("GetPreviewCamParam", what).getDouble();
	}

	/**
	 * TODO: Add description
	 * <p>
	 * Original content from {@code JED_OLE.pas}:
	 * 
	 * <pre>
	 * Function NMultiSelected(what:integer):integer;
	 * </pre>
	 * 
	 * @param what
	 *            TODO
	 * @return TODO: Add description
	 */
	public int nMultiSelected(int what) {
		return func("NMultiSelected", what).getInt();
	}

	/**
	 * TODO: Add description
	 * <p>
	 * Original content from {@code JED_OLE.pas}:
	 * 
	 * <pre>
	 * Procedure ClearMultiselection(what:integer);
	 * </pre>
	 * 
	 * @param what
	 *            TODO
	 */
	public void clearMultiselection(int what) {
		proc("ClearMultiselection", what);
	}

	/**
	 * TODO: Add description
	 * <p>
	 * Original content from {@code JED_OLE.pas}:
	 * 
	 * <pre>
	 * Procedure RemoveFromMultiselection(what,n:integer);
	 * </pre>
	 * 
	 * @param what
	 *            TODO
	 * @param n
	 *            TODO
	 */
	public void removeFromMultiselection(int what, int n) {
		proc("RemoveFromMultiselection", what, n);
	}

	/**
	 * TODO: Add description
	 * <p>
	 * Original content from {@code JED_OLE.pas}:
	 * 
	 * <pre>
	 * Function GetSelectedSC(n:integer):integer;
	 * </pre>
	 * 
	 * @param n
	 *            TODO
	 * @return TODO: Add description
	 */
	public int getSelectedSC(int n) {
		return func("GetSelectedSC", n).getInt();
	}

	/**
	 * TODO: Add description
	 * <p>
	 * Original content from {@code JED_OLE.pas}:
	 * 
	 * <pre>
	 * Function GetSelectedTH(n:integer):integer;
	 * </pre>
	 * 
	 * @param n
	 *            TODO
	 * @return TODO: Add description
	 */
	public int getSelectedTH(int n) {
		return func("GetSelectedTH", n).getInt();
	}

	/**
	 * TODO: Add description
	 * <p>
	 * Original content from {@code JED_OLE.pas}:
	 * 
	 * <pre>
	 * Function GetSelectedLT(n:integer):integer;
	 * </pre>
	 * 
	 * @param n
	 *            TODO
	 * @return TODO: Add description
	 */
	public int getSelectedLT(int n) {
		return func("GetSelectedLT", n).getInt();
	}

	/**
	 * TODO: Add description
	 * <p>
	 * Original content from {@code JED_OLE.pas}:
	 * 
	 * <pre>
	 * procedure GetSelectedSF(n:integer;var sc,sf:integer);
	 * </pre>
	 * 
	 * @param n
	 *            TODO
	 * @return TODO: Add description
	 */
	public SectorSurface getSelectedSF(int n) {
		try (ByRefVariants variants = allocateIntegerByRefVariants(2)) {
			Variant sc = variants.get(0);
			Variant sf = variants.get(1);
			proc("GetSelectedSF", n, sc, sf);
			return new SectorSurface(sc.getInt(), sf.getInt());
		}
	}

	/**
	 * TODO: Add description
	 * <p>
	 * Original content from {@code JED_OLE.pas}:
	 * 
	 * <pre>
	 * procedure GetSelectedED(n:integer;var sc,sf,ed:integer);
	 * </pre>
	 * 
	 * @param n
	 *            TODO
	 * @return TODO: Add description
	 */
	public SectorSurfaceEdge getSelectedED(int n) {
		try (ByRefVariants variants = allocateIntegerByRefVariants(3)) {
			Variant sc = variants.get(0);
			Variant sf = variants.get(1);
			Variant ed = variants.get(2);
			proc("GetSelectedED", n, sc, sf, ed);
			return new SectorSurfaceEdge(sc.getInt(), sf.getInt(), ed.getInt());
		}
	}

	/**
	 * TODO: Add description
	 * <p>
	 * Original content from {@code JED_OLE.pas}:
	 * 
	 * <pre>
	 * procedure GetSelectedVX(n:integer;var sc,vx:integer);
	 * </pre>
	 * 
	 * @param n
	 *            TODO
	 * @return TODO: Add description
	 */
	public SectorVertex getSelectedVX(int n) {
		try (ByRefVariants variants = allocateIntegerByRefVariants(2)) {
			Variant sc = variants.get(0);
			Variant vx = variants.get(1);
			proc("GetSelectedVX", n, sc, vx);
			return new SectorVertex(sc.getInt(), vx.getInt());
		}
	}

	/**
	 * TODO: Add description
	 * <p>
	 * Original content from {@code JED_OLE.pas}:
	 * 
	 * <pre>
	 * procedure GetSelectedFR(n:integer;var th,fr:integer);
	 * </pre>
	 * 
	 * @param n
	 *            TODO
	 * @return TODO: Add description
	 */
	public ThingFrame getSelectedFR(int n) {
		try (ByRefVariants variants = allocateIntegerByRefVariants(2)) {
			Variant th = variants.get(0);
			Variant fr = variants.get(1);
			proc("GetSelectedFR", n, th, fr);
			return new ThingFrame(th.getInt(), fr.getInt());
		}
	}

	/**
	 * TODO: Add description
	 * <p>
	 * Original content from {@code JED_OLE.pas}:
	 * 
	 * <pre>
	 * Function GetSelectedSFop(n:integer;what:integer):integer;
	 * </pre>
	 * 
	 * @param n
	 *            TODO
	 * @param what
	 *            TODO
	 * @return TODO: Add description
	 */
	public int getSelectedSFop(int n, int what) {
		return func("GetSelectedSFop", n, what).getInt();
	}

	/**
	 * TODO: Add description
	 * <p>
	 * Original content from {@code JED_OLE.pas}:
	 * 
	 * <pre>
	 * Function GetSelectedEDop(n:integer;what:integer):integer;
	 * </pre>
	 * 
	 * @param n
	 *            TODO
	 * @param what
	 *            TODO
	 * @return TODO: Add description
	 */
	public int getSelectedEDop(int n, int what) {
		return func("GetSelectedEDop", n, what).getInt();
	}

	/**
	 * TODO: Add description
	 * <p>
	 * Original content from {@code JED_OLE.pas}:
	 * 
	 * <pre>
	 * Function GetSelectedVXop(n:integer;what:integer):integer;
	 * </pre>
	 * 
	 * @param n
	 *            TODO
	 * @param what
	 *            TODO
	 * @return TODO: Add description
	 */
	public int getSelectedVXop(int n, int what) {
		return func("GetSelectedVXop", n, what).getInt();
	}

	/**
	 * TODO: Add description
	 * <p>
	 * Original content from {@code JED_OLE.pas}:
	 * 
	 * <pre>
	 * Function GetSelectedFRop(n:integer;what:integer):integer;
	 * </pre>
	 * 
	 * @param n
	 *            TODO
	 * @param what
	 *            TODO
	 * @return TODO: Add description
	 */
	public int getSelectedFRop(int n, int what) {
		return func("GetSelectedFRop", n, what).getInt();
	}

	/**
	 * TODO: Add description
	 * <p>
	 * Original content from {@code JED_OLE.pas}:
	 * 
	 * <pre>
	 * Function SelectSC(sc:integer):integer;
	 * </pre>
	 * 
	 * @param sc
	 *            TODO
	 * @return TODO: Add description
	 */
	public int selectSC(int sc) {
		return func("SelectSC", sc).getInt();
	}

	/**
	 * TODO: Add description
	 * <p>
	 * Original content from {@code JED_OLE.pas}:
	 * 
	 * <pre>
	 * Function SelectSF(sc,sf:integer):integer;
	 * </pre>
	 * 
	 * @param sc
	 *            TODO
	 * @param sf
	 *            TODO
	 * @return TODO: Add description
	 */
	public int selectSF(int sc, int sf) {
		return func("SelectSF", sc, sf).getInt();
	}

	/**
	 * TODO: Add description
	 * <p>
	 * Original content from {@code JED_OLE.pas}:
	 * 
	 * <pre>
	 * Function SelectED(sc,sf,ed:integer):integer;
	 * </pre>
	 * 
	 * @param sc
	 *            TODO
	 * @param sf
	 *            TODO
	 * @param ed
	 *            TODO
	 * @return TODO: Add description
	 */
	public int selectED(int sc, int sf, int ed) {
		return func("SelectED", sc, sf, ed).getInt();
	}

	/**
	 * TODO: Add description
	 * <p>
	 * Original content from {@code JED_OLE.pas}:
	 * 
	 * <pre>
	 * Function SelectVX(sc,vx:integer):integer;
	 * </pre>
	 * 
	 * @param sc
	 *            TODO
	 * @param vx
	 *            TODO
	 * @return TODO: Add description
	 */
	public int selectVX(int sc, int vx) {
		return func("SelectVX", sc, vx).getInt();
	}

	/**
	 * TODO: Add description
	 * <p>
	 * Original content from {@code JED_OLE.pas}:
	 * 
	 * <pre>
	 * Function SelectTH(th:integer):integer;
	 * </pre>
	 * 
	 * @param th
	 *            TODO
	 * @return TODO: Add description
	 */
	public int selectTH(int th) {
		return func("SelectTH", th).getInt();
	}

	/**
	 * TODO: Add description
	 * <p>
	 * Original content from {@code JED_OLE.pas}:
	 * 
	 * <pre>
	 * Function SelectFR(th,fr:integer):integer;
	 * </pre>
	 * 
	 * @param th
	 *            TODO
	 * @param fr
	 *            TODO
	 * @return TODO: Add description
	 */
	public int selectFR(int th, int fr) {
		return func("SelectFR", th, fr).getInt();
	}

	/**
	 * TODO: Add description
	 * <p>
	 * Original content from {@code JED_OLE.pas}:
	 * 
	 * <pre>
	 * Function SelectLT(lt:integer):integer;
	 * </pre>
	 * 
	 * @param lt
	 *            TODO
	 * @return TODO: Add description
	 */
	public int selectLT(int lt) {
		return func("SelectLT", lt).getInt();
	}

	/**
	 * TODO: Add description
	 * <p>
	 * Original content from {@code JED_OLE.pas}:
	 * 
	 * <pre>
	 * Function FindSelectedSC(sc:integer):integer;
	 * </pre>
	 * 
	 * @param sc
	 *            TODO
	 * @return TODO: Add description
	 */
	public int findSelectedSC(int sc) {
		return func("FindSelectedSC", sc).getInt();
	}

	/**
	 * TODO: Add description
	 * <p>
	 * Original content from {@code JED_OLE.pas}:
	 * 
	 * <pre>
	 * Function FindSelectedSF(sc,sf:integer):integer;
	 * </pre>
	 * 
	 * @param sc
	 *            TODO
	 * @param sf
	 *            TODO
	 * @return TODO: Add description
	 */
	public int findSelectedSF(int sc, int sf) {
		return func("FindSelectedSF", sc, sf).getInt();
	}

	/**
	 * TODO: Add description
	 * <p>
	 * Original content from {@code JED_OLE.pas}:
	 * 
	 * <pre>
	 * Function FindSelectedED(sc,sf,ed:integer):integer;
	 * </pre>
	 * 
	 * @param sc
	 *            TODO
	 * @param sf
	 *            TODO
	 * @param ed
	 *            TODO
	 * @return TODO: Add description
	 */
	public int findSelectedED(int sc, int sf, int ed) {
		return func("FindSelectedED", sc, sf, ed).getInt();
	}

	/**
	 * TODO: Add description
	 * <p>
	 * Original content from {@code JED_OLE.pas}:
	 * 
	 * <pre>
	 * Function FindSelectedVX(sc,vx:integer):integer;
	 * </pre>
	 * 
	 * @param sc
	 *            TODO
	 * @param vx
	 *            TODO
	 * @return TODO: Add description
	 */
	public int findSelectedVX(int sc, int vx) {
		return func("FindSelectedVX", sc, vx).getInt();
	}

	/**
	 * TODO: Add description
	 * <p>
	 * Original content from {@code JED_OLE.pas}:
	 * 
	 * <pre>
	 * Function FindSelectedTH(th:integer):integer;
	 * </pre>
	 * 
	 * @param th
	 *            TODO
	 * @return TODO: Add description
	 */
	public int findSelectedTH(int th) {
		return func("FindSelectedTH", th).getInt();
	}

	/**
	 * TODO: Add description
	 * <p>
	 * Original content from {@code JED_OLE.pas}:
	 * 
	 * <pre>
	 * Function FindSelectedFR(th,fr:integer):integer;
	 * </pre>
	 * 
	 * @param th
	 *            TODO
	 * @param fr
	 *            TODO
	 * @return TODO: Add description
	 */
	public int findSelectedFR(int th, int fr) {
		return func("FindSelectedFR", th, fr).getInt();
	}

	/**
	 * TODO: Add description
	 * <p>
	 * Original content from {@code JED_OLE.pas}:
	 * 
	 * <pre>
	 * Function FindSelectedLT(lt:integer):integer;
	 * </pre>
	 * 
	 * @param lt
	 *            TODO
	 * @return TODO: Add description
	 */
	public int findSelectedLT(int lt) {
		return func("FindSelectedLT", lt).getInt();
	}

	// {0.85}

	/**
	 * TODO: Add description
	 * <p>
	 * Original content from {@code JED_OLE.pas}:
	 * 
	 * <pre>
	 * Procedure StartUndo(const name:string);
	 * </pre>
	 * 
	 * @param name
	 *            TODO
	 */
	public void startUndo(String name) {
		proc("StartUndo", name);
	}

	/**
	 * TODO: Add description
	 * <p>
	 * Original content from {@code JED_OLE.pas}:
	 * 
	 * <pre>
	 * Procedure SaveUndoForThing(n:integer;change:integer);
	 * </pre>
	 * 
	 * @param n
	 *            TODO
	 * @param change
	 *            TODO
	 */
	public void saveUndoForThing(int n, int change) {
		proc("SaveUndoForThing", n, change);
	}

	/**
	 * TODO: Add description
	 * <p>
	 * Original content from {@code JED_OLE.pas}:
	 * 
	 * <pre>
	 * Procedure SaveUndoForLight(n:integer;change:integer);
	 * </pre>
	 * 
	 * @param n
	 *            TODO
	 * @param change
	 *            TODO
	 */
	public void saveUndoForLight(int n, int change) {
		proc("SaveUndoForLight", n, change);
	}

	/**
	 * TODO: Add description
	 * <p>
	 * Original content from {@code JED_OLE.pas}:
	 * 
	 * <pre>
	 * Procedure SaveUndoForSector(n:integer;change:integer;whatpart:integer);
	 * </pre>
	 * 
	 * @param n
	 *            TODO
	 * @param change
	 *            TODO
	 * @param whatpart
	 *            TODO
	 */
	public void saveUndoForSector(int n, int change, int whatpart) {
		proc("SaveUndoForSector", n, change, whatpart);
	}

	/**
	 * TODO: Add description
	 * <p>
	 * Original content from {@code JED_OLE.pas}:
	 * 
	 * <pre>
	 * Procedure ClearUndoBuffer;
	 * </pre>
	 */
	public void clearUndoBuffer() {
		proc("ClearUndoBuffer");
	}

	/**
	 * TODO: Add description
	 * <p>
	 * Original content from {@code JED_OLE.pas}:
	 * 
	 * <pre>
	 * Procedure ApplyUndo;
	 * </pre>
	 */
	public void applyUndo() {
		proc("ApplyUndo");
	}

	/**
	 * TODO: Add description
	 * <p>
	 * Original content from {@code JED_OLE.pas}:
	 * 
	 * <pre>
	 * Function GetJEDSetting(const name:string):variant;
	 * </pre>
	 * 
	 * @param name
	 *            TODO
	 * @return TODO: Add description
	 */
	public Object getJEDSetting(String name) {
		Variant value = func("GetJEDSetting", name);
		if (value == null || value.getType() == OLE.VT_NULL) {
			return null;
		}
		switch (value.getType()) {
		case OLE.VT_BOOL:
			return value.getBoolean();
		case OLE.VT_I4:
			return value.getInt();
		case OLE.VT_R8:
			return value.getDouble();
		default:
			// Either a string or unknown value type - in any case, coerce to string
			return value.getString();
		}
	}

	/**
	 * TODO: Add description
	 * <p>
	 * Original content from {@code JED_OLE.pas}:
	 * 
	 * <pre>
	 * Function IsLayerVisible(n:integer):WordBool;
	 * </pre>
	 * 
	 * @param n
	 *            TODO
	 * @return TODO: Add description
	 */
	public boolean isLayerVisible(int n) {
		return func("IsLayerVisible", n).getBoolean();
	}

	// {0.9}

	/**
	 * TODO: Add description
	 * <p>
	 * Original content from {@code JED_OLE.pas}:
	 * 
	 * <pre>
	 * procedure CheckConsistencyErrors;
	 * </pre>
	 */
	public void checkConsistencyErrors() {
		proc("CheckConsistencyErrors");
	}

	/**
	 * TODO: Add description
	 * <p>
	 * Original content from {@code JED_OLE.pas}:
	 * 
	 * <pre>
	 * procedure CheckResources;
	 * </pre>
	 */
	public void checkResources() {
		proc("CheckResources");
	}

	/**
	 * TODO: Add description
	 * <p>
	 * Original content from {@code JED_OLE.pas}:
	 * 
	 * <pre>
	 * Function NConsistencyErrors:integer;
	 * </pre>
	 * 
	 * @return TODO: Add description
	 */
	public int nConsistencyErrors() {
		return func("NConsistencyErrors").getInt();
	}

	/**
	 * TODO: Add description
	 * <p>
	 * Original content from {@code JED_OLE.pas}:
	 * 
	 * <pre>
	 * Function GetConsErrorString(n:integer):String;
	 * </pre>
	 * 
	 * @param n
	 *            TODO
	 * @return TODO: Add description
	 */
	public String getConsErrorString(int n) {
		return func("GetConsErrorString", n).getString();
	}

	/**
	 * TODO: Add description
	 * <p>
	 * Original content from {@code JED_OLE.pas}:
	 * 
	 * <pre>
	 * Function GetConsErrorType(n:integer):integer;
	 * </pre>
	 * 
	 * @param n
	 *            TODO
	 * @return TODO: Add description
	 */
	public int getConsErrorType(int n) {
		return func("GetConsErrorType", n).getInt();
	}

	/**
	 * TODO: Add description
	 * <p>
	 * Original content from {@code JED_OLE.pas}:
	 * 
	 * <pre>
	 * Function GetConsErrorSector(n:integer):integer;
	 * </pre>
	 * 
	 * @param n
	 *            TODO
	 * @return TODO: Add description
	 */
	public int getConsErrorSector(int n) {
		return func("GetConsErrorSector", n).getInt();
	}

	/**
	 * TODO: Add description
	 * <p>
	 * Original content from {@code JED_OLE.pas}:
	 * 
	 * <pre>
	 * Function GetConsErrorSurface(n:integer):integer;
	 * </pre>
	 * 
	 * @param n
	 *            TODO
	 * @return TODO: Add description
	 */
	public int getConsErrorSurface(int n) {
		return func("GetConsErrorSurface", n).getInt();
	}

	/**
	 * TODO: Add description
	 * <p>
	 * Original content from {@code JED_OLE.pas}:
	 * 
	 * <pre>
	 * Function GetConsErrorThing(n:integer):integer;
	 * </pre>
	 * 
	 * @param n
	 *            TODO
	 * @return TODO: Add description
	 */
	public int getConsErrorThing(int n) {
		return func("GetConsErrorThing", n).getInt();
	}

	/**
	 * TODO: Add description
	 * <p>
	 * Original content from {@code JED_OLE.pas}:
	 * 
	 * <pre>
	 * Function GetConsErrorCog(n:integer):integer;
	 * </pre>
	 * 
	 * @param n
	 *            TODO
	 * @return TODO: Add description
	 */
	public int getConsErrorCog(int n) {
		return func("GetConsErrorCog", n).getInt();
	}

	/**
	 * TODO: Add description
	 * <p>
	 * Original content from {@code JED_OLE.pas}:
	 * 
	 * <pre>
	 * Procedure ClearExtraObjects;
	 * </pre>
	 */
	public void clearExtraObjects() {
		proc("ClearExtraObjects");
	}

	/**
	 * TODO: Add description
	 * <p>
	 * Original content from {@code JED_OLE.pas}:
	 * 
	 * <pre>
	 * Function AddExtraVertex(x,y,z:double):integer;
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
	public int addExtraVertex(double x, double y, double z) {
		return func("AddExtraVertex", x, y, z).getInt();
	}

	/**
	 * TODO: Add description
	 * <p>
	 * Original content from {@code JED_OLE.pas}:
	 * 
	 * <pre>
	 * Function AddExtraLine(x1,y1,z1,x2,y2,z2:double):Integer;
	 * </pre>
	 * 
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
	 * @return TODO: Add description
	 */
	public int addExtraLine(double x1, double y1, double z1, double x2, double y2, double z2) {
		return func("AddExtraLine", x1, y1, z1, x2, y2, z2).getInt();
	}

	/**
	 * TODO: Add description
	 * <p>
	 * Original content from {@code JED_OLE.pas}:
	 * 
	 * <pre>
	 * Procedure DeleteExtraObject(n:integer);
	 * </pre>
	 * 
	 * @param n
	 *            TODO
	 */
	public void deleteExtraObject(int n) {
		proc("DeleteExtraObject", n);
	}

	// {Properties}

	/**
	 * TODO: Add description
	 * <p>
	 * Original content from {@code JED_OLE.pas}:
	 * 
	 * <pre>
	 * Property IsPreviewActive:WordBool read getIsPreviewActive;
	 * </pre>
	 * 
	 * @return TODO: Add description
	 */
	public boolean getIsPreviewActive() {
		return get("IsPreviewActive").getBoolean();
	}

	/**
	 * TODO: Add description
	 * <p>
	 * Original content from {@code JED_OLE.pas}:
	 * 
	 * <pre>
	 * Property Version:double read GetVersion;
	 * </pre>
	 * 
	 * @return TODO: Add description
	 */
	public double getVersion() {
		return get("Version").getDouble();
	}

	/**
	 * TODO: Add description
	 * <p>
	 * Original content from {@code JED_OLE.pas}:
	 * 
	 * <pre>
	 * Property MapMode:integer read GetMapMode write SetMapMode;
	 * </pre>
	 * 
	 * @return TODO: Add description
	 */
	public int getMapMode() {
		return get("MapMode").getInt();
	}

	/**
	 * TODO: Add description
	 * <p>
	 * Original content from {@code JED_OLE.pas}:
	 * 
	 * <pre>
	 * Property MapMode:integer read GetMapMode write SetMapMode;
	 * </pre>
	 * 
	 * @param mapMode
	 *            TODO
	 */
	public void setMapMode(int mapMode) {
		set("MapMode", mapMode);
	}

	/**
	 * TODO: Add description
	 * <p>
	 * Original content from {@code JED_OLE.pas}:
	 * 
	 * <pre>
	 * Property CurSC:integer read GetCurSC write SetCurSC;
	 * </pre>
	 * 
	 * @return TODO: Add description
	 */
	public int getCurSC() {
		return get("CurSC").getInt();
	}

	/**
	 * TODO: Add description
	 * <p>
	 * Original content from {@code JED_OLE.pas}:
	 * 
	 * <pre>
	 * Property CurSC:integer read GetCurSC write SetCurSC;
	 * </pre>
	 * 
	 * @param curSC
	 *            TODO
	 */
	public void setCurSC(int curSC) {
		set("CurSC", curSC);
	}

	/**
	 * TODO: Add description
	 * <p>
	 * Original content from {@code JED_OLE.pas}:
	 * 
	 * <pre>
	 * Property CurTH:integer read GetCurTH write SetCurTH;
	 * </pre>
	 * 
	 * @return TODO: Add description
	 */
	public int getCurTH() {
		return get("CurTH").getInt();
	}

	/**
	 * TODO: Add description
	 * <p>
	 * Original content from {@code JED_OLE.pas}:
	 * 
	 * <pre>
	 * Property CurTH:integer read GetCurTH write SetCurTH;
	 * </pre>
	 * 
	 * @param curTH
	 *            TODO
	 */
	public void setCurTH(int curTH) {
		set("CurTH", curTH);
	}

	/**
	 * TODO: Add description
	 * <p>
	 * Original content from {@code JED_OLE.pas}:
	 * 
	 * <pre>
	 * Property CurLT:integer read GetCurLT write SetCurLT;
	 * </pre>
	 * 
	 * @return TODO: Add description
	 */
	public int getCurLT() {
		return get("CurLT").getInt();
	}

	/**
	 * TODO: Add description
	 * <p>
	 * Original content from {@code JED_OLE.pas}:
	 * 
	 * <pre>
	 * Property CurLT:integer read GetCurLT write SetCurLT;
	 * </pre>
	 * 
	 * @param curLT
	 *            TODO
	 */
	public void setCurLT(int curLT) {
		set("CurLT", curLT);
	}

	/**
	 * TODO: Add description
	 * <p>
	 * Original content from {@code JED_OLE.pas}:
	 * 
	 * <pre>
	 * Property CurSF:integer read prGetCurSF;
	 * </pre>
	 * 
	 * @return TODO: Add description
	 */
	public int prGetCurSF() {
		return get("CurSF").getInt();
	}

	/**
	 * TODO: Add description
	 * <p>
	 * Original content from {@code JED_OLE.pas}:
	 * 
	 * <pre>
	 * Property CurED:integer read prGetCurED;
	 * </pre>
	 * 
	 * @return TODO: Add description
	 */
	public int prGetCurED() {
		return get("CurED").getInt();
	}

	/**
	 * TODO: Add description
	 * <p>
	 * Original content from {@code JED_OLE.pas}:
	 * 
	 * <pre>
	 * Property CurVX:integer read prGetCurVX;
	 * </pre>
	 * 
	 * @return TODO: Add description
	 */
	public int prGetCurVX() {
		return get("CurVX").getInt();
	}

	/**
	 * TODO: Add description
	 * <p>
	 * Original content from {@code JED_OLE.pas}:
	 * 
	 * <pre>
	 * Property CurFR:integer read prGetCurFR;
	 * </pre>
	 * 
	 * @return TODO: Add description
	 */
	public int prGetCurFR() {
		return get("CurFR").getInt();
	}

	/**
	 * TODO: Add description
	 * <p>
	 * Original content from {@code JED_OLE.pas}:
	 * 
	 * <pre>
	 * Property Level:Variant read GetLevel;
	 * </pre>
	 * 
	 * @return TODO: Add description
	 */
	public Level getLevel() {
		OleAutomation automation = get("Level").getAutomation();
		return new Level(automation);
	}

	/**
	 * TODO: Add description
	 * <p>
	 * Original content from {@code JED_OLE.pas}:
	 * 
	 * <pre>
	 * Property GridX:double read GetGridX;
	 * </pre>
	 * 
	 * @return TODO: Add description
	 */
	public double getGridX() {
		return get("GridX").getDouble();
	}

	/**
	 * TODO: Add description
	 * <p>
	 * Original content from {@code JED_OLE.pas}:
	 * 
	 * <pre>
	 * Property GridY:double read GetGridY;
	 * </pre>
	 * 
	 * @return TODO: Add description
	 */
	public double getGridY() {
		return get("GridY").getDouble();
	}

	/**
	 * TODO: Add description
	 * <p>
	 * Original content from {@code JED_OLE.pas}:
	 * 
	 * <pre>
	 * Property GridZ:double read GetGridZ;
	 * </pre>
	 * 
	 * @return TODO: Add description
	 */
	public double getGridZ() {
		return get("GridZ").getDouble();
	}

	/**
	 * TODO: Add description
	 * <p>
	 * Original content from {@code JED_OLE.pas}:
	 * 
	 * <pre>
	 * Property CamX:double read GetCamX;
	 * </pre>
	 * 
	 * @return TODO: Add description
	 */
	public double getCamX() {
		return get("CamX").getDouble();
	}

	/**
	 * TODO: Add description
	 * <p>
	 * Original content from {@code JED_OLE.pas}:
	 * 
	 * <pre>
	 * Property CamY:double read GetCamY;
	 * </pre>
	 * 
	 * @return TODO: Add description
	 */
	public double getCamY() {
		return get("CamY").getDouble();
	}

	/**
	 * TODO: Add description
	 * <p>
	 * Original content from {@code JED_OLE.pas}:
	 * 
	 * <pre>
	 * Property CamZ:double read GetCamZ;
	 * </pre>
	 * 
	 * @return TODO: Add description
	 */
	public double getCamZ() {
		return get("CamZ").getDouble();
	}

	/**
	 * TODO: Add description
	 * <p>
	 * Original content from {@code JED_OLE.pas}:
	 * 
	 * <pre>
	 * Property GameDir:String read GetGameDir;
	 * </pre>
	 * 
	 * @return TODO: Add description
	 */
	public String getGameDir() {
		return get("GameDir").getString();
	}

	/**
	 * TODO: Add description
	 * <p>
	 * Original content from {@code JED_OLE.pas}:
	 * 
	 * <pre>
	 * Property ProjectDir:String read GetProjectDir;
	 * </pre>
	 * 
	 * @return TODO: Add description
	 */
	public String getProjectDir() {
		return get("ProjectDir").getString();
	}

	/**
	 * TODO: Add description
	 * <p>
	 * Original content from {@code JED_OLE.pas}:
	 * 
	 * <pre>
	 * Property JEDDir:String read GetJedDir;
	 * </pre>
	 * 
	 * @return TODO: Add description
	 */
	public String getJedDir() {
		return get("JEDDir").getString();
	}

	/**
	 * TODO: Add description
	 * <p>
	 * Original content from {@code JED_OLE.pas}:
	 * 
	 * <pre>
	 * Property IsMots:WordBool read GetIsMots write SetIsMots;
	 * </pre>
	 * 
	 * @return TODO: Add description
	 */
	public boolean getIsMots() {
		return get("IsMots").getBoolean();
	}

	/**
	 * TODO: Add description
	 * <p>
	 * Original content from {@code JED_OLE.pas}:
	 * 
	 * <pre>
	 * Property IsMots:WordBool read GetIsMots write SetIsMots;
	 * </pre>
	 * 
	 * @param isMots
	 *            TODO
	 */
	public void setIsMots(boolean isMots) {
		set("IsMots", isMots);
	}

	// {0.85}

	/**
	 * TODO: Add description
	 * <p>
	 * Original content from {@code JED_OLE.pas}:
	 * 
	 * <pre>
	 * Property LevelFile:String read GetLevelFile;
	 * </pre>
	 * 
	 * @return TODO: Add description
	 */
	public String getLevelFile() {
		return get("LevelFile").getString();
	}

	/**
	 * TODO: Add description
	 * <p>
	 * Original content from {@code JED_OLE.pas}:
	 * 
	 * <pre>
	 * Property Templates:variant read GetTemplates;
	 * </pre>
	 * 
	 * @return TODO: Add description
	 */
	public Templates getTemplates() {
		OleAutomation automation = get("Templates").getAutomation();
		return new Templates(automation);
	}

	// {0.9}

	/**
	 * TODO: Add description
	 * <p>
	 * Original content from {@code JED_OLE.pas}:
	 * 
	 * <pre>
	 * Property CurEX:integer read GetCurEX write SetCurEX;
	 * </pre>
	 * 
	 * @return TODO: Add description
	 */
	public int getCurEX() {
		return get("CurEX").getInt();
	}

	/**
	 * TODO: Add description
	 * <p>
	 * Original content from {@code JED_OLE.pas}:
	 * 
	 * <pre>
	 * Property CurEX:integer read GetCurEX write SetCurEX;
	 * </pre>
	 * 
	 * @param curEX
	 *            TODO
	 */
	public void setCurEX(int curEX) {
		set("CurEX", curEX);
	}

	// Factory methods

	/**
	 * Locate the running JED application by its default program ID.
	 * 
	 * @return a {@link JedApp} instance
	 */
	public static JedApp getInstance() {
		return getInstance(JED_PROG_ID);
	}

	/**
	 * Locate the running JED application using the specified program ID. This would
	 * be useful if JED ever registers itself with a different ID than the current
	 * default.
	 * 
	 * @param progId
	 *            the program ID to use for locating JED
	 * @return a {@link JedApp} instance
	 * @see #getInstance()
	 */
	public static JedApp getInstance(String progId) {
		OleAutomation automation = new OleAutomation(progId);
		return new JedApp(automation);
	}

}
