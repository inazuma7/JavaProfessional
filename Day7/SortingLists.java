package Day7;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class SortingLists {
	public static void main (String [] args) {
		List <String> names = new ArrayList <>(Arrays.asList("Peter", "Michael", "George", "Victor", "John"));
		Collections.sort(names);
		System.out.println(String.join(", ", names));
		
		Collections.sort(names);
		Collections.reverse(names);
		System.out.println(String.join(", ", names));
	}

}

