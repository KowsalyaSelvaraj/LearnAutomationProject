package com.java.assignment;

import java.util.HashMap;

public class StaticUsageProgram {
	public static int accountNumber=1;

	public String customerNameString;
	public String phoneNo;
	int customerAccountNumber;
	public static HashMap<Integer, Integer> collectDeposits = new HashMap<Integer,Integer>();

	public static void main(String[] args) {		
		StaticUsageProgram customer1 = new StaticUsageProgram("John Kenedy","9025184323");
		System.out.println("Customer1 Details\n"+customer1.customerAccountNumber+"\n"+customer1.customerNameString+"\n"+customer1.phoneNo);

		//customer1 deposits amount to his account 
		depositAmount(customer1.customerAccountNumber, 2000);
		System.out.println("Available Balance for customer "+customer1.customerAccountNumber+"\n"+collectDeposits.get(customer1.customerAccountNumber));

		depositAmount(customer1.customerAccountNumber, 1000);
		System.out.println("Available Balance for customer "+customer1.customerAccountNumber+"\n"+collectDeposits.get(customer1.customerAccountNumber));

		withdrawAmount(customer1.customerAccountNumber, 5000);
		System.out.println("Available Balance for customer "+customer1.customerAccountNumber+"\n"+collectDeposits.get(customer1.customerAccountNumber));

	}

	public StaticUsageProgram(String customerName,String phNo) {
		customerAccountNumber = accountNumber++;
		customerNameString = customerName;
		phoneNo = phNo;
	}

	static public void depositAmount(int customerId,int amount) {
		if(collectDeposits.containsKey(customerId)) {
			int availableBalance = collectDeposits.get(customerId);
			collectDeposits.put(customerId, availableBalance+amount);
			
		}
		else {
			collectDeposits.put(customerId, amount);
		}
		System.out.println("Deposited in customer "+customerId+" account Rs "+amount);
	}

	public static void withdrawAmount(int customerId,int amount)
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
}
