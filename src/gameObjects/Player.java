package gameObjects;

import java.util.*;

import gameObjects.gameTokens.*;
import gameObjects.locationData.LocationID;

public final class Player {
	
	public static final int MAX_TICKETS_PER_PLAYER = 2;
		
	private final List<LocationID> clues;
	private final List<TicketType> tickets;
	private HeroID hero;

	public Player(HeroID hero) {
		this.clues = new ArrayList<LocationID>();
		this.tickets = new ArrayList<TicketType>(MAX_TICKETS_PER_PLAYER);
		
		this.hero = hero;
	}
	
}
