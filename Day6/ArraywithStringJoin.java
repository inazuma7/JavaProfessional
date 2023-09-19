package Day6;

public class ArraywithStringJoin {
	public static void main (String [] args) {
		
		String[] strings = {"one", "two"};
		System.out.println(String.join(" ", strings));
		
		//int[] arr = { 1,2, 3};
		//System.out.println(String.join(" ", arr)); // compile error
	}

}
