package gameObjects;

import java.util.*;
import gameObjects.locationData.*;
import gameObjects.gameTokens.*;
import gameObjects.gameTokens.Cards.*;

public final class CardStacks {

	private static final List<Asset> assetDeck;
	private static final List<Artifact> artifactDeck;
	private static final List<Location> cluePile;
	private static final List<Monster> monsterPile;
	
	public static final void initStacks() {
		long seed = System.nanoTime();
		
		Collections.shuffle(cluePile, new Random(seed));
	}
	
	static {
		assetDeck = new ArrayList<Asset>();
		artifactDeck = new ArrayList<Artifact>();
		cluePile = new ArrayList<Location>();
		monsterPile = new ArrayList<Monster>();
	}
	
}
