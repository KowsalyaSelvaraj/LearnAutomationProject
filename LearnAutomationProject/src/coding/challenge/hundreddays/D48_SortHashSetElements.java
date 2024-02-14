package coding.challenge.hundreddays;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;

public class D48_SortHashSetElements {
//	How to sort HashSet in Java.
//
//	The elements of the HashSet can be sorted indirectly by converting 
//	into List or TreeSet, but this will keep the elements in the target type instead of HashSet type.
	public static void main(String[] args) {
		 HashSet<Integer> set=new HashSet<>();
		 set.add(51);
		 set.add(7);
		 set.add(15);
		 set.add(24);
		 set.add(58);
		D48_SortHashSetElements d48_SortHashSetElements = new D48_SortHashSetElements();
		d48_SortHashSetElements.sortHashSet(set);
		

	}

	public void sortHashSet(HashSet<Integer> set) {
		
		List<Integer> list = new ArrayList<Integer>(set);
		
		Collections.sort(list);
		
		System.out.println(list);
		
	}

}
