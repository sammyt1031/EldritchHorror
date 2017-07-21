package gameObjects;

import java.util.*;

import gameObjects.gameTokens.*;
import utilities.Constants;

public final class GameBoard {
	
	private static GameBoard Game = null;
	
	public static void init(Expansion expansion, AncientOne ancientOne, int numPlayers) {
		if (Game == null) {
			Game = new GameBoard(expansion, ancientOne, numPlayers);
		}
		else {
			System.err.println("ERROR: Game is already in play!");
		}
	}
	
	private final Expansion expansion;
	private final AncientOne ancientOne;
	private final List<Player> players;
	
	private final List<MonsterInPlay> monstersInPlay = new ArrayList<MonsterInPlay>();
	private final List<Integer> reserveAssetIDs = new ArrayList<Integer>(Constants.MAX_ASSET_RESERVE_SIZE);
	private final List<Integer> assetDiscardPileIDs = new ArrayList<Integer>();
	private final List<Integer> artifactDiscardPileIDs = new ArrayList<Integer>();
	private final List<Integer> clueLocIDs = new ArrayList<Integer>();
	private final List<Integer> rumorLocIDs = new ArrayList<Integer>();
	private final List<Integer> gateLocIDs = new ArrayList<Integer>();
	
	private int currDoom;
	private int activeExpLocID;
	private OmenTrack.Omen currOmen;
		
//	New game initialization
	private GameBoard(Expansion expansion, AncientOne ancientOne, int numPlayers) {
		this.expansion = expansion;
		this.ancientOne = ancientOne;
		this.players = new ArrayList<Player>(numPlayers);
		
		this.currDoom = this.ancientOne.getDoomStart_();
		this.currOmen = OmenTrack.Omen.GREEN;
	}
	
}
