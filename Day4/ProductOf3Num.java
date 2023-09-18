package Day4;

import java.util.Scanner;

public class ProductOf3Num {
	
     public static void main(String [] args) {
		
		Scanner scanner = new Scanner(System.in);
		int n1 = scanner.nextInt();
		int n2 = scanner.nextInt();
		int n3 = scanner.nextInt();
		
		if (n1 == 0 || n2 == 0 || n3 == 0)
			System.out.println("Zero");
		else {
			int negativeNumbersCount = 0;
			if (n1 < 0)
				negativeNumbersCount++;
			if (n2 < 0)
				negativeNumbersCount++;
			if (n3 < 0)
				negativeNumbersCount++;
			if (negativeNumbersCount % 2 == 0)
				System.out.println("positive");
			else
				System.out.println("negative");
		}
		

     }}
