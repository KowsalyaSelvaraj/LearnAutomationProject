package com.java.assignment;

import java.util.HashMap;

public class InterfaceProgram implements AccountManagement,LoanMangement{

	public static int accountNumber=1;

	public String customerNameString;
	public String phoneNo;
	int customerAccountNumber;
	public static HashMap<Integer, Integer> collectDeposits = new HashMap<Integer,Integer>();

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		InterfaceProgram customer1 = new InterfaceProgram("John Kenedy","9025184323");
		System.out.println("Customer1 Details\n"+customer1.customerAccountNumber+"\n"+customer1.customerNameString+"\n"+customer1.phoneNo);

		//customer1 deposits amount to his account 
		customer1.depositAmount(customer1.customerAccountNumber, 10000);
		System.out.println("Available Balance for customer "+customer1.customerAccountNumber+"\n"+collectDeposits.get(customer1.customerAccountNumber));

		customer1.withdrawAmount(customer1.customerAccountNumber, 5000);
		System.out.println("Available Balance for customer "+customer1.customerAccountNumber+"\n"+collectDeposits.get(customer1.customerAccountNumber));

		customer1.getLoan(customer1.customerAccountNumber, collectDeposits.get(customer1.customerAccountNumber));
	}

	public InterfaceProgram(String customerName,String phNo) {
		customerAccountNumber = accountNumber++;
		customerNameString = customerName;
		phoneNo = phNo;
	}

	@Override
	public void withdrawAmount(int customerId,int amount)
	{
		if(collectDeposits.containsKey(customerId)) {
			int availableBalance = collectDeposits.get(customerId);
			if((availableBalance-amount)>0)
			{
				collectDeposits.put(customerId, availableBalance-amount);
				System.out.println("Withdrawn from customer "+customerId+" account Rs "+amount);
			}
			else {
				System.out.println("Not possible to withdraw Rs "+ amount +" as available balance is only Rs "+availableBalance);
			}
		}
		else {
			System.out.println("No account available");
		}

	}

	@Override
	public void depositAmount(int customerId,int amount) {
		if(collectDeposits.containsKey(customerId)) {
			int availableBalance = collectDeposits.get(customerId);
			collectDeposits.put(customerId, availableBalance+amount);
		}
		else {
			collectDeposits.put(customerId, amount);
		}
		System.out.println("Deposited in customer "+customerId+" account Rs "+amount);
	}

	@Override
	public void getLoan(int accountNo, int accountBalance) {
		if(accountBalance>=5000) {
			System.out.println("For customer "+accountNo+" loan is approved");
		}
		else {
			System.out.println("For customer "+accountNo+" loan is not eligible");
		}
	}
}

interface AccountManagement{
	public void depositAmount(int customerId,int amount);
	public void withdrawAmount(int customerId,int amount);
}

interface LoanMangement{
	public void getLoan(int accountNo, int accountBalance);
}