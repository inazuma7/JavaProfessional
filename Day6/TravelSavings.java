package Day6;

import java.util.Scanner;

public class TravelSavings {
    public static void main (String [] args) {
		
		Scanner scanner = new Scanner(System.in);
		String destination;
		while (!(destination = scanner.nextLine()).equals("End")) {
			double neededSum = Double.parseDouble(scanner.nextLine());
			double collectedSum = 0;
			
			while (collectedSum < neededSum) {
				collectedSum += Double.parseDouble(scanner.nextLine());
				System.out.printf("Collected:%.2f\n", collectedSum);
			}
			System.out.printf("Going to %s!\n", destination);
			
		}
		
}

}
