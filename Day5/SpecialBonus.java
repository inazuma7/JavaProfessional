package Day5;

import java.util.Scanner;

public class SpecialBonus {
    public static void main (String [] args) {
		
		Scanner scanner = new Scanner(System.in);
		int stopNum = scanner.nextInt();
		int previousNum = stopNum;
		while(true) {
			int num = scanner.nextInt();
			if(num == stopNum)
				break;
			previousNum =num;
			
		}

		System.out.println(previousNum * 1.2);
}}
