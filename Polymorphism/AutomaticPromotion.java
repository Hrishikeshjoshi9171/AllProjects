package Polymorphism;

public class AutomaticPromotion {
	
/*Automatic Promotion-->> The name Type Promotion specifies that a small size datatype can be
promoted to a large size datatype.i.e., an Integer data type can be promoted to long, float, double,etc.
This Automatic Type Promotion is done when any method which accepts a higher size data type argument
is called with the smaller data type.*/

	public static void main(String[] args) {
		AutomaticPromotion M=new AutomaticPromotion();
		M.m1();
		M.m1(10);
		M.m1('A');
	}
	public void m1() {
		System.out.println("Zero i/p parameter method");
	}
	public void m1(int i) {
		System.out.println("int argument method");
	}
	public void m1(long l) {
		System.out.println("long argument method");
	}

}
