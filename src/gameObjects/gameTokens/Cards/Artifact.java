package gameObjects.gameTokens.Cards;

import java.util.EnumSet;

import gameObjects.Expansion;

public final class Artifact extends Item {

	public Artifact(String name, Expansion expansion, EnumSet<ItemFlags> flags) {
		super(name, expansion, flags);
	}

}
