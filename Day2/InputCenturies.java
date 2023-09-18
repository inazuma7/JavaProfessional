package Day2;

import java.util.Scanner;

public class InputCenturies {
		public static void main(String [] args) {
			
			Scanner scanner = new Scanner(System.in);
			System.out.print("Enter centuries: ");
			byte centuries = scanner.nextByte();
			short years = (short) (centuries * 100);
			int days = (int)(years * 365);
			long hours = (long) (days*24);
			
			
			System.out.printf("%d centuries = %d years = %d days = %d hours.", centuries,years,days,hours);
		}
	



}
