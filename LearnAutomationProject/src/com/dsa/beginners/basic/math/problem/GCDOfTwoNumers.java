package com.dsa.beginners.basic.math.problem;

public class GCDOfTwoNumers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		GCDOfTwoNumers gcdOfTwoNumers = new GCDOfTwoNumers();
		gcdOfTwoNumers.nativeApproach(98,56);

		int solutionGCD = gcdOfTwoNumers.optimizedApproach(37,29);
		System.out.println(solutionGCD+" sol from optimized approach");
	}

	public  void nativeApproach(int a,int b) {

		int num = a;
		int result=0;
		if(a<b) {
			num = a;
		}else {
			num = b;
		}

		while(num>0) {

			if(a%num ==0 && b%num ==0) {
				break;
			}

			num --;
		}

		System.out.println(num);
	}

	public  int optimizedApproach(int A,int B) {

		while (A>0 && B>0) {

			if(A>B) {
				A = A%B;
			}else {
				B = B % A;
			}			
		}

		if(A==0) {
			return B;
		}else {
			return A;
		}


	}

}
