package gameObjects;

import java.util.*;
import gameObjects.locationData.*;
import gameObjects.gameTokens.*;
import gameObjects.gameTokens.Cards.*;

public final class CardStacks {

	private static final List<Integer> assetDeck;
	private static final List<Integer> artifactDeck;
	private static final List<Integer> cluePile;
	private static final List<Monster> monsterPile;
	
	public static final void initStacks() {
		long seed = System.nanoTime();
		
		Collections.shuffle(cluePile, new Random(seed));
	}
	
	static {
		assetDeck = new ArrayList<Integer>();
		artifactDeck = new ArrayList<Integer>();
		cluePile = new ArrayList<Integer>();
		monsterPile = new ArrayList<Monster>();
	}
	
}
