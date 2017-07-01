package gameObjects;

import java.util.*;

public final class Dice {
	
	private final static Random Rand = new Random();
	private final static int MAX = 6;

	/**
	 * @return This function actually returns the NUMBER OF TIMES each result is rolled, not the result of each die
	 * */
	public static final List<Integer> RollDice(int numDice) {
		
		// Initialize list, which has size == number of sides of a die
		List<Integer> result = new ArrayList<Integer>(Collections.nCopies(MAX, 0));
		for (int i = 0; i < numDice; i++) {
			
			int dieRoll = Rand.nextInt(MAX);
			
			int val = result.get(dieRoll);
			result.set(dieRoll, val + 1);
		}
		
		return result;
		
	}
	
	public static final int CountSuccesses(List<Integer> result, int minSuccessVal) {
		
		int numSuccesses = 0;
		for (int i = minSuccessVal; i <= MAX; i++) {
			
			numSuccesses += result.get(i - 1);
			
		}
		
		return numSuccesses;
		
	}
	
}
