package Polymorphism;

public class MainMethodOverload {

	public static void main(String[] args) {
		MainMethodOverload mm=new MainMethodOverload();
		mm.m1();
		mm.m2();
	}
	/* Even if we create 2 main method with different parameter, JVM will only print the main method
	which contains '(String[] args)' in it.
	*/
	public static void main(int[]args) { 
		MainMethodOverload mn=new MainMethodOverload();
		mn.m1();
		mn.m2(); //This will not be printed as it does not contain "(String[] args)" in it.
	}
	public void m1() {
		System.out.println("M1 method");
	}
	public void m2() {
		System.out.println("M2 method");
	}

}
