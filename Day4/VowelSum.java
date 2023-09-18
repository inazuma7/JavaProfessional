package Day4;

import java.util.Scanner;

public class VowelSum {
	
	public static void main(String [] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("please enter integer number:");
		int n = Integer.parseInt(scanner.nextLine());
		int vowelSum = 0;
		
		for (int i = 0; i <n; i++) {
			System.out.println("please enter char:");
			char ch = scanner.nextLine().charAt(0);
			switch(ch) {
			case 'a': vowelSum += 1; break;
			case 'e': vowelSum += 2; break;
			case 'i': vowelSum += 3; break;
			case 'o': vowelSum += 4; break;
			case 'u': vowelSum += 5; break;
			}
		}
		System.out.println(vowelSum);
	}

}
