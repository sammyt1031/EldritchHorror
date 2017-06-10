package gameObjects.gameTokens;

import gameObjects.*;
import java.util.*;

public final class AncientOne extends GamePiece {

	public static final int MYTHOS_DECK_INIT_DIM_SIZE = 3;

	/**
	 * @return the doomStart_
	 */
	public final int getDoomStart_() {
		return doomStart_;
	}

	/**
	 * @return the mythosInit_
	 */
	public final List<List<Integer>> getMythosInit_() {
		return Collections.unmodifiableList(mythosInit_);
	}

	AncientOne(String name, Expansion expansion, int doomStart, int [][] mythosInit) {
		super(name, expansion);
		doomStart_ = doomStart;
		mythosInit_ = new ArrayList<List<Integer>>(MYTHOS_DECK_INIT_DIM_SIZE);
		
		for (int i = 0; i < MYTHOS_DECK_INIT_DIM_SIZE; i++) {
			
			List<Integer> list = new ArrayList<Integer>();			
			for (int j = 0; j < MYTHOS_DECK_INIT_DIM_SIZE; j++) {
				list.add(mythosInit[i][j]);
			}
			
			mythosInit_.add(Collections.unmodifiableList(list));
		}
	}

	private final int doomStart_;
	private final List<List<Integer>> mythosInit_;
	
}