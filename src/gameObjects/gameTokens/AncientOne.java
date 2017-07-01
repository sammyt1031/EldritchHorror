package gameObjects.gameTokens;

import gameObjects.*;
import java.util.*;

public final class AncientOne extends GamePiece {

	public static final int MYTHOS_DECK_INIT_DIM_SIZE = 3;

	private final int doomStart_;
	private final List<List<Integer>> mythosInit_;
	
	AncientOne (String name, Expansion expansion, int doomStart, int [][] mythosInit) {
		super(name, expansion);
		doomStart_ = doomStart;
		
		ArrayList<List<Integer>> listOfLists = new ArrayList<List<Integer>>(MYTHOS_DECK_INIT_DIM_SIZE);		
		for (int i = 0; i < MYTHOS_DECK_INIT_DIM_SIZE; i++) {
			
			List<Integer> list = new ArrayList<Integer>(MYTHOS_DECK_INIT_DIM_SIZE);			
			for (int j = 0; j < MYTHOS_DECK_INIT_DIM_SIZE; j++) {
				list.add(mythosInit[i][j]);
			}
			
			listOfLists.add(Collections.unmodifiableList(list));
		}
		mythosInit_ = Collections.unmodifiableList(listOfLists);
	}
	
	/**
	 * @return the doomStart_
	 */
	public final int getDoomStart_ () {
		return doomStart_;
	}

	/**
	 * @return the mythosInit_
	 */
	public final List<List<Integer>> getMythosInit_ () {
		return mythosInit_;
	}
}