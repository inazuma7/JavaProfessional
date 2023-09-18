package Day2;

public class Exercise2 {
   public static void main (String [] args) {
	   String outer = "I'm inside the Main()";
	    for (int i =0; i < 10; i++) {
		   String inner = "I'm inside loop";
	   }
	   System.out.println(outer);
	   //System.out.println(inner);
   }
}
