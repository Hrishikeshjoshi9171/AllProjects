package Polymorphism;

public class MethodOverloading1 {

	public static void main(String[] args) {
		MethodOverloading1 mo=new MethodOverloading1(); //Object Creation
		mo.addition(15, 20);//35 //Calling by method name
		mo.addition(20, 15, 5);//30 //Calling by method name
		MethodOverloading1.m1(); //Direct Calling
		MethodOverloading1.m1(30); //Direct Calling

	}
	public void addition(int i, int j) {
		int sum=i+j;
		System.out.println(sum);
	}
	public void addition(int i,int j, int k) {
		int sum=i+j-k;
		System.out.println(sum);
	}
	public static void m1() {
		System.out.println("Zero argument parameter");
	}
	public static void m1(int i) {
		System.out.println("One input static method");
	}

}
