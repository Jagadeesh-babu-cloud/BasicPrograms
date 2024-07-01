package mapinterface;

import java.util.HashMap;

public class HashmapExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		  HashMap<Integer, String> myMap = new HashMap<>();
	        
	        // Adding some key-value pairs
	        myMap.put(1, "Apple");
	        myMap.put(2, "Banana");
	        myMap.put(3, "Orange");
	        
	        // Finding the size of the HashMap
	        int size = myMap.size();
	        HashMap<Integer, String> reversemyMap = new HashMap<>();
	        // Printing the size
	       // System.out.println("Size of HashMap: " + size); // Outputs: Size of HashMap: 3
	        for(int i=size-1;i>=0;i-- )
	        {
	        	
	        	reversemyMap.put(null,myMap.get(i));
	        	
	        }
	        
	       

	}

}
