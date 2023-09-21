package Day8;

import java.util.Scanner;

public class MultiplyEvensByOdds {
	public static void main (String [] args) {
		
		Scanner scanner = new Scanner (System.in);
		int number = scanner.nextInt();
		if (number < 0)
			number = Math.abs(number);
		System.out.println(getMultipleOfEvensAndOdds(number));
		
	}
	 public static int getMultipleOfEvensAndOdds(int num) {
		 return getSumOfEvenDigits(num) * getSumOfOddDigits(num);
		 
	 }
	 
	 public static int getSumOfEvenDigits(int num) {
		 int sum = 0;
		 while(num > 0) {
			 int digit = num % 10;
			 if(digit % 2 == 0)
				 sum += digit;
			 num /= 10;
		 }
		 System.out.println("Even sum: "+sum);
		 return sum;
		 
	 }
	 
	 public static int getSumOfOddDigits(int num) {
		 int sum = 0;
		 while(num > 0) {
			 int digit = num % 10;
			 if(digit % 2 != 0)
				 sum += digit;
			 num /= 10;
	 }
		System.out.println("Odd sum: "+sum);
	    return sum;
	

}}
