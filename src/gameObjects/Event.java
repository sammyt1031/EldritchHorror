package gameObjects;

import java.util.*;
import java.util.concurrent.Callable;

public enum Event {
	
	GATE_SPAWN, 
	CLUE_SPAWN, 
	RUMOR_SPAWN, 
	MONSTER_SURGE, 
	CARD_ACQUIRED, 
	TEST_SUCCEEDED, 
	TEST_FAILED,
	HEALTH_LOST, 
	SANITY_LOST, 
	HERO_DIED, 
	HERO_DEVOURED, 
	DOOM_ADVANCE, 
	DOOM_RETREAT,
	ACTION_PHASE_BEGIN, 
	ENC_PHASE_BEGIN, 
	MYTHOS_PHASE_BEGIN, 
	ROUND_OVER, 
	RECKONING, 
	OMEN_ROTATE, 
	GAME_OVER_WIN, 
	GAME_OVER_LOSE;
	
	
	private final List<Callable> listeners;
	
	private Event() {
		this.listeners = new ArrayList<Callable>();
	}
	
	public final void addListener(Callable listener) {
		this.listeners.add(listener);
	}
	
	public final void removeListener(Callable listener) {
		this.listeners.remove(listener);
	}
	
	public final void update() {
		
		for (int i = 0; i < listeners.size(); i++) {
//			listeners.get(i).update();
		}
		
	}

}
