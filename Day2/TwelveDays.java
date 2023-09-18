package Day2;

public class TwelveDays {
	public static void main(String [] args) {
		day1();
		day2();
	}
	
	public static void day1() {
			System.out.println("A partridge in pear tree.");
	}
	
	public static void day2() {
		System.out.println("Two turtle doves, and");
		day1();
	}

}
