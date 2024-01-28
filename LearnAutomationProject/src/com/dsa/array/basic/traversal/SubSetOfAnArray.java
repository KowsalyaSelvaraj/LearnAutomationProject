package com.dsa.array.basic.traversal;

import java.util.Arrays;
import java.util.HashMap;

import com.dsa.beginners.basic.math.problem.CountDigits;

public class SubSetOfAnArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SubSetOfAnArray  subSetOfAnArray = new SubSetOfAnArray();
		long	a1[] = {11, 7, 1, 13, 21, 3, 7, 3};
		long	a2[] = {11, 3, 7, 1, 7};
		
		long	a3[] = {1,2,3,4,5,6,7,8};
		long	a4[] = {1,2,3,1};
		String isSubSetString =	subSetOfAnArray.isSubset(a3, a4, a3.length, a4.length);
		System.out.println(isSubSetString);
		String isSubSetStringOptimizedString =	subSetOfAnArray.optimizedApproach(a3, a4, a3.length, a4.length);
		System.out.println(isSubSetStringOptimizedString);

	}

	public String isSubset( long a1[], long a2[], long n, long m) {

		int flag=0;
		int num=0;
		for(int i=0;i<m;i++) {
			flag=0;
			num++;
			for(int j=0;j<n;j++) {
				num++;
				if(a2[i]==a1[j]) {
					flag=1;
					break;
				}
			}
			if(flag==0) {
				return "No";
			}
		}
		System.out.println(num);
		return "Yes";


	}
	
	public String optimizedApproach( long a1[], long a2[], long n, long m) {

		HashMap<Long, Integer> hashMap = new HashMap<Long, Integer>();
		int count =0;
		for(int i=0;i<n;i++) {
			hashMap.put(a1[i],hashMap.getOrDefault(a1[i], 0)+1);
		}
		
		for(int i=0;i<m;i++) {
			
			if(!hashMap.containsKey(a2[i])) {
				return "No";
			}
			
			if(hashMap.get(a2[i])==0) {
				return "No";
			}
			
			count  = hashMap.get(a2[i]);
			count--;
			hashMap.put(a2[i], count);
			
			
		}
		return "Yes";
 

	}
}
