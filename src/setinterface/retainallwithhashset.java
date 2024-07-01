package setinterface;

import java.util.HashSet;

public class retainallwithhashset {
	public static void main(String[] args) {
        // Creating a HashSet
        HashSet<String> hashSet1 = new HashSet<>();
        hashSet1.add("orange");
        hashSet1.add("apple");
        hashSet1.add("banana");
       

        // Creating another HashSet
        HashSet<String> hashSet2 = new HashSet<>();
        hashSet2.add("banana");
        hashSet2.add("grape");
        hashSet2.add("kiwi");
     //   HashSet<String> copyOfHashSet1 = new HashSet<>(hashSet1);
        
        HashSet<String> copyOfHashSet1 = new HashSet<>();
        copyOfHashSet1.addAll(copyOfHashSet1);
        // Retaining elements in hashSet1 that are also present in hashSet2
        copyOfHashSet1.retainAll(hashSet2);

        // Displaying the elements of hashSet1 after retaining
        System.out.println("Elements retained in HashSet:");
        for (String element : hashSet1) {
          //  System.out.println(element);
        
        }
        
        System.out.println(hashSet1);
        System.out.println(hashSet2);
    }
}
