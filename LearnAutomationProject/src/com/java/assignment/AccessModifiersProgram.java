package com.java.assignment;

import java.util.HashMap;

public class AccessModifiersProgram {

	public static int accountNumber=1;

	private String customerNameString;
	private String phoneNo;
	int customerAccountNumber;
	public static HashMap<Integer, Integer> collectDeposits = new HashMap<Integer,Integer>();

	public static void main(String[] args) {		
		AccessModifiersProgram customer1 = new AccessModifiersProgram("John Kenedy","9025184323");
		System.out.println("Customer1 Details\n"+customer1.customerAccountNumber+"\n"+customer1.customerNameString+"\n"+customer1.phoneNo);

		//customer1 deposits amount to his account 
		customer1.depositAmount(customer1.customerAccountNumber, 2000);
		System.out.println("Available Balance for customer "+customer1.customerAccountNumber+"\n"+collectDeposits.get(customer1.customerAccountNumber));

		customer1.depositAmount(customer1.customerAccountNumber, 1000);
		System.out.println("Available Balance for customer "+customer1.customerAccountNumber+"\n"+collectDeposits.get(customer1.customerAccountNumber));

		customer1.withdrawAmount(customer1.customerAccountNumber, 500);
		System.out.println("Available Balance for customer "+customer1.customerAccountNumber+"\n"+collectDeposits.get(customer1.customerAccountNumber));

	}

	public AccessModifiersProgram(String customerName,String phNo) {
		customerAccountNumber = accountNumber++;
		customerNameString = customerName;
		phoneNo = phNo;
	}

	public void depositAmount(int customerId,int amount) {
		if(collectDeposits.containsKey(customerId)) {
			int availableBalance = collectDeposits.get(customerId);
			collectDeposits.put(customerId, availableBalance+amount);
		}
		else {
			collectDeposits.put(customerId, amount);
		}
	}

	private void withdrawAmount(int customerId,int amount)
	{
		if(collectDeposits.containsKey(customerId)) {
			int availableBalance = collectDeposits.get(customerId);
			if((availableBalance-amount)>0)
			{
				collectDeposits.put(customerId, availableBalance-amount);
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

//AccessModifiersProgram customer2 = new AccessModifiersProgram("Mark Louis","9962314745");
//System.out.println("\nCustomer2 Details\n"+customer2.customerAccountNumber+"\n"+customer2.customerNameString+"\n"+customer2.phoneNo);

//AccessModifiersProgram customer3 = new AccessModifiersProgram("Eve Lenin","8526945585");
//System.out.println("\nCustomer3 Details\n"+customer3.customerAccountNumber+"\n"+customer3.customerNameString+"\n"+customer3.phoneNo);

