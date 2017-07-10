package gameObjects.gameTokens.Cards;

public class IconReference {
	
	private static IconReference IconRef = null;
	
	public static final void setIconRef(int numPlayers) {		
		IconRef = null;
	}
	
	public static final IconReference getIconRef() {
		return IconRef;
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

	public final int getHalfNumPlayers() {
		return (this.numPlayers + 1) / 2;
	}
	
	/**
	 * @return the spawnGates
	 */
	public final int getSpawnGates() {
		return spawnGates;
	}

	/**
	 * @return the spawnClues
	 */
	public final int getSpawnClues() {
		return spawnClues;
	}

	/**
	 * @return the monsterSurge
	 */
	public final int getMonsterSurge() {
		return monsterSurge;
	}

}
