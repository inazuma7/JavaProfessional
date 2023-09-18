package Day3;

import java.util.Scanner;

public class coffeeShop {
	public static void main(String [] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("please insert your order coffee or tea:");
		String order = scanner.nextLine();
		System.out.println("want extra sugar or no:");
		String extra = scanner.nextLine();
		double price = 0;
		
		if (order.equals("coffee")) {
			price = 1.00;
		} else if (order.equals("tea")) {
			price = 0.60;
		}
		if(extra.equals("sugar")) {
			price += 0.40;
		}
		System.out.printf("Final price: $%.2f", price);
	}

}
