package gameObjects;

public class OmenTrack {
	
	public enum Omen {
		GREEN, BLUE, RED;
	}
	
	private static Omen prevOmen = null;
	
	public static final Omen rotateClockwise(Omen currOmen) {
				
		if (currOmen == Omen.GREEN) {
			prevOmen = Omen.GREEN;
			return Omen.BLUE;
		}
		else if (currOmen == Omen.BLUE && prevOmen == Omen.GREEN) {
			return Omen.RED;
		}
		else if (currOmen == Omen.RED) {
			prevOmen = Omen.RED;
			return Omen.BLUE;
		}
		else if (currOmen == Omen.BLUE && prevOmen == Omen.RED) {
			return Omen.GREEN;
		}
		else {
			System.err.printf("ERROR: Received invalid Omen: %s! Returning null", currOmen.toString());
			return null;
		}
							
	}
	
	public static final Omen rotateCounterClockwise(Omen currOmen) {
				
		if (currOmen == Omen.GREEN) {
			prevOmen = Omen.RED;
			return Omen.BLUE;
		}
		else if (currOmen == Omen.BLUE && prevOmen == Omen.RED) {
			return Omen.RED;
		}
		else if (currOmen == Omen.RED) {
			prevOmen = Omen.GREEN;
			return Omen.BLUE;
		}
		else if (currOmen == Omen.BLUE && prevOmen == Omen.GREEN) {
			return Omen.GREEN;
		}
		else {
			System.err.printf("ERROR: Received invalid Omen: %s! Returning null", currOmen.toString());
			return null;
		}
				
	}
}
