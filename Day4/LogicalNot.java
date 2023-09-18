package Day4;

import java.util.Scanner;

public class LogicalNot {
	    public static void main(String [] args) {
			
			Scanner scanner = new Scanner(System.in);
			int num = scanner.nextInt();
			
			boolean isValid = (num >= 100 && num <= 200) || num == 0;
			if (!isValid)
				System.out.println("invalid");
			else
				System.out.println("valid");

}}
