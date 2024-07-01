package listInterface;

import java.util.ArrayList;
import java.util.HashSet;

public class CommonelemenyArrayList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		ArrayList<Integer> list1 = new ArrayList<>();
        list1.add(1);
        list1.add(2);
        list1.add(3);
        list1.add(4);
        list1.add(5);
        list1.add(5);
        
        
        ArrayList<Integer> list2 = new ArrayList<>();
        list2.add(3);
        list2.add(4);
        list2.add(5);
        list2.add(6);
        list2.add(7);
        list2.add(3);
        System.out.println("retainall"+ list1.retainAll(list2));
        System.out.println("yo" + list1);
        //HashSet<Integer> hs=new HashSet<>(list1);
      HashSet<Integer> hs2=new HashSet<>(list2);
        HashSet<Integer> hs3=new HashSet<>();
        for(Integer a : list1)
        {	
       if(list2.contains(a))
        {
        	hs3.add(a);
        }
        	
        	
        }
       
        
      //  System.out.println(hs3);
		
	//----------------using retainall	------------------------------------------------------------------

         //common elements wil come
        
        
        hs2.retainAll(list1);
        
        System.out.println(hs2);
        
	}

}
