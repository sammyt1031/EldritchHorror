package gameObjects.gameTokens;

import gameObjects.*;

public final class AncientOne extends GamePiece {

	static final AncientOne Azathoth = 
			new AncientOne("Azathoth", 			Expansion.VANILLA,	15,	new int[][]{new int[]{	1,	2,	1	},
																					new int[]{	2,	3,	1	},
																					new int[]{	2,	4, 	0	}});

	static final AncientOne Shub_Nig = 
			new AncientOne("Shub-Niggurath",	Expansion.VANILLA,	13,	new int[][]{new int[]{	1,	2,	1	},
																					new int[]{	3,	2,	1	},
																					new int[]{	2,	4, 	0	}});
	
	static final AncientOne Cthulhu = 
			new AncientOne("Cthulhu",			Expansion.VANILLA,	12,	new int[][]{new int[]{	0,	2,	2	},
																					new int[]{	1,	3,	0	},
																					new int[]{	3,	4, 	0	}});
	
	static final AncientOne Yog_Soth = 
			new AncientOne ("Yog-Sothoth",		Expansion.VANILLA,	14,	new int[][]{new int[]{	0,	2,	1	},
																					new int[]{	2,	3,	1	},
																					new int[]{	3,	4, 	0	}});

	static final AncientOne Yig = 
			new AncientOne("Yig", 		Expansion.FORSAKEN_LORE,	10,	new int[][]{new int[]{	1,	2,	1	},
																					new int[]{	2,	3,	1	},
																					new int[]{	2,	4, 	0	}});
	
	private final int doomStart_;
	private final int [][] mythosInit_;
	
	private AncientOne(String name, Expansion expansion, int doomStart, int [][] mythosInit) {
		super(name, expansion);
		doomStart_ = doomStart;
		mythosInit_ = mythosInit;
	}

	/**
	 * @return the doomStart_
	 */
	public final int getDoomStart_() {
		return doomStart_;
	}

	/**
	 * @return the mythosInit_
	 */
	public final int[][] getMythosInit_() {
		return mythosInit_;
	}

}