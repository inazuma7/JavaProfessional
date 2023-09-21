package Day8;

import java.util.Scanner;

public class Car {
	private String brand;
	private String model;
	private int horsePower;
	
	public Car(String brand2, String model2, int horsePower2) {
		// TODO Auto-generated constructor stub
		this.horsePower = horsePower2;
		this.brand = brand2;
		this.model = model2;
	}
	
	public String getBrand() {
		return this.brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	
	public String toString() {
		return String.format("%s:%s:%d", this.brand, this.model, this.horsePower);
	}
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public int getHorsePower() {
		return horsePower;
	}
	public void setHorsePower(int horsePower) {
		this.horsePower = horsePower;
	}
	
public static void main (String []args) {
	
	Scanner scanner = new Scanner(System.in);
	String brand = scanner.nextLine();
	String model = scanner.nextLine();
	int horsePower = Integer.parseInt(scanner.nextLine());
	Car car = new Car(brand, model, horsePower);
	System.out.println(car);
	
}
}