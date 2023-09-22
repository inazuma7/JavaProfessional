package Day9;

import java.util.LinkedList;

public class JoinList {
	
    public static void main(String [] args) {
		
		LinkedList <String> c1 = new LinkedList <String> ();
		c1.add("Red");
		c1.add("Green");
		c1.add("Black");
		c1.add("Pink");
		c1.add("Orange");
		System.out.println("List of the first linked list: " + c1);
		
		LinkedList <String> c2 = new LinkedList <String> ();
		c2.add("Blue");
		c2.add("Yellow");
		c2.add("Brown");
		c2.add("White");
		c2.add("Purple");
		System.out.println("List of the second linked list: " + c2);
		
		LinkedList <String> a = new LinkedList <String> ();
		a.addAll(c1);
		a.addAll(c2);
		System.out.println("New linked list: " +a);
		
		
    }	

}
