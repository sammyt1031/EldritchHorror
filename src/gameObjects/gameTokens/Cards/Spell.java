package gameObjects.gameTokens.Cards;

import gameObjects.Expansion;

public final class Spell extends Card {

	public static enum Type {
		RITUAL, INCANTATION;
	}
	
	private final Type type;
	
	public Spell(String name, Expansion expansion, Type type) {
		super(name, expansion);
		
		this.type = type;
	}

	/**
	 * @return the type
	 */
	public final Type getType() {
		return type;
	}

}
