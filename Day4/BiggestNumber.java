package Day4;

import java.util.Scanner;

public class BiggestNumber {
	
	public static void main (String [] args) {
	
	Scanner scanner = new Scanner(System.in);
	System.out.println("please enter number:");
	int n = scanner.nextInt();
	int maxNumber = Integer.MIN_VALUE;
	for (int i = 1; i <= n; i++) {
		int number = scanner.nextInt();
		if (number > maxNumber )
			maxNumber = number;
	}
	System.out.println(maxNumber);
	}

}
