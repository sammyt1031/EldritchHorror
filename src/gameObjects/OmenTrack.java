package gameObjects;

public class OmenTrack {
	
	public enum Omen {
		GREEN, BLUE1, RED, BLUE2;
	}
		
	public static final Omen rotateClockwise(Omen currOmen) {
				
		if (currOmen == Omen.GREEN) {
			return Omen.BLUE1;
		}
		else if (currOmen == Omen.BLUE1) {
			return Omen.RED;
		}
		else if (currOmen == Omen.RED) {
			return Omen.BLUE2;
		}
		else if (currOmen == Omen.BLUE2) {
			return Omen.GREEN;
		}
		else {
			System.err.printf("ERROR: Received invalid Omen: %s! Returning null", currOmen.toString());
			return null;
		}
							
	}
	
	public static final Omen rotateCounterClockwise(Omen currOmen) {
				
		if (currOmen == Omen.GREEN) {
			return Omen.BLUE2;
		}
		else if (currOmen == Omen.BLUE2) {
			return Omen.RED;
		}
		else if (currOmen == Omen.RED) {
			return Omen.BLUE1;
		}
		else if (currOmen == Omen.BLUE1) {
			return Omen.GREEN;
		}
		else {
			System.err.printf("ERROR: Received invalid Omen: %s! Returning null", currOmen.toString());
			return null;
		}
				
	}
}
