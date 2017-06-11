package gameObjects.gameTokens.Cards;

import java.util.EnumSet;

import gameObjects.Expansion;

public final class Asset extends Item {

	private final int cost;
	
	public Asset(String name, Expansion expansion, EnumSet<ItemFlags> flags, int cost) {
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
