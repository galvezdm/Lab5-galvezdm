import java.util.ArrayList;


public class PrimeGeneration {
	public static ArrayList<Integer> getAllSmallerPrimes(int i) {
		
		ArrayList<Integer> list = new ArrayList<Integer>();
		
		if(i > 2){
			list.add(2);
		}
		
		return list;
	}
}
