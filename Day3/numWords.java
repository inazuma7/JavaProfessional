package Day3;

import java.util.Scanner;

public class numWords {
        public static void main(String [] args) {
		
    	System.out.println("please insert a number:");
		Scanner scanner = new Scanner(System.in);
		int num = scanner.nextInt();
		if (num == 1) {
			System.out.print("one");
		}else if (num ==2 ){
			System.out.print("two");
		}else if (num ==3 ){
			System.out.print("three");
		}else if (num ==4 ){
			System.out.print("four");
		}else if (num ==5 ){
			System.out.print("five");
		}else if (num ==6 ){
			System.out.print("six");
		}else if (num ==7 ){
			System.out.print("seven");
		}else if (num ==8 ){
			System.out.print("eight");
		}else if (num ==9 ){
			System.out.print("nine");
		}
		else {
			System.out.println("Out of range");
		}
}}
