package Day3;

import java.util.Scanner;

public class sumNnumber {
	public static void main(String [] args) {
		
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("insert the number want to be Sum:");
		int n = scanner.nextInt();
		int sum = 1;
		System.out.print(1);
		for (int i = 2; i <=n; i += 1) {
			System.out.print("+" + i);
			sum += i;
		}
		
		System.out.println("=" +sum);
	}

}
