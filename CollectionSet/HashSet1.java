package CollectionSet;

import java.util.HashSet;
import java.util.Iterator;

public class HashSet1 {

	public static void main(String[] args) {
		HashSet hs=new HashSet();
		//Default capacity=16 and load factor=0.75
		//HashSet hs1=new HashSet(100,(float) 0.90);
		//HashSet<Integer>Hs1=new HashSet<Integer>();
		hs.add(100);
		hs.add("Welcome");
		hs.add(15.5);
//		hs.add('A');
		hs.add(true);
		hs.add(false);
		hs.add(20);
		hs.add("Java");
		hs.add(null);
		
		System.out.println(hs.add('A'));
		//If we are trying to add duplicate element then it will give false value
		System.out.println(hs);
		
		//Remove
		hs.remove("Java");
		System.out.println(hs);
		
		//We don't have set method in HashSet
		
		//Contains
		System.out.println(hs.contains("Welcome"));
		System.out.println(hs.contains("Welcom"));
		
		//isempty
		System.out.println(hs.isEmpty());
		
		//Reading element/object from HashSet
		System.out.println();
		
		for(Object obj:hs) {
			System.out.println(obj);
		}
		
		//Iterator
		Iterator it=hs.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}

	}

}
