package gameObjects.gameTokens.Cards;

import gameObjects.Expansion;

public enum ConditionID {

	AMNESIA(ConditionFront.Amnesia),
	BACK_INJURY(ConditionFront.BackInjury),
	BLESSED(ConditionFront.Blessed),
	CURSED(ConditionFront.Cursed),
	DARK_PACT(ConditionFront.DarkPact),
	DEBT(ConditionFront.Debt),
	DETAINED(ConditionFront.Detained),
	HALLUCINATIONS(ConditionFront.Hallucinations),
	INTERNAL_INJURY(ConditionFront.InternalInjury),
	LEG_INJURY(ConditionFront.LegInjury),
	LOST_TIME_SPACE(ConditionFront.LostTimeSpace),
	PARANOIA(ConditionFront.Paranoia),
	POISONED(ConditionFront.Poisoned);
	
	private final Condition condition;
	
	private ConditionID(ConditionFront front) {
		condition = new Condition(front, Expansion.VANILLA);
	}
	
}
