package Polymorphism;

public class Sample1 {

	public static void main(String[] args) {
		Sample1 s=new Sample1();
		s.demo();
		s.m1();
	}
	public void m1() {
		System.out.println("Non-Static Method");
	}
	public void demo() {
		int i=10;
		int j=0;
		int k=i/j;
		System.out.println(k);
	}

}
