package correction.testing;

import java.util.Arrays;
import java.util.List;


public class Date {
	private  static List<Integer> big =  Arrays.asList(1,3,5,7,8,10,12);
	private  static List<Integer> small = Arrays.asList(4,6,9,11);

	public static boolean validemonth(int month) {

	return month <1 || month >12;
			
		
	}
	public static boolean valideday (int month , int day, int year)
	{
		if (day < 1)
			return false;
		if (big.contains(month) && day >31)
			return false;
		else if (small.contains(month) && day >30)
			return false;
		else if (month == 2 && year % 4 == 0 && day > 29)
			return false;
		else if (month == 2 && year % 4 != 0 && day > 28)
			return false;
		else return true;
	}
	
}