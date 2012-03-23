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
		assertEquals(PrimeFactorization.getPrimeFactors(1), new ArrayList<Integer>());
	}
	
	@Test
	public void testPrimeFactoringFor2(){
		ArrayList<Integer> outcome = new ArrayList<Integer>();
		outcome.add(2);
		assertEquals(PrimeFactorization.getPrimeFactors(2), outcome);
	}
	
	@Test
	public void testPrimeFactoringFor3(){
		ArrayList<Integer> outcome = new ArrayList<Integer>();
		outcome.add(3);
		assertEquals(PrimeFactorization.getPrimeFactors(3), outcome);
	}
}
