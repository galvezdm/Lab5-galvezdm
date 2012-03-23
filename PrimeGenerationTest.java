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
	
	@Test
	public void testPrimeGenerationFor11(){
		assertEquals(PrimeGeneration.getAllSmallerPrimes(11), quickList(2,3,5,7));
	}
	
	@Test
	public void testPrimeGenerationFor13(){
		assertEquals(PrimeGeneration.getAllSmallerPrimes(13), quickList(2,3,5,7,11));
	}
	
	@Test
	public void testPrimeGenerationFor200(){
		assertEquals(PrimeGeneration.getAllSmallerPrimes(200), quickList(2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37, 41, 43, 47, 53, 59, 61, 67, 71, 73, 79, 83, 89, 97, 101, 103, 107, 109, 113, 127, 131, 137, 139, 149, 151, 157, 163, 167, 173, 179, 181, 191, 193, 197, 199));
	}
	
	private ArrayList<Integer> quickList(int...ints){
		ArrayList<Integer> list = new ArrayList<Integer>();
		for (int i : ints){
			list.add(i);
		}
		return list;
	}
}
