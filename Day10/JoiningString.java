package Day10;

public class JoiningString {
	public static void main(String [] args) {
		
		
		//concatenate string
		String t = String.join("", "con", "ca", "ten", "ate");
		System.out.println(t);
		
		
		//array/list string
		String s ="abc";
		String[] arr = new String[3];
		for (int i = 0; i < arr.length; i++)
		{
			arr[i] =s;
		}
		String repeated = String.join("", arr);
		System.out.println(repeated);
	}

}
