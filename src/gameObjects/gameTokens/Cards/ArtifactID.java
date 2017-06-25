package gameObjects.gameTokens.Cards;

import java.util.EnumSet;

import gameObjects.Expansion;
import gameObjects.gameTokens.Cards.Item.ItemFlags;

public enum ArtifactID {
		
//	Base game artifacts
	CULTES_GOULES(	"Cultes des Goules", 		Expansion.VANILLA, EnumSet.of(ItemFlags.ITEM, ItemFlags.TOME)),
	FLUTE_GODS(		"Flute of the Outer Gods", 	Expansion.VANILLA, EnumSet.of(ItemFlags.ITEM, ItemFlags.MAGICAL)),
	GATE_BOX(		"Gate Box", 				Expansion.VANILLA, EnumSet.of(ItemFlags.ITEM, ItemFlags.MAGICAL)),
	GLASS_MORTLAN(	"Glass of Mortlan", 		Expansion.VANILLA, EnumSet.of(ItemFlags.ITEM, ItemFlags.MAGICAL)),
	GROT_STATUE(	"Grotesque Statue", 		Expansion.VANILLA, EnumSet.of(ItemFlags.ITEM)),
	LIGHT_GUN(		"Lightning Gun", 			Expansion.VANILLA, EnumSet.of(ItemFlags.ITEM, ItemFlags.WEAPON, ItemFlags.MAGICAL)),
	MI_GO(			"Mi-go Brain Case", 		Expansion.VANILLA, EnumSet.of(ItemFlags.ITEM, ItemFlags.MAGICAL)),
	NECRONOMICON(	"Necronomicon", 			Expansion.VANILLA, EnumSet.of(ItemFlags.ITEM, ItemFlags.TOME)),
	PALLID_MASK(	"Pallid Mask", 				Expansion.VANILLA, EnumSet.of(ItemFlags.ITEM, ItemFlags.MAGICAL)),
	RUBY_RLYEH(		"Ruby of R'lyeh", 			Expansion.VANILLA, EnumSet.of(ItemFlags.ITEM, ItemFlags.MAGICAL)),
	SILVER_KEY(		"The Silver Key", 			Expansion.VANILLA, EnumSet.of(ItemFlags.ITEM, ItemFlags.MAGICAL)),
	SWORD_ST_JER(	"Sword of Saint Jerome", 	Expansion.VANILLA, EnumSet.of(ItemFlags.ITEM, ItemFlags.WEAPON, ItemFlags.MAGICAL)),
	TTKA_HALOT(		"T'tka Halot", 				Expansion.VANILLA, EnumSet.of(ItemFlags.ITEM, ItemFlags.TOME)),
	VERMIS(			"De Vermis Mysteriis", 		Expansion.VANILLA, EnumSet.of(ItemFlags.ITEM, ItemFlags.TOME)),
	
//	Forsaken Lore expansion artifacts
	CURSED_SPHERE(	"Cursed Sphere", 				Expansion.FORSAKEN_LORE, EnumSet.of(ItemFlags.ITEM, ItemFlags.MAGICAL)),
	ELIXIR_LIFE(	"Elixir of Life", 				Expansion.FORSAKEN_LORE, EnumSet.of(ItemFlags.ITEM, ItemFlags.ELIXIR)),
	MASSA(			"Massa di Requiem per Shuggay", Expansion.FORSAKEN_LORE, EnumSet.of(ItemFlags.ITEM, ItemFlags.TOME)),
	MILK_SHUB(		"Milk of Shub-Niggurath", 		Expansion.FORSAKEN_LORE, EnumSet.of(ItemFlags.ITEM, ItemFlags.ELIXIR)),
	SATCHEL_VOID(	"Satchel of the Void", 			Expansion.FORSAKEN_LORE, EnumSet.of(ItemFlags.ITEM, ItemFlags.MAGICAL)),
	SERPENT_CROWN(	"Serpent Crown", 				Expansion.FORSAKEN_LORE, EnumSet.of(ItemFlags.ITEM, ItemFlags.MAGICAL)),
	YHA_TALLA(		"Sword of Y'ha-Talla", 			Expansion.FORSAKEN_LORE, EnumSet.of(ItemFlags.ITEM, ItemFlags.WEAPON, ItemFlags.MAGICAL)),
	ZANTHU(			"Zanthu Tablets", 				Expansion.FORSAKEN_LORE, EnumSet.of(ItemFlags.ITEM, ItemFlags.TOME));
		
	private final Artifact artifact;
	
	private ArtifactID(String name, Expansion expansion, EnumSet<ItemFlags> flags) {
		this.artifact = new Artifact(name, expansion, flags);
	}

	/**
	 * @return the artifact
	 */
	public final Artifact getArtifact() {
		return artifact;
	}
	
}
