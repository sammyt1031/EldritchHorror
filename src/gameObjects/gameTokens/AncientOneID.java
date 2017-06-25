package gameObjects.gameTokens;

import gameObjects.Expansion;

public enum AncientOneID {

	AZATHOTH(	"Azathoth", 		Expansion.VANILLA,	15,	new int[][]{new int[]{	1,	2,	1	},
																		new int[]{	2,	3,	1	},
																		new int[]{	2,	4, 	0	}}),
	
	CTHULHU(	"Cthulhu",			Expansion.VANILLA,	12,	new int[][]{new int[]{	0,	2,	2	},
																		new int[]{	1,	3,	0	},
																		new int[]{	3,	4, 	0	}}),

	SHUB_NIG(	"Shub-Niggurath",	Expansion.VANILLA,	13,	new int[][]{new int[]{	1,	2,	1	},
																		new int[]{	3,	2,	1	},
																		new int[]{	2,	4, 	0	}}),
	
	YOG_SOTH(	"Yog-Sothoth",		Expansion.VANILLA,	14,	new int[][]{new int[]{	0,	2,	1	},
																		new int[]{	2,	3,	1	},
																		new int[]{	3,	4, 	0	}}),
	
	YIG(		"Yig", 		Expansion.FORSAKEN_LORE,	10,	new int[][]{new int[]{	1,	2,	1	},
																		new int[]{	2,	3,	1	},
																		new int[]{	2,	4, 	0	}});
	
	private final AncientOne ancientOne_;
	
	private AncientOneID(String name, Expansion expansion, int doomStart, int [][] mythosInit) {
		ancientOne_ = new AncientOne(name, expansion, doomStart, mythosInit);
	}

	/**
	 * @return the ancientOne_
	 */
	public final AncientOne getAncientOne_() {
		return ancientOne_;
	}
	
}