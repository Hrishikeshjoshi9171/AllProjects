package CollectionSet;

import java.util.HashSet;

public class HashSet2 {

	public static void main(String[] args) {
		HashSet<Integer>hs=new HashSet<Integer>();
		hs.add(2);
		hs.add(4);
		hs.add(6);
		
		System.out.println(hs);
		HashSet<Integer>hs1=new HashSet<Integer>();
		
		hs1.addAll(hs);
		System.out.println("New HashSet:"+hs1);
		
		//Remove all
		hs1.removeAll(hs);
		System.out.println(hs1);
		

	}

}
