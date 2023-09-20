package Day7;

import java.util.Scanner;

public class MathPower {
   public static void main (String [] args) {
		
		Scanner scanner = new Scanner(System.in);
		double number = Double.parseDouble(scanner.nextLine());
		int power = scanner.nextInt();
		System.out.println(mathPower(number,power));
   }
   public static double mathPower(double number, int power) {
	   double result = 1;
	   for(int i = 0; i < power; i++)
		   result *=number;
	   return result;
   }

}
