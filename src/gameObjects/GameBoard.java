package gameObjects;

import java.util.*;

import gameObjects.gameTokens.*;
import gameObjects.gameTokens.Cards.*;
import gameObjects.locationData.*;

public final class GameBoard {
	
	public static final int MAX_ASSET_RESERVE_SIZE = 4;
	
	private static GameBoard Game = null;
	
	public static void initGame(Expansion expansion, AncientOne ancientOne, int numPlayers) {
		if (Game == null) {
			Game = new GameBoard(expansion, ancientOne, numPlayers);
		}
		else {
			System.err.println("ERROR: Game is already in play!");
		}
	}
	
	private final Expansion expansion;
	private final IconReference iconRef;
	private final AncientOne ancientOne;
	private final List<Player> players;
	
	private final List<Monster> monstersInPlay;
	private final List<Integer> reserveAssetIDs = new ArrayList<Integer>(MAX_ASSET_RESERVE_SIZE);
	private final List<Integer> assetDiscardPile = new ArrayList<Integer>();
	private final List<Integer> artifactDiscardPile = new ArrayList<Integer>();
	private final List<Integer> clueLocIDs = new ArrayList<Integer>();
	private final List<Integer> rumorLocIDs = new ArrayList<Integer>();
	
	private int currDoom;
	private OmenTrack.Omen currOmen;
	private int activeExpLocID;
	private Player leadInv;
		
//	New game initialization
	private GameBoard(Expansion expansion, AncientOne ancientOne, int numPlayers) {
		this.expansion = expansion;
		this.ancientOne = ancientOne;
		this.iconRef = IconReference.getIconRef();
		this.monstersInPlay = new ArrayList<Monster>();
		this.players = new ArrayList<Player>(numPlayers);
		
		this.currDoom = this.ancientOne.getDoomStart_();
		this.currOmen = OmenTrack.Omen.GREEN;
	}
	
}
