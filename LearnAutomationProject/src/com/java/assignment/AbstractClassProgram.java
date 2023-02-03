package com.java.assignment;

import java.util.HashMap;

public class AbstractClassProgram extends BankFunctions{
	public static int accountNumber=1;

	private String customerNameString;
	private String phoneNo;
	int customerAccountNumber;
	public static HashMap<Integer, Integer> collectDeposits = new HashMap<Integer,Integer>();

	public static void main(String[] args) {
		AbstractClassProgram customer3 = new AbstractClassProgram("Eve Lenin","8526945585");
		System.out.println("\nCustomer1 Details\n"+customer3.customerAccountNumber+"\n"+customer3.customerNameString+"\n"+customer3.phoneNo);
		
		customer3.depositAmount(customer3.customerAccountNumber, 5000);
		customer3.withdrawAmount(customer3.customerAccountNumber, 2000, collectDeposits);
		System.out.println("Available Balance for customer "+customer3.customerAccountNumber+"\n"+collectDeposits.get(customer3.customerAccountNumber));
	}
	
	public AbstractClassProgram(String customerName,String phNo) {
		customerAccountNumber = accountNumber++;
		customerNameString = customerName;
		phoneNo = phNo;
	}
	
	public void depositAmount(int customerId,int amount) {
		if(collectDeposits.containsKey(customerId)) {
			int availableBalance = collectDeposits.get(customerId);
			collectDeposits.put(customerId, availableBalance+amount);
			System.out.println("Deposited in customer "+customerId+" account Rs "+amount);
		}
		else {
			collectDeposits.put(customerId, amount);
		}
	}
}

abstract class  BankFunctions{
	
	abstract void depositAmount(int customerId,int amount);
	public void withdrawAmount(int customerId,int amount,HashMap<Integer, Integer> collectDeposits)
	{
		if(collectDeposits.containsKey(customerId)) {
			int availableBalance = collectDeposits.get(customerId);
			if((availableBalance-amount)>0)
			{
				collectDeposits.put(customerId, availableBalance-amount);
				System.out.println("Withdrawn from customer "+customerId+" account Rs "+amount);
			}
			else {
				System.out.println("No sufficient Balance");
			}
		}
		else {
			System.out.println("No account available");
		}

	}
}