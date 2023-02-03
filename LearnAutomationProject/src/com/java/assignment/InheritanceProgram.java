package com.java.assignment;

import java.util.HashMap;

public class InheritanceProgram extends BankToGetLoan{

	public static int accountNumber=1;

	private String customerNameString;
	private String phoneNo;
	int customerAccountNumber;
	public static HashMap<Integer, Integer> collectDeposits = new HashMap<Integer,Integer>();

	public static void main(String[] args) {		
		InheritanceProgram customer1 = new InheritanceProgram("John Kenedy","9025184323");
		System.out.println("Customer1 Details\n"+customer1.customerAccountNumber+"\n"+customer1.customerNameString+"\n"+customer1.phoneNo);

		//customer1 deposits amount to his account 
		customer1.depositAmount(customer1.customerAccountNumber, 500);
		System.out.println("Available Balance for customer "+customer1.customerAccountNumber+"\n"+collectDeposits.get(customer1.customerAccountNumber));

		customer1.depositAmount(customer1.customerAccountNumber, 1000);
		System.out.println("Available Balance for customer "+customer1.customerAccountNumber+"\n"+collectDeposits.get(customer1.customerAccountNumber));

		customer1.getLoan(customer1.customerAccountNumber, collectDeposits.get(customer1.customerAccountNumber));
		
		InheritanceProgram customer2 = new InheritanceProgram("Mark Louis","9962314745");
		System.out.println("\nCustomer2 Details\n"+customer2.customerAccountNumber+"\n"+customer2.customerNameString+"\n"+customer2.phoneNo);

		customer2.depositAmount(customer2.customerAccountNumber, 2000);
		customer2.depositAmount(customer2.customerAccountNumber, 1000);
		System.out.println("Available Balance for customer "+customer2.customerAccountNumber+"\n"+collectDeposits.get(customer2.customerAccountNumber));

		customer2.getLoan(customer2.customerAccountNumber, collectDeposits.get(customer2.customerAccountNumber));
	}
	
	//this bank allows user to get loan if his minimum balance is 2000 or more
	@Override
	public void getLoan(int accountNo, int accountBalance) {
		
		if(accountBalance>2000) {
			System.out.println("For customer "+accountNo+" loan is approved");
		}
		else {
			System.out.println("For customer "+accountNo+" loan is not eligible");
		}
	}

	public InheritanceProgram(String customerName,String phNo) {
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

}
class BankToGetLoan{
	
	public void getLoan(int accountNo, int accountBalance) {
		
		if(accountBalance>5000) {
			System.out.println("For customer "+accountNo+" loan is approved");
		}
		else {
			System.out.println("For customer "+accountNo+" loan is not eligible");
		}
	}
}

//AccessModifiersProgram customer2 = new AccessModifiersProgram("Mark Louis","9962314745");
//System.out.println("\nCustomer2 Details\n"+customer2.customerAccountNumber+"\n"+customer2.customerNameString+"\n"+customer2.phoneNo);

//AccessModifiersProgram customer3 = new AccessModifiersProgram("Eve Lenin","8526945585");
//System.out.println("\nCustomer3 Details\n"+customer3.customerAccountNumber+"\n"+customer3.customerNameString+"\n"+customer3.phoneNo);

