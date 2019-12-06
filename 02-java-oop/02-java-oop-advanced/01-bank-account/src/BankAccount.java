import java.util.Random;
import java.util.Arrays;
import java.util.stream.Stream;
import java.util.List;

public class BankAccount {
	private String accountNumber;
	private double checkingBalance;
	private double savingsBalance;
	private static int numOfAccounts;
	private static double totalBalInAccounts;
	
	private static String accountNum() {
		String randNums = "";
		Random rand = new Random();
		for(int i = 0; i < 10; i++) {
			randNums += rand.nextInt(10);
		}
		return randNums;
	}
	
	
	public BankAccount() {
		numOfAccounts += 1;
		this.checkingBalance = 0;
		this.savingsBalance = 0;
		this.accountNumber = accountNum();
	}
	
    public String userAccountNum() {
        return this.accountNumber;
    }
    
    public void getCheckingBal() {
    	System.out.println(this.checkingBalance);
    }
    
    public void getSavingsBal() {
    	System.out.println(this.savingsBalance);
    }
    
    public void depositToAccount(String accountType, double amount) {
    	if(accountType == "checking") {
    		this.checkingBalance += amount;
    		System.out.println("Checking account balance: " + this.checkingBalance);
    	}
    	if(accountType == "savings") {
    		this.savingsBalance += amount;
    		System.out.println("Savings account balance: " + this.savingsBalance);
    	}
    }
    
    public void withdrawFromAccount(String accountType, double amount) {
    	if(accountType == "checking") {
    		if(this.checkingBalance == 0) {
    			System.out.println("Cannot withdraw any funds, checking account balance is zero.");
    		} else {
    			this.checkingBalance -= amount;
        		System.out.println("Checking account balance: " + this.checkingBalance);
    		}
    	}
    	if(accountType == "savings") {
    		if(this.checkingBalance == 0) {
    			System.out.println("Cannot withdraw any funds, savings account balance is zero.");
    		} else {
    		this.savingsBalance -= amount;
    		System.out.println("Savings account balance: " + this.savingsBalance);
    		}
    	}
    }
    
    public void totalBalance() {
    	BankAccount.totalBalInAccounts = this.checkingBalance + this.savingsBalance;
    	System.out.println("Total balance between checking and savings accounts: " + BankAccount.totalBalInAccounts);
    }
}


/*
● Create a BankAccount class.

● The class should have the following attributes: (string) account number, (double) checking balance, (double) savings balance.

● Create a class member (static) that has the number of accounts created thus far.

● Create a class member (static) that tracks the total amount of money stored in every account created. ***********

● Create a private method that returns a random ten digit account number.

● In the constructor, call the private method from above so that each user has a random ten digit account.

● In the constructor, be sure to increment the account count.

● Create a getter method for the user's checking account balance.

● Create a getter method for the user's saving account balance.

● Create a method that will allow a user to deposit money into either the checking or saving, be sure to add to total amount stored.

● Create a method to withdraw money from one balance. Do not allow them to withdraw money if there are insufficient funds.

● Create a method to see the total money from the checking and saving.

● Users should not be able to set any of the attributes from the class. 

*/