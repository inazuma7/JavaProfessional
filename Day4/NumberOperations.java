package Day4;

import java.util.Scanner;

public class NumberOperations {
	public static void main (String [] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("first number: ");
		double num1 = Double.parseDouble(scanner.nextLine());
		System.out.println("second number: ");
		double num2 = Double.parseDouble(scanner.nextLine());
		System.out.println("math operation: ");
		String operation = scanner.nextLine();
		double result = 0;
		
		if (operation.equals("+"))
			result = num1 + num2;
		
		else if (operation.equals("-"))
			result = num1 - num2;
		
		else if (operation.equals("*"))
			result = num1 * num2;
		
		else if (operation.equals("/"))
			result = num1 / num2;
		
		else if (operation.equals("%"))
			result = num1 % num2;
	
	
	    System.out.printf("%f %s %f = %.2f", num1, operation, num2, result);

}
}