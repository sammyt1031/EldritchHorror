package unitTests;

import static org.junit.Assert.*;

import org.junit.Test;

import gameObjects.locationData.*;

import java.util.List;

public class TestAllPossiblePaths {

	@Test
	public void testAllPossiblePaths() {
		
		int totalPaths = 0;
		for (LocationID src : LocationID.values()) {
			
			totalPaths += src.getPaths().size();
			
		}
		
		int reversiblePaths = 0;
		for (LocationID srcLoc : LocationID.values()) {
			
			List<Path> paths = srcLoc.getPaths();			
			for (Path srcPath : paths) {
								
				LocationID destLoc = srcPath.getDest_();				
				
				boolean condition = false;
				for (Path destPath : destLoc.getPaths()) {
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
