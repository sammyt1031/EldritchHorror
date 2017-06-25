package unitTests;

import static org.junit.Assert.*;

import org.junit.Test;

import gameObjects.locationData.*;

public class TestLocationTypeImmutability {

	@Test
	public void testLocationTypeImmutability() {

		LocationID loc = LocationID.AFRICA;
		
		LocationType type = loc.getLocType(); // should be WILDERNESS
		type = LocationType.CITY;
		
		LocationType type2 = loc.getLocType();
		
		assertFalse(type == type2);
	}

}
