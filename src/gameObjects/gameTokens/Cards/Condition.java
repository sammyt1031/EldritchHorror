package gameObjects.gameTokens.Cards;

import java.util.EnumSet;

import gameObjects.Expansion;

public final class Condition extends Card {
	
	public static enum ConditionFlags {
		DEAL, COMMON, MADNESS, INJURY, ILLNESS, RESTRICTION, BOON, BANE;
	}
		
	private final ConditionFront front;
	
	Condition(ConditionFront front, Expansion expansion) {
		super(front.getName(), expansion);
		
		this.front = front;
	}

	public final boolean isConditionType(ConditionFlags flag) {
		
		EnumSet<ConditionFlags> flags = this.front.getFlags();
		
		if (flags.contains(flag)) {
			return true;
		}
		
		return false;
	}

}
