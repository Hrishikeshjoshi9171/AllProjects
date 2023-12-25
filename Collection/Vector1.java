package Collection;

import java.util.Iterator;
import java.util.Vector;

public class Vector1 {

	public static void main(String[] args) {
		Vector<Integer> VC=new Vector<Integer>();
		VC.add(1);
		VC.add(3);
		VC.add(4);
		VC.add(5);
		VC.add(10);
		VC.add(14);
		VC.add(15);
		VC.add(13);
		VC.add(11);
		
		//Print Values
		System.out.println(VC);
		
		System.out.println(VC.size());
		System.out.println(VC.get(3));
		
		//Remove
		VC.remove(3);
		System.out.println(VC);
		
		VC.add(3,5);
		System.out.println(VC);
		
		//Update
		VC.set(3,50);
		System.out.println(VC);
		
		System.out.println("Reading element using for loop");
		for(int i=0;i<VC.size();i++) {
			System.out.println(VC.get(i));
		}
		System.out.println();
		
		System.out.println("Reading element using for each loop");
		for(Object obj:VC) {
			System.out.println(obj);
		}
		System.out.println();
		
		System.out.println("Reading element using Iterator");
		Iterator obj=VC.iterator();
		while(obj.hasNext()) { //If the next values is present it will give true value
			System.out.println(obj.next());
		}

	}

}
