package gameObjects.gameTokens;

import gameObjects.locationData.LocationID;

public enum HeroID {
	
	AKACHI_ONYELE(		"Akachi Onyele", 		5, 7, 3, 2, 2, 2, 4, LocationID.SPACE15			),
	CHARLIE_KANE(		"Charlie Kane", 		4, 8, 2, 4, 3, 2, 2, LocationID.SAN_FRAN		),
	DIANA_STANLEY(		"Diana Stanley", 		7, 5, 4, 2, 3, 3, 1, LocationID.SPACE7			),
	JACQUELINE_FINE(	"Jacqueline Fine", 		4, 8, 4, 2, 3, 1, 3, LocationID.SPACE5			),
	JIM_CULVER(			"Jim Culver", 			7, 5, 3, 3, 2, 2, 3, LocationID.SPACE6			),
	LEO_ANDERSON(		"Leo Anderson", 		6, 6, 2, 2, 3, 3, 3, LocationID.BUENOS_AIRES	),
	LILY_CHEN(			"Lily Chen", 			6, 6, 2, 2, 2, 4, 3, LocationID.SHANGHAI		),
	LOLA_HAYES(			"Lola Hayes", 			5, 7, 2, 4, 2, 2, 3, LocationID.TOKYO			),
	MARK_HARRIGAN(		"Mark Harrigan", 		8, 4, 1, 2, 2, 4, 4, LocationID.SPACE14			),
	NORMAN_WITHERS(		"Norman Withers", 		5, 7, 3, 1, 3, 2, 4, LocationID.ARKHAM			),
	SILAS_MARSH(		"Silas Marsh", 			8, 4, 1, 3, 3, 3, 3, LocationID.SYDNEY			),
	TRISH_SCARBOROUGH(	"Trish Scarborough", 	7, 5, 1, 3, 4, 3, 2, LocationID.SPACE16			);
	
	private final Hero hero_;
	
	private HeroID(	String name, int maxHlth, int maxSan, int baseLore, int baseInf, int baseObs, int baseStr, int baseWill, LocationID startLoc) {		
		hero_ = new Hero(name, maxHlth, maxSan, baseLore, baseInf, baseObs, baseStr, baseWill, startLoc);		
	}

	/**
	 * @return the hero_
	 */
	public final Hero getHero_() {
		return hero_;
	}
		
}