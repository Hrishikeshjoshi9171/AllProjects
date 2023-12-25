package MapInterface;

import java.util.HashMap;

public class HashMap1 {

	public static void main(String[] args) {
		HashMap<Integer,String>HM=new HashMap<Integer,String>();
		HM.put(101,"Rahul");
		HM.put(102,"Rohit");
//		HM.put(101,"David");
//		HM.put(102,"David");
		HM.put(103,"John");
		HM.put(104,"Pawan");
		HM.put(105,"David");
		HM.put(null,"RR");
		
		System.out.println(HM);
		
		System.out.println(HM.get(103)); //It will return value
		
//		HM.remove(103);
//		System.out.println(HM);
		
		System.out.println(HM.containsKey(107));
		System.out.println(HM.containsKey(101));
		
		System.out.println(HM.containsValue("Pawan"));
		System.out.println(HM.containsValue("RR"));
		
		System.out.println(HM.keySet());
		System.out.println(HM.values());
		
		System.out.println(HM.entrySet());
		
		for(Object obj1:HM.values()) {
			System.out.println(obj1);
		}
		for(Object obj2:HM.entrySet()) {
			System.out.println(obj2);
		}
		for(Object obj3:HM.keySet()) {
			System.out.println(obj3+" "+HM.get(obj3));
		}
	}
}
