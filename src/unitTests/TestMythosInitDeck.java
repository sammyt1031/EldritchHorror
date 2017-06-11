package unitTests;

import static org.junit.Assert.*;

import java.util.*;

import gameObjects.gameTokens.*;

import org.junit.Test;

public class TestMythosInitDeck {

	@Test
	public void test() {
		
		AncientOne azathoth = AncientOneID.AZATHOTH.getAncientOne_();
		List<List<Integer>> mythosInit = azathoth.getMythosInit_();
		
		try {
			mythosInit.add(new ArrayList<Integer>());
			fail("Exception was not thrown when adding a new list to the array of lists!");
		} catch (UnsupportedOperationException e) {}
						
		for (int i = 0; i < AncientOne.MYTHOS_DECK_INIT_DIM_SIZE; i++) {
			
			List<Integer> list = mythosInit.get(i);

			try {
				list.add(15);
				fail("Exception was not thrown when adding to a list!");
			} catch (UnsupportedOperationException e) {}
		}
	}
}
