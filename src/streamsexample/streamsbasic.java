package streamsexample;

import java.util.ArrayList;
import java.util.Arrays;

public class streamsbasic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		int arr[]= {1,5,7,8,9,10,12};
		
//		int[] a= Arrays.stream(arr).filter(s-> s>=7).toArray();
//		Arrays.stream(a).forEach(s->System.out.println(s));
		Arrays.stream(arr).filter(s-> s>=7).forEach(s->System.out.println(s));
		 ArrayList<String> fruits = new ArrayList<>();
		 // List<String> fruits1= Arrays.asList("Apple","Banana","Orange");
		  //fruits1.
		//  fruits.
		  
		  
			        // Adding elements
		  fruits.add("Orange");
			        fruits.add("Apple");
			        fruits.add("Banana");
			      
			        
			        fruits.stream().sorted().forEach(s->System.out.println(s));
			        
			        fruits.stream().filter(s->s.length()>5).forEach(s->System.out.println(s));
		
		
	
	}

}
