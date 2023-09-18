package Day4;

import java.util.Scanner;

public class FoodOrDrink {
    public static void main(String [] args) {
		
		Scanner scanner = new Scanner(System.in);
		String s = scanner.nextLine();
		
		if(s.equals("curry") || s.equals("noodles") || s.equals("sushi") || s.equals("spaghetti"))
			System.out.println("food");
		
		else if (s.equals("tea") || s.equals("water") || s.equals("coffee"))
			System.out.println("drink");
		
		else
			System.out.println("unknown");
		
    }

}
    
