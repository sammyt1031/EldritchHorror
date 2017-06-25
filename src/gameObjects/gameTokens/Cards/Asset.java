package gameObjects.gameTokens.Cards;

import java.util.EnumSet;

import gameObjects.Expansion;

public final class Asset extends Item {

	private final int cost;
	
	Asset(String name, Expansion expansion, int cost, EnumSet<ItemFlags> flags) {
		super(name, expansion, flags);
		
		this.cost = cost;
	}

	/**
	 * @return the cost
	 */
	public final int getCost() {
		return cost;
	}

}
