package Day2;

public class Abnormalities {
	
	public static void main(String [] args) {
		
		double a = 1.0f;
		double b =0.33f;
		double sum = 1.33d;
		System.out.printf("a+b=%f sum=%f equal=%b", a+b, sum,(a+b ==sum));
		
		double num =0;
		for (int i =0; i<10000; i++) num += 0.0001;
		System.out.println(num);
	}
	

}
