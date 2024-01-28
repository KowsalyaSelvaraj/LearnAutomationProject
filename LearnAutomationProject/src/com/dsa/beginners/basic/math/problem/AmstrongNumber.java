package com.dsa.beginners.basic.math.problem;

import java.rmi.Remote;

public class AmstrongNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		AmstrongNumber amstrongNumber = new AmstrongNumber();
		amstrongNumber.nativeApproach(171);
	}

	public void nativeApproach(int n) {
		
		int num = n;
		int rem = 0;
		int result = 0;
		while(num>0) {
			
			rem = num%10;
			result = result + (rem * rem * rem);
			num = num/10;
			
		}
		
		if(result==n) {
			System.out.println(n+" is an amstrong number");
		}else {
			System.out.println(n+" is not Amstrong number");
		}
		
	}

}
