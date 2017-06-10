package gameObjects.gameTokens;

import gameObjects.locationData.Location;

public enum HeroID {
	
	AKACHI_ONYELE(		"Akachi Onyele", 		5, 7, 3, 2, 2, 2, 4, Location.SPACE15			),
	CHARLIE_KANE(		"Charlie Kane", 		4, 8, 2, 4, 3, 2, 2, Location.SAN_FRAN			),
	DIANA_STANLEY(		"Diana Stanley", 		7, 5, 4, 2, 3, 3, 1, Location.SPACE7			),
	JACQUELINE_FINE(	"Jacqueline Fine", 		4, 8, 4, 2, 3, 1, 3, Location.SPACE5			),
	JIM_CULVER(			"Jim Culver", 			7, 5, 3, 3, 2, 2, 3, Location.SPACE6			),
	LEO_ANDERSON(		"Leo Anderson", 		6, 6, 2, 2, 3, 3, 3, Location.BUENOS_AIRES		),
	LILY_CHEN(			"Lily Chen", 			6, 6, 2, 2, 2, 4, 3, Location.SHANGHAI			),
	LOLA_HAYES(			"Lola Hayes", 			5, 7, 2, 4, 2, 2, 3, Location.TOKYO				),
	MARK_HARRIGAN(		"Mark Harrigan", 		8, 4, 1, 2, 2, 4, 4, Location.SPACE14			),
	NORMAN_WITHERS(		"Norman Withers", 		5, 7, 3, 1, 3, 2, 4, Location.ARKHAM			),
	SILAS_MARSH(		"Silas Marsh", 			8, 4, 1, 3, 3, 3, 3, Location.SYDNEY			),
	TRISH_SCARBOROUGH(	"Trish Scarborough", 	7, 5, 1, 3, 4, 3, 2, Location.SPACE16			);
	
	private final String name_;
	private final int maxHlth_;
	private final int maxSan_;
	private final int baseLore_;
	private final int baseInf_;
	private final int baseObs_;
	private final int baseStr_;
	private final int baseWill_;
	private final Location startLoc_;
	
	private HeroID(	String name, 
						int maxHlth, 
						int maxSan, 
						int baseLore, 
						int baseInf, 
						int baseObs, 
						int baseStr, 
						int baseWill, 
						Location startLoc) {
		name_ = name;
		maxHlth_ = maxHlth;
		maxSan_ = maxSan;
		baseLore_ = baseLore;
		baseInf_ = baseInf;
		baseObs_ = baseObs;
		baseStr_ = baseStr;
		baseWill_ = baseWill;
		startLoc_ = startLoc;
	}
	
	/**
	 * @return the name_
	 */
	public final String getName_() {
		return name_;
	}

	/**
	 * @return the maxHlth_
	 */
	public final int getMaxHlth_() {
		return maxHlth_;
	}

	/**
	 * @return the maxSan_
	 */
	public final int getMaxSan_() {
		return maxSan_;
	}

	/**
	 * @return the baseLore_
	 */
	public final int getBaseLore_() {
		return baseLore_;
	}

	/**
	 * @return the baseInf_
	 */
	public final int getBaseInf_() {
		return baseInf_;
	}

	/**
	 * @return the baseObs_
	 */
	public final int getBaseObs_() {
		return baseObs_;
	}

	/**
	 * @return the baseStr_
	 */
	public final int getBaseStr_() {
		return baseStr_;
	}

	/**
	 * @return the baseWill_
	 */
	public final int getBaseWill_() {
		return baseWill_;
	}

	/**
	 * @return the startLoc_
	 */
	public final Location getStartLoc_() {
		return startLoc_;
	}
	
}
