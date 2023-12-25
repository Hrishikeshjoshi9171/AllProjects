package Collection;

import java.util.LinkedList;

public class LinkedList3 {

	public static void main(String[] args) {
		LinkedList LL=new LinkedList();
		
		LL.add("Dog");
		LL.add("Cat");
		LL.add("Dog");
		LL.add("Horse");
		System.out.println(LL);
		LL.add("Cat");
		System.out.println(LL);
		
		//AddFirst
		LL.addFirst("Tiger");
		System.out.println(LL);
		
		//LastIndex
		LL.addLast("Elephant");
		System.out.println(LL);
		
		//getFirst
		System.out.println(LL.getFirst());
		System.out.println(LL.getLast());

	}

}
