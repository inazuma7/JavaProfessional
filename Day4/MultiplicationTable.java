package Day4;

import java.util.Scanner;

public class MultiplicationTable {
	
	public static void main (String [] args) {
		
	Scanner scanner = new Scanner(System.in);
	System.out.println("please enter number:");
	int n = scanner.nextInt();
	for (int i = 1; i <=10; i++) {
		int result = n*i;
		System.out.printf("%d x %d = %d\n", n, i, result);
		
	}

}}
