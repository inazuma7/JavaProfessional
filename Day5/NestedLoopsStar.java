package Day5;

public class NestedLoopsStar {
	public static void main (String [] args) {
		int n = 3;
		for (int row =1; row <=n; row++) {
			for (int col =1; col <= n; col++) {
				System.out.printf("*");
			}
			System.out.println();
		}
	}

}
