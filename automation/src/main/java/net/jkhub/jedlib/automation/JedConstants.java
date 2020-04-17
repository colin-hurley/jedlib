package net.jkhub.jedlib.automation;

/**
 * Constants that can be used with the JED plugin interface. Some constants are
 * enumerated values, which should be used as defined. Other constants are
 * flags, which may be combined into a single integer value via bitwise OR.
 */
public interface JedConstants {

	// From jed_plugins.pas

	// {Map Mode constants}

	/**
	 * TODO: Map Mode enum - Sectors
	 * <p>
	 * Originally defined in {@code jed_plugins.pas}:
	 */
	int MM_SC = 0; // {Sectors}

	/**
	 * TODO: Map Mode enum - surfaces
	 * <p>
	 * Originally defined in {@code jed_plugins.pas}:
	 */
	int MM_SF = 1; // {surfaces}

	/**
	 * TODO: Map Mode enum - vertices
	 * <p>
	 * Originally defined in {@code jed_plugins.pas}:
	 */
	int MM_VX = 2; // {vertices}

	/**
	 * TODO: Map Mode enum - Things
	 * <p>
	 * Originally defined in {@code jed_plugins.pas}:
	 */
	int MM_TH = 3; // {Things}

	/**
	 * TODO: Map Mode enum - Edges
	 * <p>
	 * Originally defined in {@code jed_plugins.pas}:
	 */
	int MM_ED = 4; // {Edges}

	/**
	 * TODO: Map Mode enum - Lights
	 * <p>
	 * Originally defined in {@code jed_plugins.pas}:
	 */
	int MM_LT = 5; // {Lights}

	/**
	 * TODO: Map Mode enum - frames
	 * <p>
	 * Originally defined in {@code jed_plugins.pas}:
	 */
	int MM_FR = 6; // {frames}

	// {PanMessage constants}

	/**
	 * TODO: PanMessage message type enum
	 * <p>
	 * Originally defined in {@code jed_plugins.pas}:
	 */
	int msg_info = 0;

	/**
	 * TODO: PanMessage message type enum
	 * <p>
	 * Originally defined in {@code jed_plugins.pas}:
	 */
	int msg_warning = 1;

	/**
	 * TODO: PanMessage message type enum
	 * <p>
	 * Originally defined in {@code jed_plugins.pas}:
	 */
	int msg_error = 2;

	// {SendKey flags}

	/**
	 * TODO: SendKey shift key flag
	 * <p>
	 * Originally defined in {@code jed_plugins.pas}:
	 */
	int sk_Ctrl = 1;

	/**
	 * TODO: SendKey shift key flag
	 * <p>
	 * Originally defined in {@code jed_plugins.pas}:
	 */
	int sk_Shift = 2;

	/**
	 * TODO: SendKey shift key flag
	 * <p>
	 * Originally defined in {@code jed_plugins.pas}:
	 */
	int sk_Alt = 4;

	// {GetConsErrorType constants}

	/**
	 * TODO: GetConsErrorType enum
	 * <p>
	 * Originally defined in {@code jed_plugins.pas}:
	 */
	int ce_none = 0;

	/**
	 * TODO: GetConsErrorType enum
	 * <p>
	 * Originally defined in {@code jed_plugins.pas}:
	 */
	int ce_sector = 1;

	/**
	 * TODO: GetConsErrorType enum
	 * <p>
	 * Originally defined in {@code jed_plugins.pas}:
	 */
	int ce_surface = 2;

	/**
	 * TODO: GetConsErrorType enum
	 * <p>
	 * Originally defined in {@code jed_plugins.pas}:
	 */
	int ce_thing = 3;

	/**
	 * TODO: GetConsErrorType enum
	 * <p>
	 * Originally defined in {@code jed_plugins.pas}:
	 */
	int ce_cog = 4;

	// {Undo change constants}

	/**
	 * TODO: Undo change enum
	 * <p>
	 * Originally defined in {@code jed_plugins.pas}:
	 */
	int uc_changed = 0;

	/**
	 * TODO: Undo change enum
	 * <p>
	 * Originally defined in {@code jed_plugins.pas}:
	 */
	int uc_added = 1;

	/**
	 * TODO: Undo change enum
	 * <p>
	 * Originally defined in {@code jed_plugins.pas}:
	 */
	int uc_deleted = 2;

	/**
	 * TODO: Undo change sector whatpart flag
	 * <p>
	 * Originally defined in {@code jed_plugins.pas}:
	 */
	int sc_values = 1;

	/**
	 * TODO: Undo change sector whatpart flag
	 * <p>
	 * Originally defined in {@code jed_plugins.pas}:
	 */
	int sc_geometry = 2;

}
