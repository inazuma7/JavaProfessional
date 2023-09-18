package Day4;

import java.util.Scanner;

public class Cinema {
    public static void main(String [] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("choose the type : ");
		String type = scanner.nextLine();
		
		System.out.println("choose row : ");
		int rows = 	Integer.parseInt(scanner.nextLine());
	
		System.out.println("choose col : ");
		int cols = Integer.parseInt(scanner.nextLine());
		int seats = rows * cols;
	
		
		switch (type) {
		   case "Premiere":
			   System.out.printf("%.2f\n", seats * 12);
			   break;
			   
		   case "Normal":
			   System.out.printf("%.2f\n", seats * 7.5);
			   break;	   
			   
		   case "Discount":
			   System.out.printf("%.2f\n", seats * 5);
			   break;
			   
		   default:
			   System.out.println("unknown");
			   break;
			   
		}
    }

}
