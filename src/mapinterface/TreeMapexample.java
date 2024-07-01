package mapinterface;

import java.util.TreeMap;

public class TreeMapexample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		  
		        // Creating a TreeMap with natural ordering (Integer keys)
		        TreeMap<Integer, String> treeMap = new TreeMap<>();
		        
		        // Adding key-value pairs to the TreeMap
		        treeMap.put(3, "Three");
		        treeMap.put(1, "One");
		        treeMap.put(2, "Two");
		        
		        System.out.println("TreeMap elements: " + treeMap);
		 }

	

}
