package unitTests;

import static org.junit.Assert.*;

import org.junit.Test;

import gameObjects.locationData.*;

import java.util.*;

public class TestAllPossiblePaths {

	@Test
	public void testAllPossiblePaths() {
		
		Map<Integer, Location> LocationMap = Location.LocationMap;
		
		try {
			LocationMap.put(Integer.MAX_VALUE, null);
			fail("Was able to insert into unmodifiable LocationMap");
		} catch (UnsupportedOperationException e) {}
				
		int totalPaths = 0;
		int reversiblePaths = 0;
		for (Integer srcID : LocationMap.keySet()) {
			
			Location srcLoc = LocationMap.get(srcID);
			List<Path> paths = srcLoc.getPaths();
			totalPaths += paths.size();
			
			try {
				paths.add(null);
				fail("Was able to insert into unmodifiable Path List");
			} catch (UnsupportedOperationException e) {}
			
			for (Path srcPath : paths) {
								
				Location destLoc = LocationMap.get(srcPath.getDestID());				
				
				boolean condition = false;
				for (Path destPath : destLoc.getPaths()) {
					if (destPath.getDestID() == srcID) {
						condition = true;
						break;
					}
				}

				assertTrue(srcLoc.getName() + " is not in " + destLoc.getName(), condition);	
				reversiblePaths++;
								
			}
			
		}
		
		assertTrue("Total paths is " + totalPaths + " and reversiblePaths is " + reversiblePaths, totalPaths == reversiblePaths);
	}

}
