package Day10;

import java.util.Scanner;

public class TryCatch {
	
    public static void main(String [] args) {
		
		Scanner scanner = new Scanner(System.in);
		String s = scanner.nextLine();
		
		try {
			Integer.parseInt(s);
			System.out.printf("You entered a valid integer number:%s", s);
			
		} catch (Exception ex) {
			System.out.println("Cannot parse number!");
			
		} /*catch (NumberFormatException ex) {
			System.out.println("Invalid integer number!");
		}*/
    
    }

}
