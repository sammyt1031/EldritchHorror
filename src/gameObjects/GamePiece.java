/**
 * 
 */
package gameObjects;

import gameObjects.Expansion;

/**
 * @author Sam
 *
 */
	
public class GamePiece {
	
	private final String name_;
	private final Expansion expansion_;
	
	protected GamePiece(String name, Expansion expansion) {
		name_ = name;
		expansion_ = expansion;
	}

	/**
	 * @return the expansion this game piece corresponds to
	 */
	public final String getName_() {
		return name_;
	}
	
	/**
	 * @return the expansion this game piece corresponds to
	 */
	public final Expansion getExpansion_() {
		return expansion_;
	}
	
}
	
	

