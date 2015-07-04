package regex;

import org.junit.Test;
import static org.junit.Assert.*;
import static regex.DetectingValidLatitudeAndLongitudePairs.isValidPair;

public class DetectingValidLatitudeAndLongitudePairsTest {

	@Test
	public void test1() throws Exception {
		assertTrue(isValidPair("(75, 180)"));
	}
	
	@Test
	public void test2() throws Exception {
		assertFalse(isValidPair("(-090.00000, -180.0000)"));
	}
	
}
