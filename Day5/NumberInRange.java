package Day5;

import java.util.Scanner;
public class NumberInRange {
	
	public static void main (String [] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		int num = scanner.nextInt();
		while (num < 1 || num >100) {
			num = scanner.nextInt();
		}
		
		System.out.println(num);
		
	}

}
