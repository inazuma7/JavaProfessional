package Day4;

import java.util.Scanner;

public class VowelSumIfElse {
	
public static void main(String [] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("please enter integer number:");
		int n = Integer.parseInt(scanner.nextLine());
		int vowelSum = 0;
		
		for (int i = 0; i <n; i++) {
			System.out.println("please enter char:");
			char ch = scanner.nextLine().charAt(0);
			if (ch == 'a') {
			    vowelSum += 1;
			} else if (ch == 'e') {
			    vowelSum += 2;
			} else if (ch == 'i') {
			    vowelSum += 3; 
			}else if (ch == 'o') {  
			vowelSum += 4;
			}else if (ch == 'u') {
			   vowelSum += 5;
			}
		}
		System.out.println(vowelSum);
	}


}
