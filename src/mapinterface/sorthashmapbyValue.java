package mapinterface;

import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class sorthashmapbyValue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		

		 HashMap<Integer, String> myMap = new HashMap<>();
		 HashMap<String, Integer> reverseMap = new HashMap<>();
	        // Adding some key-value pairs
	        myMap.put(3, "Apple");
	        myMap.put(1, "Banana");
	        myMap.put(2, "Orange");
	        myMap.put(7, "Apple");
	        myMap.put(10, "Banana");
	        myMap.put(8, "Orange");
	        int count=0;
	        System.out.println(myMap);
	        for(Map.Entry<Integer,String> entry : myMap.entrySet())
	        {
	        	//System.out.println(count);
	        	reverseMap.put(entry.getValue(), entry.getKey());
	        	System.out.println(entry.getValue() +  entry.getKey());
	        	count++;
	        }
	        
	        System.out.println(reverseMap);
	        TreeMap<String, Integer> tm = new TreeMap<>(reverseMap);
	        System.out.println(tm);
	        
	        
	}

}
