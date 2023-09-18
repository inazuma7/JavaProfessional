package Day5;

import java.util.Scanner;

public class NumberProcessor {
	
   public static void main (String [] args) {
		
		Scanner scanner = new Scanner(System.in);
		int number = Integer.parseInt(scanner.nextLine());
		String command = scanner.nextLine();
		while (!command.equals("End")) {
			switch (command) {
			case "Inc": number++; 
			           break;
			           
			case "Dec": number--; 
			           break;
			           
			}
			command = scanner.nextLine();
		}
		
		System.out.println(number);
}

}
