package Day2;

import java.util.Scanner;

public class SpecialNum {
	
	public static void main(String [] args) {
		
		Scanner scanner = new Scanner(System.in);
		int n = Integer.parseInt(scanner.nextLine());
		
		for (int num = 1; num <=n; num++) {
			int sumOfDigits = 0;
			int digits = num;
			while(digits > 0) {
				sumOfDigits += digits % 10;
				digits = digits /10;
			}
	
		
		boolean check = (sumOfDigits == 5 || sumOfDigits == 7 || sumOfDigits ==11);
		System.out.println(num + "->" + check);
		
	}

}}
