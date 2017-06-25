package gameObjects.gameTokens.Cards;

import java.util.EnumSet;

import gameObjects.Expansion;
import gameObjects.gameTokens.Cards.Item.ItemFlags;

public enum AssetID {
	
	AGENCY_QUAR(	"Agency Quarantine", 		Expansion.VANILLA, 4, EnumSet.of(ItemFlags.SERVICE)),
	ARCANE_MANU(	"Arcane Manuscripts", 		Expansion.VANILLA, 1, EnumSet.of(ItemFlags.ITEM, ItemFlags.TOME)),
	ARCANE_SCHOLAR(	"Arcane Scholar", 			Expansion.VANILLA, 2, EnumSet.of(ItemFlags.ALLY)),
	ARCANE_TOME(	"Arcane Tome", 				Expansion.VANILLA, 3, EnumSet.of(ItemFlags.ITEM, ItemFlags.TOME)),
	AUTO_45(		".45 Automatic", 			Expansion.VANILLA, 2, EnumSet.of(ItemFlags.ITEM, ItemFlags.WEAPON)),
	AXE(			"Axe", 						Expansion.VANILLA, 2, EnumSet.of(ItemFlags.ITEM, ItemFlags.WEAPON)),
	BANDAGES(		"Bandages", 				Expansion.VANILLA, 1, EnumSet.of(ItemFlags.ITEM)),
	BIBLE(			"King James Bible", 		Expansion.VANILLA, 2, EnumSet.of(ItemFlags.ITEM, ItemFlags.TOME)),
	BULL_WHIP(		"Bull Whip", 				Expansion.VANILLA, 1, EnumSet.of(ItemFlags.ITEM, ItemFlags.WEAPON)),
	CARB_RIFLE(		"Carbine Rifle", 			Expansion.VANILLA, 3, EnumSet.of(ItemFlags.ITEM, ItemFlags.WEAPON)),
	CAT_BURG(		"Cat Burglar", 				Expansion.VANILLA, 1, EnumSet.of(ItemFlags.ALLY)),
	CHAR_FLIGHT(	"Charter Flight", 			Expansion.VANILLA, 1, EnumSet.of(ItemFlags.SERVICE)),
	DEL_SERVICE(	"Delivery Service", 		Expansion.VANILLA, 1, EnumSet.of(ItemFlags.SERVICE, ItemFlags.TEAMWORK)),
	DERR_18(		".18 Derringer", 			Expansion.VANILLA, 1, EnumSet.of(ItemFlags.TRINKET, ItemFlags.WEAPON)),
	DOUB_BAR_SHOT(	"Double-barreled Shotgun", 	Expansion.VANILLA, 4, EnumSet.of(ItemFlags.ITEM, ItemFlags.WEAPON)),
	DYNAMITE(		"Dynamite", 				Expansion.VANILLA, 3, EnumSet.of(ItemFlags.ITEM, ItemFlags.WEAPON)),
	FINE_CLOTH(		"Fine Clothes", 			Expansion.VANILLA, 2, EnumSet.of(ItemFlags.ITEM)),
	FISH_NET(		"Fishing Net", 				Expansion.VANILLA, 2, EnumSet.of(ItemFlags.ITEM)),
	HIRED_MUSC(		"Hired Muscle", 			Expansion.VANILLA, 2, EnumSet.of(ItemFlags.ALLY)),
	HOLY_CROSS(		"Holy Cross", 				Expansion.VANILLA, 2, EnumSet.of(ItemFlags.ITEM)),
	HOLY_WATER(		"Holy Water", 				Expansion.VANILLA, 2, EnumSet.of(ItemFlags.ITEM, ItemFlags.MAGICAL)),
	KEROSENE(		"Kerosene", 				Expansion.VANILLA, 1, EnumSet.of(ItemFlags.ITEM)),
	LODGE_RES(		"Lodge Researcher", 		Expansion.VANILLA, 3, EnumSet.of(ItemFlags.ALLY)),
	LUCKY_CIG(		"Lucky Cigarette Case", 	Expansion.VANILLA, 2, EnumSet.of(ItemFlags.TRINKET)),
	LUCKY_RAB(		"Lucky Rabbit's Foot", 		Expansion.VANILLA, 1, EnumSet.of(ItemFlags.TRINKET)),
	PERS_ASSIST(	"Personal Assistant", 		Expansion.VANILLA, 2, EnumSet.of(ItemFlags.ALLY)),
	POCKET_WATCH(	"Pocket Watch", 			Expansion.VANILLA, 1, EnumSet.of(ItemFlags.TRINKET)),
	PRIV_CARE(		"Private Care", 			Expansion.VANILLA, 2, EnumSet.of(ItemFlags.SERVICE)),
	PRIV_INV(		"Private Investigator", 	Expansion.VANILLA, 2, EnumSet.of(ItemFlags.ALLY)),
	PROT_AMULET(	"Protective Amulet", 		Expansion.VANILLA, 1, EnumSet.of(ItemFlags.ITEM)),
	PUZZLE_BOX(		"Puzzle Box", 				Expansion.VANILLA, 3, EnumSet.of(ItemFlags.TRINKET)),
	REV_38(			".38 Revolver", 			Expansion.VANILLA, 1, EnumSet.of(ItemFlags.ITEM, ItemFlags.WEAPON)),
	SANCTUARY(		"Sanctuary", 				Expansion.VANILLA, 2, EnumSet.of(ItemFlags.SERVICE)),
	SIL_TWI_RIT(	"Silver Twilight Ritual", 	Expansion.VANILLA, 3, EnumSet.of(ItemFlags.SERVICE)),
	SPRT_DAGGER(	"Spirit Dagger", 			Expansion.VANILLA, 2, EnumSet.of(ItemFlags.ITEM, ItemFlags.WEAPON, ItemFlags.MAGICAL)),
	URBAN_GUIDE(	"Urban Guide", 				Expansion.VANILLA, 4, EnumSet.of(ItemFlags.ALLY)),
	VAT_MISS(		"Vatican Missionary", 		Expansion.VANILLA, 2, EnumSet.of(ItemFlags.ALLY)),
	WHISKEY(		"Whiskey", 					Expansion.VANILLA, 1, EnumSet.of(ItemFlags.ITEM)),
	WIRE_REPORT(	"Wireless Report", 			Expansion.VANILLA, 1, EnumSet.of(ItemFlags.SERVICE, ItemFlags.TEAMWORK)),
	WITCH_DOC(		"Witch Doctor", 			Expansion.VANILLA, 3, EnumSet.of(ItemFlags.ALLY)),
	
	APPEAL_COUNC(	"Appeal to the Council", 	Expansion.FORSAKEN_LORE, 1, EnumSet.of(ItemFlags.SERVICE)),
	BODYGUARD(		"Bodyguard", 				Expansion.FORSAKEN_LORE, 2, EnumSet.of(ItemFlags.ALLY)),
	COLT_45(		".45 Colt Revolver", 		Expansion.FORSAKEN_LORE, 1, EnumSet.of(ItemFlags.ITEM, ItemFlags.WEAPON)),
	CONS_THEOR(		"Conspiracy Theorist", 		Expansion.FORSAKEN_LORE, 3, EnumSet.of(ItemFlags.ALLY)),
	ELDER_SIGN(		"Elder Sign", 				Expansion.FORSAKEN_LORE, 2, EnumSet.of(ItemFlags.TRINKET, ItemFlags.MAGICAL)),
	ENCH_BLADE(		"Enchanted Blade", 			Expansion.FORSAKEN_LORE, 3, EnumSet.of(ItemFlags.ITEM, ItemFlags.WEAPON, ItemFlags.MAGICAL)),
	FRESH_FRUIT(	"Fresh Fruit",				Expansion.FORSAKEN_LORE, 1, EnumSet.of(ItemFlags.ITEM)),
	INTEL_REPORT(	"Intelligence Report", 		Expansion.FORSAKEN_LORE, 3, EnumSet.of(ItemFlags.SERVICE)),
	LANTERN(		"Lantern", 					Expansion.FORSAKEN_LORE, 1, EnumSet.of(ItemFlags.ITEM)),
	LUCKY_RING(		"Lucky Ring", 				Expansion.FORSAKEN_LORE, 3, EnumSet.of(ItemFlags.TRINKET)),
	MYST_HUNTER(	"Mystic Bounty Hunter",		Expansion.FORSAKEN_LORE, 2, EnumSet.of(ItemFlags.ALLY)),
	POL_ASSIST(		"Police Assistance", 		Expansion.FORSAKEN_LORE, 1, EnumSet.of(ItemFlags.SERVICE)),
	POL_LEDGER(		"Police Ledger", 			Expansion.FORSAKEN_LORE, 1, EnumSet.of(ItemFlags.ITEM)),
	RES_STUD(		"Research Student", 		Expansion.FORSAKEN_LORE, 1, EnumSet.of(ItemFlags.ALLY)),
	SYND_AGENT(		"Syndicate Agent", 			Expansion.FORSAKEN_LORE, 2, EnumSet.of(ItemFlags.ALLY)),
	TEAR_GAS(		"Tear Gas", 				Expansion.FORSAKEN_LORE, 1, EnumSet.of(ItemFlags.ITEM, ItemFlags.WEAPON));
	
	private final Asset asset;
	
	private AssetID(String name, Expansion expansion, int cost, EnumSet<ItemFlags> flags) {
		this.asset = new Asset(name, expansion, cost, flags);
	}

	/**
	 * @return the asset
	 */
	public final Asset getAsset() {
		return asset;
	}
	
}
