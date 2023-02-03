package com.java.assignment;


public class SingletonProgram {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SingletonClass singletonclassObj1 = SingletonClass.getInstance();
		SingletonClass singletonclassObj2 = SingletonClass.getInstance();
		
		System.out.println(singletonclassObj1.string);
		System.out.println(singletonclassObj2.string);
		
		System.out.println("\nModifying the variable with object 1");
		singletonclassObj1.string=singletonclassObj1.string+" Changing in obj1";
		System.out.println("Checking the value of the string in obj2 =>"+singletonclassObj2.string);
	}

}

class SingletonClass{
	
	private static SingletonClass singletonObject = new SingletonClass();
	public String string;
	
	private SingletonClass(){
		System.out.println("Object created for SingletonClass");
		string = "this variable is common for all instance";
	}
	
	public static SingletonClass getInstance() {
		System.out.println("Object get Instance ");
		return singletonObject;
	}
}


