package Day3;

import java.util.Scanner;

public class freezingWheather {
	public static void main(String [] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Please input the temperature?");
		double temperature = scanner.nextDouble();
		
		if (temperature <= 0) {
			System.out.println("Freezing weather!");
		}
	}

}
