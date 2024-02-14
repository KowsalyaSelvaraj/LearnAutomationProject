package coding.challenge.hundreddays;

import java.util.HashSet;
import java.util.Set;

public class D17_FindDuplicateElements {

	public static void main(String[] args) {
		
		int array[] = {2,1,45,54,31,19,31,54,45};
		
		D17_FindDuplicateElements d17_FindDuplicateElements = new D17_FindDuplicateElements();
		
		d17_FindDuplicateElements.optimizedApproach(array);

	}

	public void optimizedApproach(int[] array) {
		
		
		Set<Integer> distinctIntegers = new HashSet<Integer>();
		Set<Integer> duplicateIntegers = new HashSet<Integer>();
		
		for(int i=0;i<array.length;i++) {
			if(distinctIntegers.contains(array[i])) {
				
				distinctIntegers.remove(array[i]);
				duplicateIntegers.add(array[i]);
			}else {
				distinctIntegers.add(array[i]);
			}
		}
		
		System.out.println(duplicateIntegers);
		System.out.println(distinctIntegers);
	}

}
