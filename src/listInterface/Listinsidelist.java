package listInterface;
import java.util.*;
public class Listinsidelist {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
		   ArrayList<ArrayList<Integer>> listOfLists = new ArrayList<>();

	        // Creating some ArrayLists to store integers
	        ArrayList<Integer> list1 = new ArrayList<>();
	        list1.add(1);
	        list1.add(2);
	        list1.add(3);

	        ArrayList<Integer> list2 = new ArrayList<>();
	        list2.add(4);
	        list2.add(5);

	        // Adding ArrayLists to the listOfLists
	        listOfLists.add(list1);
	        listOfLists.add(list2);

	        // Accessing elements from the listOfLists
//	        System.out.println("Element at index 0 of listOfLists: " + listOfLists.get(0));
//	        System.out.println("Element at index 1 of listOfLists: " + listOfLists.get(1));
//
//	        // Accessing elements from list1 (which is inside listOfLists at index 0)
//	        System.out.println("Element at index 0 of list1: " + listOfLists.get(0).get(0));
//	        System.out.println("Element at index 1 of list1: " + listOfLists.get(0).get(1));
	        generate(3);
	        
	}
	    public static List<List<Integer>> generate(int numRows) {
	        List<List<Integer>> l=new ArrayList<>();
	   
	        List<Integer> sub=new ArrayList<>();
	        List<Integer> sub1=new ArrayList<>();
	       
           sub.add(1);
           sub1.addAll(sub);
	       l.add(new ArrayList<>(sub));
	       
	           System.out.println("sub list is"+ sub);	       
	           System.out.println("main list of Arraylist is"+ l);
	           sub.clear();
	          sub.add(3);
	          sub.add(2);
	          sub1.addAll(sub);
		       l.add(new ArrayList<>(sub));
		     
		           System.out.println("sub list is"+ sub);
		          System.out.println("main list is"+ l);
		          System.out.println("storing list is"+ sub1);
		          System.out.println("storing list is"+ l.get(1).get(1));
		          sub.clear();
	        for(int i=0;i<numRows;i++)
	        {	 List<Integer> l1=new ArrayList<>();
	        	for(int j=0;j<i;j++)
	        	{
	         int k=i+1;
	       
	         
	           int firstelement=l.get(i-1).get(i+j);
	          j++;
	           int secondelement=l.get(i-1).get(i+j);
	           int sum=firstelement+secondelement;
	           l1.add(sum);
                
	        }
	        
	         l1.add(1);
	         l.add(l1);
	        
	        }
	            
	    
	        return l;



	    }
	}