package com.dsa.beginners.basic.math.problem;

import java.awt.geom.AffineTransform;

public class FindSqrtOfNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		FindSqrtOfNumber findSqrtOfNumber = new FindSqrtOfNumber();
		findSqrtOfNumber.nativeApproach(1569872);

		long binarySearchResult = findSqrtOfNumber.binarySearchAlgorithm(5);
		System.out.println(binarySearchResult+" result from binary search algorithm");
	}

	public void nativeApproach(long x) {
		int count = 0;
		
		if(x==0 || x==1)
	        System.out.println(x);
		
		for(long i=1;i<=x/2;i++) {
			count = count +1;
			if(i*i==x) {
				System.out.println("Square root is "+i);
				break;
			}else if(i*i<x && x<(i+1)*(i+1)){
				System.out.println("Near square root is "+i);
				break;
			}
		}
		System.out.println(count+" number of times loop executed native");
	}

	public long binarySearchAlgorithm(long x) {

		long mid =0;
		long start =0;
		long end = x/2;
		long ans = 0;
		int count =0;
		
		if(x==0 || x==1)
	        return x;
		
		while(start<=end) {
			count = count+1;
			mid = (start + end)/2;

			if(mid*mid==x) {
				System.out.println(count+" number of times loop executed");
				return mid;
			}else if(mid*mid<x) {
				start = mid + 1;
				ans = mid;
			}else {
				end = mid - 1;
			}
		}
		System.out.println(count+" number of times loop executed");
		return ans;
	}

}
