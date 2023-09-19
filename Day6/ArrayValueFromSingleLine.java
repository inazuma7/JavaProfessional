package Day6;

import java.util.Scanner;

public class ArrayValueFromSingleLine {
    public static void main (String [] args) {
		
		
		Scanner scanner = new Scanner(System.in);
		String values = scanner.nextLine();
		String[] items = values.split(" ");
		int[] arr = new int[items.length];
		
		for (int i = 0; i < items.length; i++)
			arr[i] = Integer.parseInt(items[i]);
		
		/*System.out.print("Array contents: ");
		for (int i =0; i <arr.length; i++);
		System.out.print(arr[i] + " ");*/
		
     }
    
    //System.out.println("");
 }
