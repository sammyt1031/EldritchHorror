package gameObjects;

import gameObjects.Expansion;

public abstract class GamePiece {
	
	private final String name;
	private final Expansion expansion;
	
	protected GamePiece(String name, Expansion expansion) {
		this.name = name;
		this.expansion = expansion;
	}

	/**
	 * @return the expansion this game piece corresponds to
	 */
	public final String getName() {
		return this.name;
	}
	
	/**
	 * @return the expansion this game piece corresponds to
	 */
	public final Expansion getExpansion() {
		return this.expansion;
	}
	
}