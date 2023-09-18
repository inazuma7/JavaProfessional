package Day4;

import java.util.Scanner;

public class LatinLetters {
	public static void main(String [] args) {
		
		Scanner scanner = new Scanner(System.in);
    	System.out.println("please enter a Start letter:");
		char startLetter = scanner.nextLine().charAt(0);
		System.out.println("please enter a Last letter:");
		char endLetter = scanner.nextLine().charAt(0);
		
		for (char i = startLetter; i <= endLetter; i++) {
			System.out.print(i + "");
		}
	
	
}

}
