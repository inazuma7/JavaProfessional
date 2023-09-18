package Day3;

import java.util.Scanner;

public class areaFigure {
	
	 public static void main(String [] args) {
			
	    	System.out.println("please insert figure name:");
			Scanner scanner = new Scanner(System.in);
			String figure = scanner.nextLine();
			double area = 0;
			double length =0;
			double width = 0;
			double side = 0;
			
			
			if(figure.equals("square")) { 
				System.out.println("Insert side of square :");
				side = scanner.nextDouble();
				area = side * side;
			    
			}else if (figure.equals("rectangle")) {
				System.out.println("Insert side of length:");
			    length = scanner.nextDouble();
				System.out.println("Insert side of width :");
				width = scanner.nextDouble();
				area = length * width;
				
			}else  if (figure.equals("circle")) {
				System.out.println("Insert radius :");
				double radius = scanner.nextDouble();
				area = radius * radius * Math. PI;
			}
				
			System.out.printf("%.2f", area);

}}
