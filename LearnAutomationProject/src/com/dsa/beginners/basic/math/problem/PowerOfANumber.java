package com.dsa.beginners.basic.math.problem;


public class PowerOfANumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		PowerOfANumber powerOfANumber = new PowerOfANumber();
		//		powerOfANumber.nativeApproach(5,5);
		//		long powerValue = powerOfANumber.usingRecursion(5,52);
		//		System.out.println(powerValue);

		//powerOfANumber.binaryOperator(13, 31);
		long result =	powerOfANumber.divideAndConquer(12, 21);
	System.out.println("Divide and conquer result "+result);
		powerOfANumber.binarySolution(12,21);
	}

	public void nativeApproach(int N, int R) {

		long number = 1;
		for(int i = 1;i <= R;i++) {

			number = number * N;

			if(number>1000000007){
				number = number % (1000000007);
			}
		}
		System.out.println(number);
	}


	public long usingRecursion(int N, int R) {

		if(N==0) {
			return 0;
		}else if(R==0){
			return 1;
		}

		return (N * usingRecursion(N, R-1))%(1000000007);
	}


	public void binaryOperator(int N,int R) {
		long result = 1;
		long finalResult = 1;
		while(R>0){

			if(R%2!=0){

				result = result * N;
				//System.out.println("NUmber of times 13 is "+N);

			}
			N = N * N;
			R = R>>1;

		}
		finalResult = result%1000000007;

		//	return (result)%(1000000007);
		//		System.out.println("Result from binary operator=> "+result/1000000007);
		//		System.out.println("result from binary "+result);
		//
		//		System.out.println(" exact result"+(long)(13*169*28561*815730721*1778525249));
		//		
		//		System.out.println(Math.pow(13, 31));
	}

	public long divideAndConquer(int N,int R) {

		long result = 1;
		long finalResult = 1;

		if(R==0) {
			return 1;
		}

		result = divideAndConquer(N, R/2);

		if(R%2==0) {

			finalResult = Math.abs(result) * Math.abs(result);
		}else {

			finalResult = Math.abs(result) * Math.abs(result) * N;
		}
		return finalResult%1000000007;

	}

	public void binarySolution(int N,int R) {

		double result = 1;
		long finalResult = 1;

		int num = R;
		double value = N;
		if(num<0) {
			num = -1*num;
		}

		while(num>0) {
			if(num%2==1) {
				result = result * value;
				num = num - 1;
				System.out.println("N inside if "+value);
				System.out.println("result inside if "+result);
				System.out.println("num inside if "+num);
			}else {
				value = value * value;
				num = num/2;
				System.out.println("N inside else "+value);
				System.out.println("num inside else "+num);
			}
		}
		finalResult = (long) (result%1000000007);
		 
		System.out.println(result);
		if(R<0) {
			result = (long)1/(long)result;
		}
		System.out.println(finalResult);

	}
}
