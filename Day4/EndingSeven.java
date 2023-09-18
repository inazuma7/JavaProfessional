package Day4;

import java.util.Scanner;

public class EndingSeven {
	 public static void main(String [] args) {
			
	    	System.out.println("please enter a number:");
			Scanner scanner = new Scanner(System.in);
			int n = scanner.nextInt();
			
			for (int i = 7; i <= n; i += 10) {
				System.out.println(i);
			}
	 }

}
