package Day10;

import java.util.Random;
import java.util.Scanner;

public class RanNumRange {
	
	public static void main(String [] args) {
		
		Scanner scanner = new Scanner(System.in);
		Random randGen = new Random();
		
		int start = scanner.nextInt();
		int end = scanner.nextInt();
		int randomNum = randGen.nextInt(end-start+1) + start;
		
		System.out.println(randomNum);
		
		
		
	}

}
