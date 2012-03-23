import java.util.ArrayList;


public class PrimeFactorization {

	public static ArrayList<Integer> getPrimeFactors(int i) {
		
		ArrayList<Integer> list = new ArrayList<Integer>();
		
		while(i > 0){
			if (i%2 == 0){
				list.add(2);
				i /= 2;
			}else{
				break;
			}
		}
		
		if (i%3 == 0){
			list.add(3);
		}
		
		return list;
	}

}
