package Day4;

import java.util.Scanner;

public class ExamCountdown {
	 public static void main(String [] args) {
			
	    	System.out.println("please enter days:");
			Scanner scanner = new Scanner(System.in);
			int days = scanner.nextInt();
			
			for (int i = days; i >=1; i -= 1) {
				System.out.printf("%d days before the exam \n",i);
			}
			
			System.out.println("The exam has come");
	 }

}
