package Collection;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayList1 {

	public static void main(String[] args) {
		int a[]= new int[5];  //Static Array + Similar data type
		
		ArrayList AL= new ArrayList(); //Dynamic Array + Heterogeneous data type
		
		AL.add(100); //int
		AL.add("Welcome");  //String
		AL.add(15.5);  //double
		AL.add('A');
		AL.add(true);
		AL.add(100);
		AL.add(null);
		
		//1.Print Array
		System.out.println(AL);
		
		//2.Size
		System.out.println("Number of element in given array:"+AL.size());
		AL.add(333);
		
		//3.Remove
		AL.remove(2);
		System.out.println(AL);
		AL.remove(15.5);
		System.out.println(AL);
		
		//4.Insert new element
		AL.add(2,15.5);
		System.out.println(AL);
		AL.add(3,"Python");
		System.out.println(AL);
		
		//5.Retrive Specific element
		System.out.println(AL.get(3));
		System.out.println(AL.get(5));
		
		//6.Change element/Replace
		AL.set(3,"Ruby");
		System.out.println(AL);
		
		AL.set(3,"Python");
		System.out.println(AL);
		
		//7.Contains-->Search element //True & False
		System.out.println(AL.contains("Python"));
		System.out.println(AL.contains("Ruby"));
		
		//8.isempty
		System.out.println(AL.isEmpty()); //False
		System.out.println();
		
		//Read/Print the data from ArrayList
		System.out.println("Reading element using for loop");
		for(int i=0;i<AL.size();i++) {
			System.out.println(AL.get(i));
		}
		System.out.println("Reading element using for Each loop");
		for(Object obj:AL) {
			System.out.println(obj);
		}
		//Iterator
		System.out.println("Reading Element using Iterator");
		Iterator it=AL.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}

	}

}
