package Collection;

import java.util.Collections;
import java.util.LinkedList;

public class LinkedList2 {

	public static void main(String[] args) {
		LinkedList LL=new LinkedList();
		//Store only homogeneous data
		
		LL.add("A");
		LL.add("D");
		LL.add("C");
		LL.add("Z");
		LL.add("S");
		
		System.out.println("After Printing:"+LL);
		
		//Add all
		LinkedList LLnew=new LinkedList();
		LLnew.addAll(LL);
		System.out.println("After Adding All:"+LLnew);
		System.out.println();
		
		//RemoveAll
		LLnew.removeAll(LL);
		System.out.println("After Removing All:"+LLnew);
		System.out.println();
		
		//Sort-->Collections.sort()
		System.out.println("Before Sorting:"+LL);
		Collections.sort(LL);
		System.out.println("After Sorting:"+LL);
		System.out.println();
		
		//Reverse Order
		Collections.sort(LL,Collections.reverseOrder());
		System.out.println("After Reverse Order:"+LL);
		System.out.println();
		
		//Shuffling
		Collections.shuffle(LL);
		System.out.println("After Shuffling:"+LL);

	}

}
