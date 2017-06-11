package gameObjects;

public final class DoomTrack {
	
	private static final int MAX_DOOM = 20;

	public static final int advanceDoom (int doom) {
		return doom - 1;
	}
	
	public static final int retreatDoom (int doom) {
		
		if (doom == MAX_DOOM) {
			return MAX_DOOM;
		}
		
		return doom + 1;
		
	}
	
}
