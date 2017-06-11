package gameObjects;

import java.util.*;

import gameObjects.gameTokens.*;
import gameObjects.gameTokens.Cards.*;
import gameObjects.locationData.*;

public final class GameBoard {
	
	public static final int MAX_RESERVE_SIZE = 4;
	
	private static GameBoard Game = null;
	
	public static void initGame(Expansion expansion, AncientOneID ancientOne, int numPlayers) {
		if (Game == null) {
			Game = new GameBoard(expansion, ancientOne, numPlayers);
		}
		else {
			System.err.println("ERROR: Game is already in play!");
		}
	}
	
	private final Expansion expansion;
	private final IconReference iconRef;
	private final AncientOneID ancientOne;
	private final List<Player> players;
	private final List<LocationID> clues;
	private final List<LocationID> rumors;
	private final List<Monster> monstersInPlay;
	private final List<Asset> reserve;
	private final List<Card> discardPile;
	
	private int currDoom;
	private OmenTrack.Omen currOmen;
	private Player leadInv;
	
	
//	New game initialization
	private GameBoard(Expansion expansion, AncientOneID ancientOne, int numPlayers) {
		this.expansion = expansion;
		this.ancientOne = ancientOne;
		this.iconRef = IconReference.getIconRef(numPlayers);
		this.clues = new ArrayList<LocationID>(LocationID.values().length);
		this.rumors = new ArrayList<LocationID>();
		this.monstersInPlay = new ArrayList<Monster>();
		this.reserve = new ArrayList<Asset>(MAX_RESERVE_SIZE);
		this.discardPile = new ArrayList<Card>();
		
		List<HeroID> heroes = Arrays.asList(HeroID.values());
		
		List<Player> list = new ArrayList<Player>(numPlayers);
		for (int i = 0; i < numPlayers; i++) {
			
			System.out.printf("Player %d, which hero would you like?\n", i + 1);
			System.out.println("Defaulting to the LILY_CHEN option for now");
			
			list.add(new Player(HeroID.LILY_CHEN));
		}		
		players = Collections.unmodifiableList(list);
		
		this.currDoom = this.ancientOne.getAncientOne_().getDoomStart_();
		this.currOmen = OmenTrack.Omen.GREEN;
	}
	
}
