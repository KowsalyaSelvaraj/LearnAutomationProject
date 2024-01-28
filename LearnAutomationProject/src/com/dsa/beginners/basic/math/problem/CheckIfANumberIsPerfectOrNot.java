package com.dsa.beginners.basic.math.problem;

public class CheckIfANumberIsPerfectOrNot {

	//	Given a number N, check if a number is perfect or not. 
	//	A number is said to be perfect if sum of all its factors excluding the number itself is equal to the number.
	//	Return 1 if the number is Perfect otherwise return 0.

	//	input:
	//		N = 6
	//		Output:
	//		1 
	//		Explanation:
	//		Factors of 6 are 1, 2, 3 and 6.
	//		Excluding 6 their sum is 6 which
	//		is equal to N itself. So, it's a
	//		Perfect Number.
	public static void main(String[] args) {

		CheckIfANumberIsPerfectOrNot checkIfANumberIsPerfectOrNot = new CheckIfANumberIsPerfectOrNot();

		int isPerfect =	checkIfANumberIsPerfectOrNot.optimizedApproach(6);

		System.out.println(isPerfect+" is the result");
	}

	public int optimizedApproach(long N) {

		long sum=0;
		for(long i =1;i*i<N;i++) {

			if(N%i==0) {

				if(i==N/i) {
					sum = sum +i;
				}else if((N/i)==N){
					sum = sum + i;
				}else {
					sum = sum + i + N/i;
				}
			}
		}

		//	System.out.println(sum);

		if(sum==N) {
			return 1;
		}else {
			return 0;
		}

	}

}
