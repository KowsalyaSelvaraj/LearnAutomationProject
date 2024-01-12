package com.java.practise.programs;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class D52_RegularExpression {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String patternString = "^[A-Za-z0-9]+@+[a-z]+(.+)$";
		Pattern pattern = Pattern.compile(patternString);
		
		String emailString = "kowsi@gmail.com";
		Matcher matcher = pattern.matcher(emailString);
		
		if(matcher.matches()) {
			System.out.println("email matches");
		}else {
			System.out.println("Not a valid email");
		}
		
	}

}
