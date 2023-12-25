package Polymorphism;

public class Child extends Parent{
	@Override
	public void Money() {
		System.out.println("Money-->2 Lakh");
	}
	@Override
	public void Car() {
		System.out.println("Car-->Nexon");
	}
	@Override
	public void m1() {
		System.out.println("Child Non-Static Method:M1");
	}
	public void Mobile() {
		System.out.println("Mobile-->iphone");
	}
	public void m2() {
		System.out.println("Child Non-Static Method:M2");
	}

	public static void main(String[] args) {
		Parent p=new Parent();
		p.Home();
		p.m1();
		p.Car();
		p.Money();
		System.out.println();
		
		Child c=new Child();
		c.Car();
		c.Home();
		c.Mobile();
		c.Money();
		System.out.println();
		
		Parent p1=new Child(); //Top Casting/Dynamic Polymorphism
		p1.Car();//Lower values can be fitted/casted into Higher values
		p1.m1(); //Therefore this values will be printed by the Compiler.
		p1.Money();
		p1.Home();
		
		Child c1=(Child)new Parent(); //Down Casting
		c1.Home(); //Higher values cannot be fitted/casted into Lower values
		c1.Car(); //Therefore this values will not be printed and error occurs in Compiler
		c1.m1();
		c1.Mobile();

	}

}
