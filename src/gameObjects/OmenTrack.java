package gameObjects;

public class OmenTrack {
	
	public enum Omen {
		GREEN, BLUE1, RED, BLUE2;
	}
	
	public static final Omen rotateClockwise(Omen currOmen) {
		
		switch(currOmen) {
	
		case GREEN:
			return Omen.BLUE1;
		case BLUE1:
			return Omen.RED;
		case RED:
			return Omen.BLUE2;
		case BLUE2:
			return Omen.GREEN;
		default:
			System.err.printf("ERROR: Received invalid Omen: %s! Defaulting to GREEN", currOmen.toString());
			return Omen.GREEN;			
		}				
	}
	
	public static final Omen rotateCounterClockwise(Omen currOmen) {
		
		switch(currOmen) {
	
		case GREEN:
			return Omen.BLUE2;
		case BLUE1:
			return Omen.GREEN;
		case RED:
			return Omen.BLUE1;
		case BLUE2:
			return Omen.RED;
		default:
			System.err.printf("ERROR: Received invalid Omen: %s! Defaulting to GREEN", currOmen.toString());
			return Omen.GREEN;			
		}			
	}
}
