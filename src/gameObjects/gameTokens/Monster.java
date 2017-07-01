package gameObjects.gameTokens;

import gameObjects.*;
import gameObjects.locationData.Location;

public final class Monster extends GamePiece {

	private final int horror_;
	private final int willMod_;
	private final int damage_;
	private final int strMod_;
	private final int maxHlth_;
	
	private int currHlth_;
	private Location currLoc_;
	
	Monster(String name, Expansion expansion, int horror, int willMod, int damage, int strMod, int maxHlth) {
		super(name, expansion);
		horror_= horror;
		willMod_ = willMod;
		damage_ = damage;
		strMod_ = strMod;
		maxHlth_ = maxHlth;
		
		currHlth_ = maxHlth;
	}
	
	/**
	 * @return the currHlth_
	 */
	public final int getCurrHlth_() {
		return currHlth_;
	}

	/**
	 * @param currHlth_ the currHlth_ to set
	 */
	public final void setCurrHlth_(int currHlth_) {
		this.currHlth_ = currHlth_;
	}

	/**
	 * @return the currLoc_
	 */
	public final Location getCurrLoc_() {
		return currLoc_;
	}

	/**
	 * @param currLoc_ the currLoc_ to set
	 */
	public final void setCurrLoc_(Location currLoc_) {
		this.currLoc_ = currLoc_;
	}

	/**
	 * @return the horror_
	 */
	public final int getHorror_() {
		return horror_;
	}

	/**
	 * @return the willMod_
	 */
	public final int getWillMod_() {
		return willMod_;
	}

	/**
	 * @return the damage_
	 */
	public final int getDamage_() {
		return damage_;
	}

	/**
	 * @return the strMod_
	 */
	public final int getStrMod_() {
		return strMod_;
	}

	/**
	 * @return the maxHlth_
	 */
	public final int getMaxHlth_() {
		return maxHlth_;
	}
	
}
