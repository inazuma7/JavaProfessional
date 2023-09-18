package Day2;

public class breakfast {
	public static void main (String [] args) {
		menu1();
		menu2();
		
	}
	
	public static void menu1() {
		System.out.println("I do not like green eggs and ham,");
		System.out.println("I do not like them, Sam I am!");
	}
	
	public static void menu2() {
		System.out.println("I do not like the on boat,");
		System.out.println("I do not like them with a goat");
		menu1();
	}
	

}
