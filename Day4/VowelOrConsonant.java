package Day4;

import java.util.Scanner;

public class VowelOrConsonant {
    public static void main(String [] args) {
		
		Scanner scanner = new Scanner(System.in);
		char letter = scanner.nextLine().charAt(0);
		
		if(letter == 'A' || letter == 'a'|| 
		   letter == 'E' || letter == 'e'||
		   letter == 'I' || letter == 'i'||
		   letter == 'O' || letter == 'o'||	
		   letter == 'U' || letter == 'u')
		  System.out.println("Vowel");
		
		else
		  System.out.println("Consonant");

}}
