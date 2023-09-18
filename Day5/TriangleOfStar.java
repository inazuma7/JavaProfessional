package Day5;

import java.util.Scanner;

public class TriangleOfStar {
	public static void main (String [] args) {
		Scanner scanner = new Scanner(System.in);
		int size = scanner.nextInt();
		for(int row = 1; row <= size; row++) {
			for (int col =1; col<=row; col++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

}
