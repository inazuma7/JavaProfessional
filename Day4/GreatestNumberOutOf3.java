package Day4;

import java.util.Scanner;

public class GreatestNumberOutOf3 {
public static void main(String [] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("please enter first number: ");
		int first = scanner.nextInt();
		System.out.println("please enter second number: ");
		int second = scanner.nextInt();
		System.out.println("please enter three number: ");
		int third = scanner.nextInt();
		
		if (first > second)
			if (first > third)
				System.out.println(first);
			else
				System.out.println(third);
		else
			if (second > third)
				System.out.println(second);
			else
				System.out.println(third);
			
		
}

}
