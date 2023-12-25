package CollectionQueue;

import java.util.PriorityQueue;

public class PriorityQueue1 {

	public static void main(String[] args) {
		//Insertion Order Preserved
		//Duplicate allowed 
		//Homogeneous type of data
		
		PriorityQueue PQ=new PriorityQueue();
		//Adding element--> 1.Add  2.Offer()
		PQ.add("A");
		PQ.add("B");
		PQ.add("F");
		PQ.add("D");
		PQ.add("Z");
		
		System.out.println(PQ);
		
//		System.out.println(PQ.add("A")); //same as add method, but adds only homogeneous data.
//		System.out.println(PQ);
		
		//Get Head element-->3.Element 4.Peek
//		System.out.println(PQ.element()); // If the queue is empty it will throw 'nosuchelement'l exception

//		System.out.println(PQ.peek()); // If empty it will return Null
		
		//5.Remove
//		System.out.println(PQ.remove());  // Head element is printed and then removed 
//		System.out.println(PQ);           // and if array is empty it will print NoSuchElement Exception
		
		//6.Poll
//		System.out.println(PQ.poll()); // Head element is printed and then removed 
//		System.out.println(PQ);        // and if array is empty it will print null output.
		
		//For each loop
		System.out.println("Reading element using for each loop:");
		for(Object obj:PQ) {
			System.out.println(obj);
		}
	}

}
