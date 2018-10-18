
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class En7_1 {
	public static void main(String args[]) {
		List<Integer> numbers = new ArrayList<Integer>();
		numbers.add(2);
		numbers.add(3);
		numbers.add(1);
		numbers.add(2);
		//System.out.println(numbers);		
		Collections.sort(numbers);
		for (int number: numbers) {
			System.out.println(number);
		}	

		//System.out.println(numbers);
		//Collections.reverse(numbers);
		//System.out.println(numbers);
	
			
	}
}
