package gameObjects.gameTokens.Cards;

public enum IconReference {
	
	ONE(	1, 1, 1, 1),
	TWO(	2, 1, 1, 1),
	THREE(	3, 1, 2, 2),
	FOUR(	4, 1, 2, 2),
	FIVE(	5, 2, 3, 2),
	SIX(	6, 2, 3, 2),
	SEVEN(	7, 2, 4, 3),
	EIGHT(	8, 2, 4, 3);
	
	public static final IconReference getIconRef(int numPlayers) {
		
		for (IconReference ref : IconReference.values()) {
			if (ref.numPlayers == numPlayers) {
				return ref;
			}
		}
		
		System.err.printf("Number of players was invalid: %d!\n", numPlayers);
		System.exit(-1);
		return ONE;
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
