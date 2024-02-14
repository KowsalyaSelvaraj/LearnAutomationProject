package coding.challenge.hundreddays;

import java.util.HashMap;
import java.util.List;

public class D49_CheckIfElementsAreUnique {

	public static void main(String[] args) {
		
		//Java program to check if all elements in a List are unique.
		 List<Integer> list=List.of(5,10,15,15,20,25);
		 
		D49_CheckIfElementsAreUnique d49_CheckIfElementsAreUnique = new D49_CheckIfElementsAreUnique();
		boolean result	= d49_CheckIfElementsAreUnique.checkIfUnique(list);
		System.out.println("result is "+result);
	}

	public boolean checkIfUnique(List<Integer> list) {
		
		HashMap<Integer, Integer> hashMap = new HashMap<Integer, Integer>();
		
		for(Integer numInteger : list) {
			
			if(!hashMap.containsKey(numInteger)) {
				hashMap.put(numInteger, 1);
			}else {
				return false;
			}
		}
		
		
		return true;
	}

	

}
