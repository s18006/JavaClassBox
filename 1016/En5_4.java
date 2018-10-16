import java.math.BigDecimal;
import java.math.RoundingMode;

public class En5_4 {
	public static void main(String args[]) {
		
		BigDecimal one = BigDecimal.valueOf(1);
		BigDecimal nine = BigDecimal.valueOf(9);
		BigDecimal divnine = one.divide(nine, 4, RoundingMode.HALF_UP);
		BigDecimal mulnine = divnine.multiply(nine);
		System.out.println(mulnine);
	}

}
