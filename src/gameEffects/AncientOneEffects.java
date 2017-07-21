package gameEffects;

import java.util.*;

public final class AncientOneEffects {

	private static final Map<String, Runnable> AncientOneEffectsMap;
	
	public static final void init(String ancientOne) {
		
		
		
	}
	
	static {
		
		Map<String, Runnable> map = new HashMap<String, Runnable>();
		
		map.put("Azathoth", () -> System.out.println());
		//map.put("Shub-Niggurath", () -> break);
		
		AncientOneEffectsMap = Collections.unmodifiableMap(map);
		
	}
	
}
