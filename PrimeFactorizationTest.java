import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.Test;

public class PrimeFactorizationTest {
	@Test
	public void test_JUnit(){
		assertTrue("The compiler isn't feeling well today...", true);
	}
	
	@Test
	public void testPrimeFactoringFor1(){
		assertEqual(PrimeFactorization.getPrimeFactors(1), new ArrayList<Integer>());
	}
}
