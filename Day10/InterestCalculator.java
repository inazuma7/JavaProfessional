package Day10;

import java.math.BigDecimal;
import java.util.Scanner;

public class InterestCalculator {
	
	public static void main(String [] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		BigDecimal initialAmount = new BigDecimal(scanner.next());
		BigDecimal interestRate = new BigDecimal(scanner.next());
		
		BigDecimal hundred = new BigDecimal(100);
		BigDecimal total = initialAmount.add(initialAmount.multiply(interestRate.divide(hundred)));
		
		System.out.println(total);
		
		
	}

}
