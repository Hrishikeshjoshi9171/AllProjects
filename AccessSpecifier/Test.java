package AccessSpecifier;

public class Test {

	public static void main(String[] args) { //JVM stores this part in Stack

	}
	public void demo() {//Method Declaration //This is stored by JVM in Heap Memory 
		System.out.println("Non-Static method"); //Method Definition //This is stored by JVM in Method Area
	}
	public static void demo2() {//Method Declaration //This is Stored by JVM in Stack Pool Area
		System.out.println("Static Method"); //Method Definition //This is stored by JVM in Method Area
	}

}