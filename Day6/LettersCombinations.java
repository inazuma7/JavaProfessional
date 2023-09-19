package Day6;

import java.util.Scanner;

public class LettersCombinations {
    public static void main (String [] args) {
		
		Scanner scanner = new Scanner(System.in);
		char start = scanner.nextLine().charAt(0);
		char end = scanner.nextLine().charAt(0);
		char x = scanner.nextLine().charAt(0);
		
		int counter = 0;
		for (char l1 = start; l1 <= end; l1++)
			for (char l2 = start; l2 <= end; l2++)
				for (char l3 = start; l3 <= end; l3++)
				
				if (l1 != x && 12 != x && 13 != x) {
					System.out.println(""+l1 +l2 +l3);
					counter++;
				
				
				}
		System.out.println("total combination: " +counter);
}

}
