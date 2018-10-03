import static java.lang.System.*;

public class En2_2 {
	public static void main(String[] args) {

		for(int i = 1; i <= 100; i++) {
			String numcount = new Integer(i).toString();
			if (i % 3 == 0 || numcount.startsWith("3") || numcount.endsWith("3")) {

				out.println("THREE");

			} else {
				out.println(i);
			}	

		}

	}	
}
