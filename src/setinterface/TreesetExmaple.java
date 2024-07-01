package setinterface;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.TreeSet;

public class TreesetExmaple {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Integer arr[]= {2,5,7,8,2,10,99,3,1};
		//LinkedList <Integer> l=new LinkedList<>(Arrays.asList(arr));
		
		 
		
		
		
		TreeSet<Integer> ts=new TreeSet<>(Arrays.asList(arr));
		
		System.out.println(ts);
		System.out.println(ts.first());
		System.out.println(ts.last());
		
		 Integer highest = ts.last();

	        // Step 2: Get the second highest element
	        Integer secondHighest = ts.lower(highest);
	        System.out.println("Second secondHighest: " + secondHighest);
	     // Step 1: Get the lowest element (first element in sorted order)
	        Integer lowest = ts.first();

	        // Step 2: Get the second lowest element
	        Integer secondLowest = ts.higher(lowest);
	        System.out.println("Second lowest element: " + secondLowest);
	}

}
