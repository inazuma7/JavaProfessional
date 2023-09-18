package Day5;

import java.util.Scanner;

public class TriangleOfStarWhile {
	public static void main (String [] args) {
	Scanner scanner = new Scanner(System.in);
	int height = scanner.nextInt();
	int row = 1;
	while (row <= height) {
		int col =0;
		while (col++ <row)
			System.out.print("*");
		System.out.println();
		row++;
	}
	
	
	
	}

}
