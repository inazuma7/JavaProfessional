package Day3;

import java.util.Scanner;

public class guessPassword {
	 public static void main(String [] args) {
			
	    	System.out.println("please insert a password:");
			Scanner scanner = new Scanner(System.in);
			String password = scanner.nextLine();
			
			if (password.equals("s3cr3t!")) {
				System.out.println("Welcome");
			}else {
				System.out.println("Wrong password!");
			}
			
	 }

}
