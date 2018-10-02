import static java.lang.System.*;

public class Helloloop2 {
	public static void main(String[] args){

		for(int i = 1; i <= 5; i++) {
			for(int k = 1; k <= i; k++) {
				out.print(" ");
			}
			out.println("Hello, World!");

		}

	}
}
