package Day7;

public class ReferenceType {
	public static void main (String [] args) {
		int []nums = {5};
		increment(nums, 15);
		System.out.println(nums[0]);
	}
	
	public static void increment (int[] nums, int value) {
		nums[0]+= value;
		
	}

}
