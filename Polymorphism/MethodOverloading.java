package Polymorphism;

public class MethodOverloading {
	/*Method Overloading-->When the method name is same with different argument or input parameter
	with different data within the same class is called as method Overloading.
	 */
	public void m1() {
		System.out.println("No argument method");
	}
	public void m1(int i) {
		System.out.println("int argument method");
	}
	public void m1(long j) {
		System.out.println("long argument method");
	}
	public void m1(double k) {
		System.out.println("double argument method");
	}

	public static void main(String[] args) {
		MethodOverloading mo=new MethodOverloading();
		mo.m1();
		mo.m1(10);
		mo.m1(145.879);
		mo.m1(566654345345l);

	}

}
