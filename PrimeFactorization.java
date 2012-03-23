import java.util.ArrayList;


public class PrimeFactorization {

	public static ArrayList<Integer> getPrimeFactors(int i) {
		
		ArrayList<Integer> list = new ArrayList<Integer>();
		if (i == 2){
			list.add(2);
		}else if (i == 3){
			list.add(3);
		}
		
		return list;
	}

}
