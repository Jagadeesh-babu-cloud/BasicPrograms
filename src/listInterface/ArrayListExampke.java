package listInterface;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class ArrayListExampke {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		 ArrayList<String> fruits = new ArrayList<>();
 // List<String> fruits1= Arrays.asList("Apple","Banana","Orange");
  //fruits1.
//  fruits.
  
  
	        // Adding elements
	        fruits.add("Watermelon");
	        fruits.add("Banana");
	        fruits.add("Orange");
	        fruits.add("Mango");
 Collections.sort(fruits);
 
 
// Iterator itr=fruits.iterator();
// itr.has
	        // Accessing elements
	        System.out.println("First fruit: " + fruits.get(0));
	        //printing directly
	        System.out.println("printing directly: " + fruits);

	        // Iterating through ArrayList
	        System.out.println("All fruits:");
	        for (String fruit : fruits) {
	            System.out.println(fruit);
	        }

	        // Removing element
	        fruits.remove("Banana");
	        
	        
	        // Size of ArrayList
	        System.out.println("Size of ArrayList: " + fruits.size());

	        // Checking if ArrayList is empty
	        System.out.println("Is ArrayList empty? " + fruits.isEmpty());
	    }

}
