package CollectionSet;

import java.util.HashSet;

public class HashSet3 {

	public static void main(String[] args) {
		HashSet<Integer>hs=new HashSet<Integer>();
		hs.add(1);
		hs.add(2);
		hs.add(3);
		hs.add(4);
		hs.add(5);
		hs.add(6);
		System.out.println("HashSet-1:"+hs);
		
		HashSet<Integer>hs1=new HashSet<Integer>();
		hs1.add(4);
		hs1.add(5);
		hs1.add(7);
		System.out.println("HashSet-2:"+hs1);
		
		//Union-->Only unique element will be displayed
		hs.addAll(hs1);
		System.out.println("Union:"+hs);
		
		//Intersection-->Only common element will be displayed
		hs.retainAll(hs1);
		System.out.println("Common:"+hs);
		
		//Difference
		hs.removeAll(hs1);
		System.out.println(hs);
		
		//Subset
		System.out.println(hs.containsAll(hs1));

	}

}
