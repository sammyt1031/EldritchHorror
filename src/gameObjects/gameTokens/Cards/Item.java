package gameObjects.gameTokens.Cards;

import java.util.EnumSet;

import gameObjects.Expansion;

public abstract class Item extends Card {
	
	public static enum ItemFlags {
		ITEM, TOME, WEAPON, MAGICAL, TRINKET, ALLY, SERVICE, TEAMWORK, ELIXIR;
	}
	
	private final EnumSet<ItemFlags> flags;
	
	protected Item(String name, Expansion expansion, EnumSet<ItemFlags> flags) {
		super(name, expansion);
		
		this.flags = flags;
	}

	public final boolean isItemType(ItemFlags flag) {
		
		if (this.flags.contains(flag)) {
			return true;
		}
		
		return false;
	}

}
