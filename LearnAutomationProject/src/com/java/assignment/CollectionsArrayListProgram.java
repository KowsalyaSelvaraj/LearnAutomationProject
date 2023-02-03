package com.java.assignment;

import java.util.ArrayList;
import java.util.Scanner;

public class CollectionsArrayListProgram {
	static ArrayList<String> colorsList = new ArrayList<String>();
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// TODO Auto-generated method stub

		Scanner scanner = new Scanner(System.in);
		System.out.println("Lets Play COLORFULL Game\n---------------------\n-----------------\n\nChoose any one option ");
		System.out.println("\n1.Add a color\n2.Remove a color\n3.Check if a color is available\n4.Find Index of a color\n");
		int option = scanner.nextInt();
		String colorNameString;
		do {
			System.out.println("Enter the color name");
			Scanner scanner1 = new Scanner(System.in);
			colorNameString = scanner1.nextLine();
			performActions(colorNameString, option);
			System.out.println("\n1.1Add a color\n2.Remove a color\n3.Check if a color is available\n4.Find Index of a color\n5.Quit the game");
			option=scanner.nextInt();
		}while(option!=5);

		System.out.println("Your Color List is ==>> "+colorsList);
		System.out.println("Thanks for playing the game");
	}

	public static void performActions(String colorName,int action) {
		switch(action) {
		case 1:
			colorsList.add(colorName);
			break;

		case 2:
			colorsList.remove(colorName);
			break;

		case 3:
			boolean doesColorAvailable = colorsList.contains(colorName);
			if(doesColorAvailable)
			{
				System.out.println(colorName +" is available in the color List");
			}
			else {
				System.out.println(colorName +" is not available in the color list");
			}
			break;

		case 4: 
			int indexofColor = colorsList.indexOf(colorName);
			if(indexofColor>=0) {
			System.out.println("Index of the color is "+indexofColor);
			}
			else {
				System.out.println(colorName +" is not available in the color list");
			}
			break;
			
		default:
			break;
		}
	}
}

