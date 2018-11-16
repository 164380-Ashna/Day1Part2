package com.ashna.test;
import com.ashna.bank.BankAccount;

import java.util.Scanner;

public class TestBankAccount {
	
	public static void testBankAccountMethod() {
		BankAccount acc1 = new BankAccount("Ashna", 50000);
		BankAccount acc2 = new BankAccount("Aakash", 50000);
		BankAccount acc3 = new BankAccount("BihariBabu", 50000);
		
		
		Scanner sc1=new Scanner(System.in);
		System.out.println("Enterthe amount to be deposited: ");
	    int amount=sc1.nextInt();
		acc1.deposit(amount);
		
		System.out.println("Enterthe amount to be deposited: ");
	    amount=sc1.nextInt();
		acc2.deposit(amount);
		
		System.out.println("Enterthe amount to be deposited: ");
	    amount=sc1.nextInt();
		acc3.deposit(amount);
		
	
		System.out.println("Enterthe amount to be withdrawn: ");
	    amount=sc1.nextInt();
		acc1.withdraw(amount);
		
		System.out.println("Enterthe amount to be withdrawn: ");
	    amount=sc1.nextInt();
		acc2.withdraw(amount);
		
		System.out.println("Enterthe amount to be withdrawn: ");
	    amount=sc1.nextInt();
		acc3.withdraw(amount);
		
		
	}
	
	public static void main(String[] args){
		testBankAccountMethod();
		
		
	}

}