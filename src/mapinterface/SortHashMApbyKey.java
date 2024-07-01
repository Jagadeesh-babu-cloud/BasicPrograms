package mapinterface;

import java.util.HashMap;
import java.util.TreeMap;

public class SortHashMApbyKey {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		 HashMap<Integer, String> myMap = new HashMap<>();
	        
	        // Adding some key-value pairs
	        myMap.put(3, "Apple");
	        myMap.put(1, "Banana");
	        myMap.put(2, "Orange");
	        myMap.put(7, "Apple");
	        myMap.put(10, "Banana");
	        myMap.put(8, "Orange");
	      
	        
	        System.out.println(myMap); //even hashmap not follows, sometimes  it prints in ascending
//	        TreeMap<Integer, String> sortedmap = new TreeMap<>(myMap);
//	        
//	        System.out.println(sortedmap);
//	
	        }

}
