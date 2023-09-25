package Day10;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class RepeatStrings {
	public static void main(String [] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		String[] words = scanner.nextLine().split(" ");
		
		List<String>result = new ArrayList<>();
		
		for(String word: words) {
			result.add(word.repeat(word.length()));
		}
		System.out.println(String.join("", result));
	}

}
