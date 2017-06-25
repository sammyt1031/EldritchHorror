package gameObjects;

import java.util.*;

import gameObjects.gameTokens.*;
import gameObjects.gameTokens.Cards.*;
import gameObjects.locationData.LocationID;

public final class Player {
	
	public static final int MAX_TICKETS_PER_PLAYER = 2;
	public static final int MAX_NUM_ACTIONS = 2;
		
	private final List<LocationID> clues = new ArrayList<LocationID>();
	private final List<TicketType> tickets = new ArrayList<TicketType>(MAX_TICKETS_PER_PLAYER);
	private final List<AssetID> assets = new ArrayList<AssetID>();
	private final List<ArtifactID> artifacts = new ArrayList<ArtifactID>();
	private HeroID hero;
	private int numActions;

	public Player(HeroID hero) {
		this.hero = hero;
		this.numActions = MAX_NUM_ACTIONS;
	}
	
}
