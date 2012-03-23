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
		assertEquals(PrimeGeneration.getAllSmallerPrimes(1), quickList());
	}

	@Test
	public void testPrimeGenerationFor2(){
		assertEquals(PrimeGeneration.getAllSmallerPrimes(2), quickList());
	}
	
	@Test
	public void testPrimeGenerationFor3(){
		assertEquals(PrimeGeneration.getAllSmallerPrimes(3), quickList(2));
	}
	
	@Test
	public void testPrimeGenerationFor5(){
		assertEquals(PrimeGeneration.getAllSmallerPrimes(5), quickList(2,3));
	}
	
	@Test
	public void testPrimeGenerationFor7(){
		assertEquals(PrimeGeneration.getAllSmallerPrimes(7), quickList(2,3,5));
	}
	
	private ArrayList<Integer> quickList(int...ints){
		ArrayList<Integer> list = new ArrayList<Integer>();
		for (int i : ints){
			list.add(i);
		}
		return list;
	}
}
