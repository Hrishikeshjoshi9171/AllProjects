package CollectionSet;

import java.util.LinkedHashSet;

public class LinkedHashSet1 {

	public static void main(String[] args) {
		
		//Same methods are implemented which are present HashSet
		//Duplicate element are not allowed
		//Insertion order is preserved
		//Initial size-->16 & Load factor-->0.75
		
		LinkedHashSet<Integer>LHS=new LinkedHashSet<Integer>();
		LinkedHashSet LHS1=new LinkedHashSet<>();
		
		LHS.add(200);
		LHS.add(300);
		LHS.add(400);
		LHS.add(500);
		LHS.add(600);
		LHS.add(700);
		
		System.out.println(LHS.add(600));
		System.out.println(LHS);

	}

}
