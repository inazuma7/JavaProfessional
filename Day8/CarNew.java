package Day8;

import java.util.Scanner;

public class CarNew {
	
	private String brand;
	private String model;
	private int horsePower;
	
	//override
	public String toString() {
		if (horsePower <0)
			return String.format("%s: %s", this.brand, this.model);
		return String.format("%s, %s, %d", this.brand, this.model, this.horsePower);
	}
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
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
	
	//constructors
	public CarNew (String brand, String model) {
			 this.brand = brand;
			 this.model = model;
			 horsePower = -1;
		 }


	public CarNew (String brand, String model, int horsePower) {
		this(brand,model);
		this.horsePower = horsePower;
	}

	
	public static void main (String [] args) {
		
		Scanner scanner = new Scanner(System.in);
		String brand = scanner.nextLine();
		String model = scanner.nextLine();
		String horsePower = scanner.nextLine();
		
		if(horsePower.equals(""))
		{
		    CarNew car = new CarNew(brand, model);
			System.out.println(car);
		}else {
			int hp = Integer.parseInt(horsePower);
			Car car = new Car(brand, model,hp);
			System.out.println(car);
		}	
    }



  

}