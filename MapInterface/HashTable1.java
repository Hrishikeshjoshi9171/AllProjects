package MapInterface;

import java.util.Hashtable;

public class HashTable1 {

	public static void main(String[] args) {
		Hashtable ht=new Hashtable<>(); //default size-->11 & load factor-->0.75
		ht.put(1,"Sumit");
		ht.put(2,"John");
		ht.put(3,"Rahul");
		ht.put(4,"Rohit");
		
//		ht.put(null,"RRR"); //Hashtable does not allow null key
//		ht.put(5, null); //NullPointerException
//		System.out.println(ht.remove(3));
//		System.out.println(ht);
		
		System.out.println(ht.containsKey(3));
		System.out.println(ht.containsKey(6));
		
		System.out.println(ht.containsValue("Rahul"));
		System.out.println(ht.containsValue("RR"));
		
		System.out.println(ht.isEmpty());
		
		System.out.println(ht.keySet());
		System.out.println(ht.values());
		
		for(Object obj:ht.keySet()) {
			System.out.println(obj+" "+ht.get(obj));
		}
	}

}
