package gameObjects.gameTokens.Cards;

import java.util.EnumSet;

import gameObjects.Expansion;

public final class Mythos extends Card {
	
	public static enum CardColor {
		GREEN, YELLOW, BLUE;
	}
	
	public static enum MythosEffects {
		ROTATE_OMEN, MONSTER_SURGE, SPAWN_GATE, SPAWN_CLUES, RECKONING, SPAWN_RUMOR;
	}

	private final CardColor color;
	private final EnumSet<MythosEffects> effects;
	
	public Mythos(String name, Expansion expansion, CardColor color, EnumSet<MythosEffects> effects) {
		super(name, expansion);

		this.color = color;
		this.effects = effects;
	}

}
