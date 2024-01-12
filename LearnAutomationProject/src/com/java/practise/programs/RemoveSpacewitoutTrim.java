package com.java.practise.programs;

import java.util.Iterator;

public class RemoveSpacewitoutTrim {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		String spaceString = " Hello World!! ";
		
		for(int i=0;i<spaceString.length();i++) {
			
			if(Character.isWhitespace(spaceString.charAt(i))){
				System.out.println("hello"+spaceString.charAt(i)+"peope");
			}
		}
	}

}
