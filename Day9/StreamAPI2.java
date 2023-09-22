package Day9;

import java.util.ArrayList;

public class StreamAPI2 {
	public static void main(String [] args) {
		
	    ArrayList<Integer> nums = new ArrayList<>() {{
		add(15); add(25); add(35);
	    }};

	      //int min = nums.stream().mapToInt(Integer::intValue).min().getAsInt();
	      int min = nums.stream().min(Integer::compareTo).get();
	      System.out.println(min);
	      
	      
	      //int max = nums.stream().mapToInt(Integer::intValue).max().getAsInt();
	      int max = nums.stream().max(Integer::compareTo).get();
	      System.out.println(max);
	      
	      
	      int sum = nums.stream().mapToInt(Integer::intValue).sum();
	      System.out.println(sum);
	      
	      
	      double avg = nums.stream().mapToInt(Integer::intValue).average().getAsDouble();
	      System.out.println(avg);
	}
}
