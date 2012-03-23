import java.util.ArrayList;


public class PrimeGeneration {
	public static ArrayList<Integer> getAllSmallerPrimes(int i) {
		
		ArrayList<Integer> list = new ArrayList<Integer>();
		
		for(int j = 2; j < i; j++){
			if(PrimeFactorization.getPrimeFactors(j).size() == 1){
				list.add(j);
			}
		}
		
		return list;
	}
}
