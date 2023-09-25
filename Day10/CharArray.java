package Day10;

import java.util.Arrays;

public class CharArray {
	public static void main(String [] args) {
		String str = new String(new char[] {'s','t','r'});
		char[] charArr = str.toCharArray();
		
		System.out.println(Arrays.toString(charArr));
	}

}
