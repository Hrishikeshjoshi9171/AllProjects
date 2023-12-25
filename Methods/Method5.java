package Methods;

public class Method5 {
	
	//Non-static regular method calling from same class

	public static void main(String[] args) {
		System.out.println("Main Method Started");
		//object creation 
		//syntax-->Classname RVname = new classname(); RV=Reference Variable
		
		//RVname.methodname();
		Method5 m5 = new Method5();
		m5.m5();
		m5.m6();
		m7();
		m5.m50();
		System.out.println("Main Method Ended");
		
}
	public void m5() {
		System.out.println("Non-static method running from same class :m5");
	}
	
	public void m6() {
		System.out.println("Non-static method running from same class :m6");
	}

	public static void m7() {
		System.out.println("Static method");
	}
	public void m50() {
		System.out.println("Non-Static Method");
	}

}
