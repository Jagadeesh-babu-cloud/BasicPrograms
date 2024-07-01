package listInterface;

import java.util.ArrayList;
import java.util.HashSet;

public class DuplicateremoveArraylist {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		ArrayList<Integer> listWithDuplicates = new ArrayList<>();
        listWithDuplicates.add(1);
        listWithDuplicates.add(2);
        listWithDuplicates.add(3);
        listWithDuplicates.add(2);
        listWithDuplicates.add(4);
        listWithDuplicates.add(5);
        listWithDuplicates.add(3);
        
        HashSet<Integer> hs=new HashSet<>(listWithDuplicates);
        System.out.println(hs);
		
	}

}
