package com.java.assignment;

public class SynchronisatonExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		StringBuilder buffer = new StringBuilder("I am Good to go");

		for(int i=0;i<buffer.length();i++) {
			buffer.charAt(i);
			
		}
		buffer.append(" to lobby");
		System.out.println(buffer);


		StringBuffer buffer1 = new StringBuffer("I am Good to go");

		for(int i=0;i<buffer.length();i++) {
			buffer.charAt(i);
			buffer.append(" to lobby");
		}

		System.out.println(buffer); 
	}

}
