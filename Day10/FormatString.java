package Day10;

public class FormatString {
	
	public static void main(String [] args) {
		
		
		//right-justify
		System.out.println(String.format("|%6d|", 99));
		
		
		//left-justify
		System.out.println(String.format("|%-6d|", 99));
		
		
		//filling integer
		System.out.println(String.format("|%06d|", 99));
		
		//floating-point
		System.out.println(String.format("|%06.2f|", 3.5));
		
		
		
	}

}
