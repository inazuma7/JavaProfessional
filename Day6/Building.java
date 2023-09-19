package Day6;
import java.util.Scanner;

public class Building {
	public static void main (String [] args) {
		
		Scanner scanner = new Scanner(System.in);
		int floors = scanner.nextInt();
		int rooms = scanner.nextInt();
		
		for (int f = floors; f >=1; f--) {
			
		   for(int r =0; r < rooms; r++) {
		     if (f == floors)
		    	 System.out.print("L{"+f +"}{"+r+"}");
		    	 
		     else if (f % 2 == 0)
		    	 System.out.print("O{"+f +"}{"+r+"}");
		    	 
		     else
		    	 System.out.print("A{"+f +"}{"+r+"}");
		   
		   }
		   
		   System.out.println();
		   }
	}

}
