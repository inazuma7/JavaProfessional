package Day10;

import java.util.Scanner;

public class TryFinally {
	
	static void tryFinallyExample() {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Code executed before try-finally.");
		try {
			String str = scanner.nextLine();
			Integer.parseInt(str);
			
			System.out.println("Parsing was successful.");
			
			return;
		}catch (NumberFormatException ex) {
			System.out.println("Parsing failed.");
			 throw ex;
		} finally {
			System.out.println("this This cleanup code is always executed.");
		}
		
		//System.out.println ("This code is after the try-finally block.");
	}

}
