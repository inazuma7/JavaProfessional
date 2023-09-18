package Day4;

import java.util.Scanner;

public class Atm {
		public static void main (String [] args) {
			
			Scanner scanner = new Scanner(System.in);
			
			System.out.println("insert your balance: ");
			int balance = scanner.nextInt();
			System.out.println("insert your withdraw: ");
			int withdraw = scanner.nextInt();
			System.out.println("insert your limit: ");
			int limit = scanner.nextInt();
			
			if(balance >= withdraw && withdraw <= limit)
				System.out.println("The withdraw was successful.");
			
			else if (withdraw > limit)
				System.out.println("The limit axceeded.");
			
			else
				System.out.println("Insufficient availability");

}
}