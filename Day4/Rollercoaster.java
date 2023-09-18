package Day4;

import java.util.Scanner;

public class Rollercoaster {
	
	public static void main (String [] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("please enter number of places: ");
		int places = scanner.nextInt();
		System.out.println("please enter minimum age: ");
		int minAge = scanner.nextInt();
		System.out.println("please enter queue size: ");
		int queueSize =scanner.nextInt();
		
		int validPeopleCount = 0;
		for (int i =0; i < queueSize; i++) {
			System.out.println("please enter your age: ");
			int personAge = scanner.nextInt();
			if (personAge >= minAge && places > validPeopleCount)
				validPeopleCount++;
		}
		
		if (validPeopleCount >= places) {
			System.out.println("The Rollercoaster departures");
		} else {
			System.out.println("waiting....");
		}
		
	}

}
