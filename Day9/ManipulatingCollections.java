package Day9;

import java.util.Arrays;
import java.util.Scanner;

public class ManipulatingCollections {
	public static void main(String [] args) {
		
		Scanner scanner = new Scanner(System.in);
		int[] nums = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(e-> Integer.parseInt(e)).toArray();
		for (int num : nums) {
			System.out.print(num + " ");
		}
		
		
		String[] words = {"abc","def","geh","yyy"};
		words = Arrays.stream(words).map(w -> w + "yyy").toArray(String[]::new);
   
		for (String word: words) {
		   System.out.println(word);
		}
	}

}
