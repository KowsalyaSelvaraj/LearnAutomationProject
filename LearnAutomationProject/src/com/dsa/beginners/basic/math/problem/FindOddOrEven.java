package com.dsa.beginners.basic.math.problem;


public class FindOddOrEven {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		FindOddOrEven findOddOrEven = new FindOddOrEven();
		findOddOrEven.nativeApproach();
		findOddOrEven.applyingBitwiseAND();
		findOddOrEven.applyingRightAndLeftShift();
	}



	public void nativeApproach() {
		int number = 16;

		if(number%2==0) {
			System.out.println(number+ " Even Number");
		}else {
			System.out.println(number+ " Odd Number");
		}
	
	}
	
	
	public void applyingBitwiseAND() {

		int number = 27;

		if((number&1)==0) {
			System.out.println(number +" Even Number");
		}else {
			System.out.println(number +" Odd Number");
		}
	}
	
	public void applyingRightAndLeftShift() {

		int number = 28;

		if(number == ((number>>1)<<1)) {
			System.out.println(number +" Even Number");
		}else {
			System.out.println(number +" Odd Number");
		}
	}

}
