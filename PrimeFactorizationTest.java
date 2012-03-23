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
		assertEquals(PrimeFactorization.getPrimeFactors(1), quickList());
	}
	
	@Test
	public void testPrimeFactoringFor2(){
		assertEquals(PrimeFactorization.getPrimeFactors(2), quickList(2));
	}
	
	@Test
	public void testPrimeFactoringFor3(){
		assertEquals(PrimeFactorization.getPrimeFactors(3), quickList(3));
	}
	
	@Test
	public void testPrimeFactoringFor4(){
		assertEquals(PrimeFactorization.getPrimeFactors(4), quickList(2,2));
	}
	
	@Test
	public void testPrimeFactoringFor6(){
		assertEquals(PrimeFactorization.getPrimeFactors(6), quickList(2,3));
	}
	
	@Test
	public void testPrimeFactoringFor8(){
		assertEquals(PrimeFactorization.getPrimeFactors(8), quickList(2,2,2));
	}
	
	@Test
	public void testPrimeFactoringFor9(){
		assertEquals(PrimeFactorization.getPrimeFactors(9), quickList(3,3));
	}
	
	@Test
	public void testPrimeFactoringFor325115(){
		assertEquals(PrimeFactorization.getPrimeFactors(325115), quickList(5,7,7,1327));
	}
	
	private ArrayList<Integer> quickList(int...ints){
		ArrayList<Integer> list = new ArrayList<Integer>();
		for (int i : ints){
			list.add(i);
		}
		return list;
	}
}
