import java.util.ArrayList;


public class PrimeFactorization {

	public static ArrayList<Integer> getPrimeFactors(int i) {
		
		ArrayList<Integer> list = new ArrayList<Integer>();
		
		for(int j = 2; i > 1; j++){
		
			while(i % j == 0){
				list.add(j);
				i /= j;
			}
		}
		
		return list;
	}

}
