package coding.challenge.hundreddays;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class D20_RemoveDuplicatesFromArrayList {

	public static void main(String[] args) {
			
		ArrayList<Integer> arrayList = new ArrayList<Integer>();
		for(int i=0;i<15;i++) {
			arrayList.add(i);
			arrayList.add(i+2);
		}
		D20_RemoveDuplicatesFromArrayList d20_RemoveDuplicatesFromArrayList = new D20_RemoveDuplicatesFromArrayList();
		
		d20_RemoveDuplicatesFromArrayList.removeDuplicate(arrayList);
	}

	public void removeDuplicate(ArrayList<Integer> arrayList) {
		
		System.out.println("Array List "+arrayList);
		Set<Integer> set = new HashSet<Integer>(arrayList);
		
		System.out.println("remove duplicates "+set);
		
	}

}
