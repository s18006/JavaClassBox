import java.util.*;
import static java.lang.System.out;

public class En4_2 {
	public static void main(String args[]) {
		PrimeNumberCalculator NewList = new PrimeNumberCalculator();
		printNumbers(NewList.calcTo(100));
	}

	private static void printNumbers(List<Integer> numbers) {
		for(int number: numbers) {
			out.println(number);
	}
	}
}
