package coding.challenge.hundreddays;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

public class D93_SortHashMapByValue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		HashMap<String, Integer> hashMap = new HashMap<String, Integer>();
		hashMap.put("Keerthana", 25);
		hashMap.put("Vamika", 2);
		hashMap.put("Arya", 21);
		hashMap.put("Alan", 14);
		
		List<Map.Entry<String, Integer>> list = new ArrayList<Map.Entry<String, Integer>>(hashMap.entrySet());
		
		
		Collections.sort(list, new Comparator<Map.Entry<String, Integer>>() {
			
			@Override
			public int compare(Map.Entry<String, Integer> o1, Map.Entry<String, Integer> o2) {
				// TODO Auto-generated method stub
				return o1.getValue().compareTo(o2.getValue());
			}
		});
		
		Map<String, Integer> sortedMap = new HashMap<String, Integer>();
		
		for(Map.Entry<String,Integer> entry : list) {
			
			sortedMap.put(entry.getKey(),entry.getValue());
		}
		
		
		System.out.println(sortedMap);
	}

}
