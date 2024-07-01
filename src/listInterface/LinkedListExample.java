package listInterface;

import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListExample {
	public static void main(String[] args) {
        // Create a LinkedList of Strings
        LinkedList<String> linkedList = new LinkedList<>();

        
        //******
        

        // Replace an element at index 2
       // linkedList.set(2, "kiwi");
        
        // Adding elements to the LinkedList
        linkedList.add("Apple");
        linkedList.add("Banana");
        linkedList.add("Orange");
          
        Iterator itr=linkedList.iterator();
        
        // Printing the LinkedList
        System.out.println("LinkedList elements: " + linkedList);

        // Adding an element at the beginning
        linkedList.addFirst("Grape");

        // Adding an element at the end
        linkedList.addLast("Pineapple");

        // Printing the LinkedList after additions
        System.out.println("Updated LinkedList: " + linkedList);

        // Removing an element from the LinkedList
        linkedList.remove("Banana");
        linkedList.size();
        Collections.sort(linkedList);
        // Printing the LinkedList after removal
        System.out.println("LinkedList after removal: " + linkedList);
        Collections.sort(linkedList, Collections.reverseOrder());
        System.out.println("LinkedList after sortinh: " + linkedList);
        
        Comparator.comparing(String::length);
    }
}
