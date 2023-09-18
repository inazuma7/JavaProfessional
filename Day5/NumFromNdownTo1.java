package Day5;

import java.util.Scanner;

public class NumFromNdownTo1 {
     public static void main (String [] args) {
		
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		for(int i = n; i >=1; i--) {
			if(i < n)
				System.out.print(",");
			System.out.print(i);
		}
		System.out.println();
}

}
