package com.java.assignment;

import java.util.ArrayList;
import java.util.Iterator;

public class ExceptionHandlingProgram {

	public static void main(String[] args) {
		ArrayList<Integer> numberArrayList = new ArrayList<>();
		// TODO Auto-generated method stub
		try {
			System.out.println("Exception Handling");			
			for(int i=0;i<=10;i++)
			{
				numberArrayList.add(i);
			}
			numberArrayList.get(25);
			
		} catch (Exception e) {
			System.out.println(e+" is the exception thrown");
		}
		System.out.println("\nList contains "+numberArrayList);
	}

}
