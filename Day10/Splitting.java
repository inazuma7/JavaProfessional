package Day10;

import java.util.Arrays;

public class Splitting {
	public static void main(String [] args) {
		
		String text = "Hello, I am Muhi.";
		String[] words = text.split(",  .");
		System.out.println(Arrays.toString(words));
	}

}
