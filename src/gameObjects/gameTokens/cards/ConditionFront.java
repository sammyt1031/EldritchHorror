package gameObjects.gameTokens.Cards;

import java.util.EnumSet;

import gameObjects.gameTokens.Cards.Condition.ConditionFlags;

final class ConditionFront {

	private final String name;
	private final EnumSet<ConditionFlags> flags;
	
	ConditionFront(String name, EnumSet<ConditionFlags> flags) {
		this.name = name;
		this.flags = flags;
	}

	final String getName() {
		return name;
	}

	final EnumSet<ConditionFlags> getFlags() {
		return flags;
	}

}
