package unitTests;

import static org.junit.Assert.*;

import org.junit.Test;

import gameObjects.locationData.*;

import java.util.List;

public class AllPossiblePaths {

	@Test
	public void testAllPossiblePaths() {
		
		int totalPaths = 0;
		for (Location src : Location.values()) {
			
			totalPaths += src.getPaths_().size();
			
		}
		
		int reversiblePaths = 0;
		for (Location srcLoc : Location.values()) {
			
			List<Path> paths = srcLoc.getPaths_();			
			for (Path srcPath : paths) {
								
				Location destLoc = srcPath.getDest_();				
				
				boolean condition = false;
				for (Path destPath : destLoc.getPaths_()) {
					if (destPath.getDest_() == srcLoc) {
						condition = true;
						break;
					}
				}

				assertTrue(srcLoc.toString() + " is not in " + destLoc.toString(), condition);	
				reversiblePaths++;
								
			}
			
		}
		
		assertTrue("Total paths is " + totalPaths + " and reversiblePaths is " + reversiblePaths, totalPaths == reversiblePaths);
	}

}
