package gameObjects.gameTokens;

import java.util.*;

//public enum AncientOne {
//	
//		AZATHOTH(	"Azathoth", 		Expansion.VANILLA,			15,	new int[][]{new int[]{	1,	2,	1	},
//																					new int[]{	2,	3,	1	},
//																					new int[]{	2,	4, 	0	}}),
//		
//		SHUB_NIG(	"Shub-Niggurath",	Expansion.VANILLA,			13,	new int[][]{new int[]{	1,	2,	1	},
//																					new int[]{	3,	2,	1	},
//																					new int[]{	2,	4, 	0	}}),
//		
//		CTHULHU(	"Cthulhu",			Expansion.VANILLA,			12,	new int[][]{new int[]{	0,	2,	2	},
//																					new int[]{	1,	3,	0	},
//																					new int[]{	3,	4, 	0	}}),
//		
//		YOG_SOTH(	"Yog-Sothoth",		Expansion.VANILLA,			14,	new int[][]{new int[]{	0,	2,	1	},
//																					new int[]{	2,	3,	1	},
//																					new int[]{	3,	4, 	0	}}),
//		
//		YIG(		"Yig", 				Expansion.FORSAKEN_LORE,	10,	new int[][]{new int[]{	1,	2,	1	},
//																					new int[]{	2,	3,	1	},
//																					new int[]{	2,	4, 	0	}});
//		
//	
//	Map<String, AncientOne> Azathoth = new HashMap<String, AncientOne>();
//	
//		public static final int MYTHOS_INIT_DIM_SIZE = 3;
//		
//		private final AncientOneObj ancientOne_;
//		
//		private AncientOne(String name, Expansion expansion, int doomStart, int [][] mythosInit ) {
//			ancientOne_ = new AncientOneObj(name, expansion, doomStart, mythosInit);
//		}
//		
//		/**
//		 * @return the starting location of the doom track
//		 */
//		public final int getDoomStart_() {
//			return ancientOne_.doomStart_;
//		}
//
//		/**
//		 * @return the Mythos deck initialization array
//		 */
//		public final int[][] getMythosInit_() {
//			return ancientOne_.mythosInit_;
//		}
//		
//		public final AncientOneObj getAncientOne() {
//			return ancientOne_;
//		}
//		
//		private final class AncientOneObj extends GamePiece {
//			
//			private final int doomStart_;
//			private final int [][] mythosInit_;
//			
//			public AncientOneObj(String name, Expansion expansion, int doomStart, int [][] mythosInit) {
//				super(name, expansion);
//				doomStart_ = doomStart;
//				mythosInit_ = mythosInit;
//			}
//						
//		}
//		
//		static {
//			Azathoth = Collections.unmodifiableMap(Azathoth);
//		}
//		
//	}

public final class AncientOne extends GamePiece {
	
	public static enum AncientOneID {
		AZATHOTH, SHUB_NIG, CTHULHU, YOG_SOTH, YIG;
	}
	
	
	private static final AncientOne Azathoth = 
			new AncientOne("Azathoth", 			Expansion.VANILLA,	15,	new int[][]{new int[]{	1,	2,	1	},
																					new int[]{	2,	3,	1	},
																					new int[]{	2,	4, 	0	}});
	
	private static final AncientOne Shub_Nig = 
			new AncientOne("Shub-Niggurath",	Expansion.VANILLA,	13,	new int[][]{new int[]{	1,	2,	1	},
																					new int[]{	3,	2,	1	},
																					new int[]{	2,	4, 	0	}});
	
	private static final AncientOne Cthulhu = 
			new AncientOne("Cthulhu",			Expansion.VANILLA,	12,	new int[][]{new int[]{	0,	2,	2	},
																					new int[]{	1,	3,	0	},
																					new int[]{	3,	4, 	0	}});
	
	private static final AncientOne Yog_Soth = 
			new AncientOne ("Yog-Sothoth",		Expansion.VANILLA,	14,	new int[][]{new int[]{	0,	2,	1	},
																					new int[]{	2,	3,	1	},
																					new int[]{	3,	4, 	0	}});

	private static final AncientOne Yig = 
			new AncientOne("Yig", 		Expansion.FORSAKEN_LORE,	10,	new int[][]{new int[]{	1,	2,	1	},
																					new int[]{	2,	3,	1	},
																					new int[]{	2,	4, 	0	}});
	
	private static final Map<AncientOneID, AncientOne> ANCIENT_ONES = new HashMap<AncientOneID, AncientOne>();

	static {
		ANCIENT_ONES.put(AncientOneID.AZATHOTH, Azathoth);
		ANCIENT_ONES.put(AncientOneID.SHUB_NIG, Shub_Nig);
		ANCIENT_ONES.put(AncientOneID.CTHULHU, Cthulhu);
		ANCIENT_ONES.put(AncientOneID.YOG_SOTH, Yog_Soth);
		ANCIENT_ONES.put(AncientOneID.YIG, Yig);
	}
	
	public static final int getDoomStart_(AncientOneID ancientOne) {
		return ANCIENT_ONES.get(ancientOne).doomStart_;
	}
	
	public static final int [][] getMythosInit_(AncientOneID ancientOne) {
		return ANCIENT_ONES.get(ancientOne).mythosInit_;
	}
	
	private final int doomStart_;
	private final int [][] mythosInit_;
	
	private AncientOne(String name, Expansion expansion, int doomStart, int [][] mythosInit) {
		super(name, expansion);
		doomStart_ = doomStart;
		mythosInit_ = mythosInit;
	}

}
	
	
		

