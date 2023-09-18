package Day3;

public class Concatenate {
	public static void main (String [] args) {
			String firstName = "Ivan";
			String lastName = "Ivanov";
			String fullName = String.format("%s %s", firstName, lastName);
			
			//System.out.printf("Your full name is %s\n", fullName);
						
			int age = 21;
			System.out.println("Hello,my name is " + fullName +"\nI am " + age + " years old");
	}

}
