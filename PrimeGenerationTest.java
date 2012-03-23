import static org.junit.Assert.*;
import static org.junit.Assert.assertTrue;

import java.util.ArrayList;

import org.junit.Test;

public class PrimeGenerationTest {
	@Test
	public void test_JUnit(){
		assertTrue("The compiler isn't feeling well today...", true);
	}
	
	@Test
	public void testPrimeGenerationFor1(){
		assertEquals(PrimeGeneration.getAllSmallerPrimes(1), new ArrayList<Integer>());
	}

	@Test
	public void testPrimeGenerationFor2(){
		assertEquals(PrimeGeneration.getAllSmallerPrimes(2), new ArrayList<Integer>());
	}
}
