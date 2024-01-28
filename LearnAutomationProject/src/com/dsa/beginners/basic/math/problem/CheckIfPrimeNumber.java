package com.dsa.beginners.basic.math.problem;

public class CheckIfPrimeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		CheckIfPrimeNumber checkIfPrimeNumber = new CheckIfPrimeNumber();
		checkIfPrimeNumber.optimizedApproach(5);
		
	}

	public  void optimizedApproach(int N) {
		
		int count = 0;
		for(int i=1;i*i<=N;i++) {
			
			if(N%i==0) {
				if(i==(N/i)) {
					count = count +1;
				}else {
					count = count +2;
				}
			}
			
		}
		
		if(count==2) {
			System.out.println(N +" it is prime");
		}else {
			System.out.println(N +" it is not prime "+count);
		}
		
	}

}
