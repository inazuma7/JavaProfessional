package Day4;

import java.util.Scanner;

public class InfiniteNum {
	
	public static void main(String [] args) {
		
		Scanner scanner = new Scanner(System.in);
    	System.out.println("please enter a Number:");
		long sum = 0;
		for(;;) {
			int num = scanner.nextInt();
			if(num==0)
				break;
			sum = sum + num;
			System.out.println("Sum = " + sum);
			
		}
		
		System.out.println("Good bye");
	}

}
