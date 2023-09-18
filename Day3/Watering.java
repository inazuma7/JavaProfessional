package Day3;

public class Watering {
	public static void main(String [] args) {
		
		double humidity = 90.0;
		
		if (humidity > 90.0)
			System.out.println("Rain -> skip watering");
		else
			System.out.println("No rain -> water the plants");
	}

}
