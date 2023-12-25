package MainMethod;

public class Overload {

	public static void main(String[] args) {
		System.out.println("Main String[]args");
	}
	public static void main(int []args) {
		System.out.println("Main int[]args");
	}
//	1]Overloading of the main method is possible, but JVM will always call "String[]args"
//    argument in main method only.
//  2]Inheritance concept applicable for main method hence while executing child class, if
//	  the child class doesn't contain main method then parent class main method will be executed.
//	3]Can we override main method? --->>No
}
