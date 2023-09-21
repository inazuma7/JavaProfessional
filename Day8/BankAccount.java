package Day8;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class BankAccount {
	public static final double DEFAULT_INTEREST = 0.15;
	
	public static double interestRate = DEFAULT_INTEREST;
	private static int countAcc = 0;
	
	private int id;
	private double balance;
	
	public BankAccount() {
		countAcc++;
		id = countAcc;
		System.out.printf("Account #%d created\n",id);
		
	}
	
	public static void setInterestRate(double interest) {
		BankAccount.interestRate = interest;
		System.out.printf("Interest rate changed: %.2f\n", interest);
	}

	public int getId() {
		return id;
	}
    
	public double calcInterest(int month) {
		return balance *interestRate *month/12;
		
	}
	public void deposit(double x) {
		balance += x;
		System.out.printf("Deposited %.2f to account #%d\n", x, id);
	}
	
	
	public String toString() {
		return String.format("Acc #%d\nBalance: RM%.2f\n", id, balance);
		
	}
	
	public static void main(String [] args) {
		
		Scanner scanner = new Scanner(System.in);
		List<BankAccount> accounts =new ArrayList <BankAccount>();
		loop:{
		while(true) {
	        String [] command = scanner.nextLine().split(" ");
			
			switch(command[0]) {
			      case "create": {
			    	  BankAccount acc = new BankAccount();
			    	  accounts.add(acc);
			    	  break;
			      }
			    	  
			      case "deposit":{
			    	  for (BankAccount account: accounts) {
			    		  if (account.getId() == Integer.parseInt(command[1])) {
			    			  account.deposit(Double.parseDouble(command[2]));
			    			  break;
			    		  }
			    	  }
			    	  break;
			      }
			    	  
			      case "set-interest": {
			    	  BankAccount.setInterestRate(Double.parseDouble(command[1]));
			    	  break;
			      }
			    	  
			      case "calc-interest":{
			    	  boolean found = false;
			    	  double interest =0;
			    	  for(BankAccount account:accounts) {
			    		  if(account.getId() == Integer.parseInt(command[1])) {
			    			  interest = account.calcInterest(Integer.parseInt(command[2]));
			    			  System.out.printf("Interest: %.2f", interest);
			    			  found = true;
			    			  break;
			    		  }
			    	  }
			    	  if(!found)
			    	  System.out.printf("Account #" + command[1] + "not found");
			    	  break;
			      }
			      
			      case "end":{
			    	  System.out.println("Goodbye");
			    	  break loop;
			      }
			      
			      default:
			    	  System.out.println("Wrong command! Enter valid command:");
			    	  break;
			    	  
			}
			
			
		}
	}
	}
}
