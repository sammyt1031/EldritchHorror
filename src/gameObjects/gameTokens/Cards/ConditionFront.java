package gameObjects.gameTokens.Cards;

import java.util.EnumSet;

import gameObjects.gameTokens.Cards.Condition.ConditionFlags;

final class ConditionFront {

	static final ConditionFront Amnesia = new ConditionFront("Amnesia", EnumSet.of(ConditionFlags.MADNESS));
	static final ConditionFront BackInjury = new ConditionFront("Back Injury", EnumSet.of(ConditionFlags.INJURY));
	static final ConditionFront Blessed = new ConditionFront("Blessed", EnumSet.of(ConditionFlags.BOON));
	static final ConditionFront Cursed = new ConditionFront("Cursed", EnumSet.of(ConditionFlags.BANE));
	static final ConditionFront DarkPact = new ConditionFront("Dark Pact", EnumSet.of(ConditionFlags.DEAL));
	static final ConditionFront Debt = new ConditionFront("Debt", EnumSet.of(ConditionFlags.DEAL, ConditionFlags.COMMON));
	static final ConditionFront Detained = new ConditionFront("Detained", EnumSet.of(ConditionFlags.RESTRICTION));
	static final ConditionFront Hallucinations = new ConditionFront("Hallucinations", EnumSet.of(ConditionFlags.MADNESS));
	static final ConditionFront InternalInjury = new ConditionFront("Internal Injury", EnumSet.of(ConditionFlags.INJURY));
	static final ConditionFront LegInjury = new ConditionFront("Leg Injury", EnumSet.of(ConditionFlags.INJURY));
	static final ConditionFront LostTimeSpace = new ConditionFront("Lost in Time and Space", EnumSet.of(ConditionFlags.RESTRICTION));
	static final ConditionFront Paranoia = new ConditionFront("Paranoia", EnumSet.of(ConditionFlags.MADNESS));
	static final ConditionFront Poisoned = new ConditionFront("Poisoned", EnumSet.of(ConditionFlags.ILLNESS));
			
	private final String name;
	private final EnumSet<ConditionFlags> flags;
	
	private ConditionFront(String name, EnumSet<ConditionFlags> flags) {
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
