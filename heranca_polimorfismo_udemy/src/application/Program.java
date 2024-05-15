package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Account;
import entities.BussinessAccount;
import entities.SavingsAccount;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		
		Account acc = new Account(1001, "Alex", 0.0);
		BussinessAccount bacc = new BussinessAccount(1002, "Maria", 0.0, 500.0);
		
		//UPCASTING
		
		Account acc1 = bacc;
		Account acc2 = new BussinessAccount(1003, "Bob", 0.0, 200.0);
		Account acc3 = new SavingsAccount(1004, "Ana", 0.0, 0.01);
		
		//DAWNCASTING
		
		BussinessAccount acc4 = (BussinessAccount)acc2;
		acc4.loan(100.0);

		if (acc3 instanceof BussinessAccount) {
			BussinessAccount acc5 = (BussinessAccount)acc3;
			acc5.loan(200.0);
			System.out.println("Loan!");
		}
		
		if (acc3 instanceof SavingsAccount) {
			SavingsAccount acc5 = (SavingsAccount)acc3;
			acc5.updateBalance();
			System.out.println("Update!");
		}
		
		//Testando o override
		acc1 = new Account(1001, "Alex", 1000.0);
		acc1.withdraw(200.0);
		System.out.println(acc1.getBalance());
		
		acc2 = new SavingsAccount(1002, "Maria", 1000.0, 0.01);
		acc2.withdraw(200.0);
		System.out.println(acc2.getBalance());
		
		acc3 = new BussinessAccount(1003, "Bob", 1000.0, 500.0);
		acc3.withdraw(200.0);
		System.out.println(acc3.getBalance());
		
	}

}
