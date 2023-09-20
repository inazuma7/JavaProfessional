package Day7;


public class GreaterTwoValues {
	public static void main (String [] args) {
		
		System.out.println(getMax(9,6));
		System.out.println(getMax('d', 'a'));
		System.out.println(getMax("Test","hello"));
					
	}
	
	public static int getMax(int a, int b) {
		if(a > b)
	        return a;
	    return b;	
	}
	
	public static char getMax(char a, char b) {
		if(a > b)
	        return a;
	    return b;
	}
	
	public static String getMax(String a, String b) {
		if(a.compareTo(b) > 0)
	        return a;
	    return b;
	}


}
