package gameObjects.gameTokens;

import gameObjects.Expansion;
import gameObjects.GamePiece;
import gameObjects.locationData.LocationID;

public final class Hero extends GamePiece {
	
	private final int maxHlth_;
	private final int maxSan_;
	private final int baseLore_;
	private final int baseInf_;
	private final int baseObs_;
	private final int baseStr_;
	private final int baseWill_;
	private final LocationID startLoc_;
	
	Hero( String name, int maxHlth, int maxSan, int baseLore, int baseInf, int baseObs, int baseStr, int baseWill, LocationID startLoc) {
		
		super(name, Expansion.VANILLA);
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
	public final LocationID getStartLoc_() {
		return startLoc_;
	}
	
}
