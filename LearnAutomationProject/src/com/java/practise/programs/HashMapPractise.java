package com.java.practise.programs;

import java.util.HashMap;

public class HashMapPractise {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<String, HashMap<String, HashMap<String, String>>> sheetMap = new HashMap<String, HashMap<String, HashMap<String, String>>>();

		HashMap<String, String> hashmapSSHashMap = new HashMap<String, String>();

		hashmapSSHashMap.put("Jan", "Pongal"); // get(0)
		hashmapSSHashMap.put("Feb", "Valetines day"); //get(1)

		HashMap<String, HashMap<String,String>>  hmStringHashMap = new HashMap<String, HashMap<String,String>>(); 

		hmStringHashMap.put("March", hashmapSSHashMap);

		System.out.println(hmStringHashMap.get("March").get("Jan"));
		System.out.println(hmStringHashMap.get("March").get("Feb"));

		sheetMap.put("April", hmStringHashMap);
		
		System.out.println(sheetMap.get("April").get("March").get("Jan"));
		System.out.println(sheetMap.get("April").get("March").get("Feb"));
		
	}

}
