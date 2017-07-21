package gameObjects;

import gameObjects.gameTokens.Monster;

public final class MonsterInPlay {

	private final String monsterID;
	
	private int currHealth;
	private int currLocID;
	
	public MonsterInPlay(final String monsterID, final int startingLoc) {
		this.monsterID = monsterID;
		this.currHealth = Monster.getMonster(monsterID).getMaxHealth();
		this.currLocID = startingLoc;		
	}
	
	public final Monster getMonster() {
		return Monster.getMonster(this.monsterID);
	}

	public final int getCurrHealth() {
		return currHealth;
	}

	public final void setCurrHealth(final int currHealth) {
		this.currHealth = currHealth;
	}

	public final int getCurrLocID() {
		return currLocID;
	}

	public final void setCurrLocID(final int currLocID) {
		this.currLocID = currLocID;
	}
	
}
