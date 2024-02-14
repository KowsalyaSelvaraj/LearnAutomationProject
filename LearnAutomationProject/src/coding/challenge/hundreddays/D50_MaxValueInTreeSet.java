package coding.challenge.hundreddays;

import java.util.Collections;
import java.util.TreeSet;

public class D50_MaxValueInTreeSet {

	//	 Java program to find the maximum value in a TreeSet.
	//
	//	 📌 The last() method is used to return the last of the element of a TreeSet. 
	//	 📌 The last element here is being referred to the highest of the elements in the set. 
	//	 📌 If the elements are of integer types, then the largest integer is returned. 
	//	 If the elements are of the string types, then the elements are checked in the 
	//	 alphabetical order and the string starting with the last alphabets in the order of
	//	 dictionary is returned irrespective of length.

	public static void main(String[] args) {

		TreeSet<Integer> numbers=new TreeSet<Integer>(Collections.reverseOrder());
		numbers.add(5);
		numbers.add(12);
		numbers.add(21);
		numbers.add(2);
		System.out.println(numbers);

		TreeSet<Integer> numbers1=new TreeSet<Integer>();
		numbers1.add(5);
		numbers1.add(12);
		numbers1.add(21);
		numbers1.add(2);
		System.out.println(numbers1.last());


	}

}
