package Day10;

import java.util.Random;

public class RandomSequences {
	public static void main(String [] args) {
		Random randGen = new Random(12345);
		System.out.println("Random[1...1000000]: " +  (randGen.nextInt(1000000) + 1));
		
		Random randGen2 = new Random(12345);
		System.out.println("Random[1...1000000]: " +  (randGen2.nextInt(1000000) + 1));
		
		
	}

}
