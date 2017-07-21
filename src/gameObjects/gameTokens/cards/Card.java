package gameObjects.gameTokens.cards;

import gameObjects.Expansion;
import gameObjects.GamePiece;

public abstract class Card extends GamePiece {

	protected Card(String name, Expansion expansion) {
		super(name, expansion);
	}

}
