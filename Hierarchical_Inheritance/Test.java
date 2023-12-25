package Hierarchical_Inheritance;

public class Test {

	public static void main(String[] args) {
		Son1 s1=new Son1();
		s1.Mobile();
		s1.property();
		System.out.println();
		
		Son2 s2=new Son2();
		s2.Bike();
		s2.property();
		System.out.println();
		
		Son3 s3=new Son3();
		s3.Laptop();
		s3.property();

	}

}
