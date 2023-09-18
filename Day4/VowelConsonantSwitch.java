package Day4;

import java.util.Scanner;

public class VowelConsonantSwitch {
     public static void main(String [] args) {
		
		Scanner scanner = new Scanner(System.in);
		char letter = scanner.nextLine().charAt(0);
		
		
		switch (letter) {
		   case 'A' :
		   case 'a' :
		   case 'E' : 
		   case 'e' :
		   case 'I' : 
		   case 'i' :
		   case 'O' : 
		   case 'o' :	
		   case 'U' :
		   case 'u' :
		       System.out.println("Vowel");
		       break;
		
		   default:
		       System.out.println("Consonant");
		       break;
		       
		}
	}

}

     
