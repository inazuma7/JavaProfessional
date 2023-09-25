package Day10;

import java.util.Date;

public class ConStringBuilder {
	
public static void main(String [] args) {
		
		//concatenation
		System.out.println(new Date());
		
		String text = "";
		
		for (int i = 0; i <10000; i++)
			text += "a";
		System.out.println(new Date());
		
        /*System.out.println(new Date());
		
		StringBuilder text = new StringBuilder();
		
		for (int i = 0; i <10000; i++)
			text.append("a");
		System.out.println(new Date());*/
		
	}



}
