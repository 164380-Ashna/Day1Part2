//Collection of logical classes is package
package com.ashna.bank;
import java.util.Scanner;

public class BankAccount {
	
	//static variable
	//static variables are not dependent on object creation
	//static member variable gets loaded the moment class gets loaded 
	//to offer some common fundamentals to objects
	private static int autoAccountNo;
	
	//instance variable/ class variable
	//We cannot use these instance variables without creating objects.
	
	//within a class concept
	private int accountNo;
	private String accountHolderName;
	private double accountBalance;
	
	//init block
	{
		accountNo=++autoAccountNo;
		
	}
	
	
	//initializing member variables of object is the use of constructor
	//cosnstructors are automatically called thats why 
	//we initialize the member variables here not in some other method.
	//we should not use looping in the constructor because thats not why we have constructor
	//constructors are only for initialising the member variable 
	// rest other methodscan do their role.
	
	//Default constructor
	public BankAccount() {
		accountHolderName="Unknow";
		accountBalance=0;
		
		
	}
	
	//constructor overloading where we get variety and option
	//Parameterized constructor
	public BankAccount(String accountHolderName, double accountBalance) {
		this.accountHolderName=accountHolderName;
		this.accountBalance=accountBalance;
		
		
	}
	//reinitializing or modifying the member variables
	//setter
	//not creating setter method for acc balance or holder name since 
	//these are transactional/operational variables and should be changed only when
	//some operation is performed.
	public void setAccountHolderName(String accountHolderName) {
		this.accountHolderName = accountHolderName;
	}
	//setter method ends here
	
	
	
	//getters
	public int getAccountNo() {
		return accountNo;
	}
	public double getAccountBalance() {
		return accountBalance;
	}
	
	
	public String getAccountHolderName() {
		return accountHolderName;
	}
	//Getter method ends
	
	//Service method
	public void withdraw(double amount) {
		if(amount<=0 || amount>accountBalance || (accountBalance-amount<1000)){
			
				System.out.println("Not a Valid Transaction");
			
		}
		else {
			
			this.accountBalance-=amount;
			System.out.println("The new balance is: "+accountBalance);
		}	
	}
	
	public void deposit(double amount) {
		if(amount<=0){
			System.out.println("Not a Valid Transaction");
		}
		else {
			this.accountBalance+=amount;
			System.out.println("The new balance is: "+accountBalance);
		}
		
	}
	
	
	public static void main(String[] args) {
		BankAccount acc=new BankAccount();
		BankAccount acc2=new BankAccount("Onkar",5000);
		
	}

}
