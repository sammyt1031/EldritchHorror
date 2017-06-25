package unitTests;

import static org.junit.Assert.*;

import org.junit.Test;

import gameObjects.gameTokens.HeroID;
import gameObjects.locationData.LocationID;

public class TestHeroID {

	@Test
	public void testHeroID() {
		
		HeroID hero = HeroID.AKACHI_ONYELE;
		LocationID loc = hero.getHero_().getStartLoc_();
				
		assertNotNull(loc);
	}

}
