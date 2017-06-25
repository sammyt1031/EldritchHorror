package gameObjects.gameTokens;

public enum TicketType {
	
	SHIP, TRAIN;
	
	public static final String getTicketString(TicketType type) {
		
		switch(type) {
		
		case SHIP:
			return "Ship";
		case TRAIN:
			return "Train";
		default:
			System.err.printf("ERROR: Received illegal ticket type %s\n", type.toString());
			return "";
			
		}
		
	}
	
}
