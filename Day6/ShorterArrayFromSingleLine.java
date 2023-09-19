package Day6;

import java.util.Arrays;
import java.util.Scanner;

public class ShorterArrayFromSingleLine {
   public static void main (String [] args) {
		
		
		Scanner scanner = new Scanner(System.in);
		String inputLine = scanner.nextLine();
		String[] items = inputLine.split(" ");
		
		int[] arr = Arrays.stream(items)
				.mapToInt(e -> Integer.parseInt(e)).toArray();
		
		
		
		
		/*int[] arr = Arrays
				.stream(scanner.nextLine().split(""))
				.mapToInt(e -> Integer.parseInt(e)).toArray();*/

}}
