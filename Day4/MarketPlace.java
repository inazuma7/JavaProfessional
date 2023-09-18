package Day4;

import java.util.Scanner;

public class MarketPlace {
	public static void main(String [] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("please enter fruit name: ");
		String product = scanner.nextLine();
		System.out.println("please enter Weekend or Weekday: ");
		String dayOfWeek = scanner.nextLine();
		
		if(product.equals("Banana"))
			if (dayOfWeek.equals("Weekday"))
				System.out.println("2.50");
			else
				System.out.println("2.70");
		
		else if (product.equals("Apple"))
			if (dayOfWeek.equals("Weekday"))
				System.out.println("1.30");
			else
				System.out.println("1.60");

		else if (product.equals("Kiwi"))
			if (dayOfWeek.equals("Weekday"))
				System.out.println("2.20");
			else
				System.out.println("3.00");
		
		
	}

}
