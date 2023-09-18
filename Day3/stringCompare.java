package Day3;

public class stringCompare {
	public static void main  (String [] args) {
		String a = "Example";
		String b = "example";
		System.out.println(a.equals(b));
		
		String c = "SoftUni";
		String d = "#SoftUni".substring(1);
		System.out.println(c.equals(d));
		System.out.println(c == d);
	}

}
