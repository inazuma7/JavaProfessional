package Day4;

import java.util.Scanner;

public class MultiLabelsSwitchCase {
	    public static void main(String [] args) {
			
			Scanner scanner = new Scanner(System.in);
			System.out.println("animal name: ");
			String animal = scanner.nextLine();
			switch(animal) {
			    case "dog":
			    case "cat":
				System.out.println("mammal");
				break;
				default:
					System.out.println("unknown");
					break;
			}

}}
