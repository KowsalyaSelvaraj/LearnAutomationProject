package com.dsa.beginners.basic.math.problem;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class PrintAllDivisorsOfNumber {

	public static void main(String[] args) {
		
		PrintAllDivisorsOfNumber printAllDivisorsOfNumber = new PrintAllDivisorsOfNumber();
		
		printAllDivisorsOfNumber.nativeApproach(25);
		
		printAllDivisorsOfNumber.optimizedApproach(25);

	}

	public void nativeApproach(int n) {
		
		List<Integer> divisors = new ArrayList<Integer>();
		for(int i=1;i<=n;i++) {
			
			if(n%i==0) {
				divisors.add(i);
			}
			
		}
		
		System.out.println(divisors);
		
	}
	
	public void optimizedApproach(int n) {
		
		List<Integer> divisors = new ArrayList<Integer>();
		int loopCount =0;
		for(int i=1;i*i<=n;i++) {
			loopCount+=1;
			if(n%i==0 && i==n/i) {
				divisors.add(i);
			}else if(n%i==0) {
				divisors.add(i);
				divisors.add(n/i);
			}
		}
		
		Collections.sort(divisors);
		System.out.println(loopCount+" => "+divisors);
	}

}
