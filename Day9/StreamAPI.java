package Day9;

import java.util.Arrays;

public class StreamAPI {
	public static void main(String [] args) {
		
		//int min = Arrays.stream(new int[]{15, 25, 35}).min().getAsInt();
		
		//int min = Arrays.stream(new int[]{15, 25, 35}).min().orElse(2);
		
		int min = Arrays.stream(new int[]{}).min().orElse(3);
		
		System.out.println(min);
		
		
		int max = Arrays.stream(new int[]{15, 25, 35}).max().getAsInt();
		
		System.out.println(max);
		
		
		int sum = Arrays.stream(new int[]{15, 25, 35}).sum();
		System.out.println(sum);
		
		
		double avg= Arrays.stream(new int[]{15, 25, 35}).average().getAsDouble();
		System.out.println(avg);
		
		
		
	}

}
