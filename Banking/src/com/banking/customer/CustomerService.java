package com.banking.customer;

import com.banking.banks.CitiBank;
import com.banking.banks.IciciBank;
import com.banking.inter.BankInterface;

public class CustomerService {

	public static void main(String[] args) {
		
		BankInterface citi = new CitiBank();
		citi.openAnAccount();
		
		System.out.println("Which bank operations you want to do");
		
		
		
		// Capture customer Information
		
		
		
		// TODO Auto-generated method stub
		// Which Bank Account you want to Open
		// Ask the Customer to enter the information required
		// Print Success Statement to confirm the successful operation.
	}

}
