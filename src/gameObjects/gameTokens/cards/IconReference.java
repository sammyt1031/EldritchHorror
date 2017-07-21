package gameObjects.gameTokens.cards;

import utilities.Constants;

public final class IconReference {
	
	private static IconReference IconRef = null;
	
	public static final void initIconRef(int numPlayers) {
		
		if (numPlayers < Constants.MIN_NUM_PLAYERS || numPlayers > Constants.MAX_NUM_PLAYERS) {
			System.err.printf("ERROR: Number of players must be between %d and %d. Current number of players: %d", 
					Constants.MIN_NUM_PLAYERS,
					Constants.MAX_NUM_PLAYERS,
					numPlayers);
		}
		else if (IconRef == null) {
			// TODO Add SQL logic to get correct values for IconRef
			IconRef = new IconReference(numPlayers, 0, 0, 0);
		}
		
	}
	
	public static final int getHalfNumPlayers() {
		
		if (IconRef != null) {
			return (IconRef.numPlayers + 1) / 2;			
		} 

		return -1;
		
	}
	
	/**
	 * @return the spawnGates
	 */
	public static final int getSpawnGates() {
		
		if (IconRef != null) {
			return IconRef.spawnGates;
		} 

		return -1;
		
	}

	/**
	 * @return the spawnClues
	 */
	public static final int getSpawnClues() {
		
		if (IconRef != null) {
			return IconRef.spawnClues;			
		}
		
		return -1;
		
	}

	/**
	 * @return the monsterSurge
	 */
	public static final int getMonsterSurge() {
		
		if (IconRef != null) {
			return IconRef.monsterSurge;			
		}

		return -1;
		
	}
	
	private final int numPlayers;
	private final int spawnGates;
	private final int spawnClues;
	private final int monsterSurge;
	
	private IconReference(int numPlayers, int spawnGates, int spawnClues, int monsterSurge) {
		this.numPlayers = numPlayers;
		this.spawnGates = spawnGates;
		this.spawnClues = spawnClues;
		this.monsterSurge = monsterSurge;
	}
	
}
