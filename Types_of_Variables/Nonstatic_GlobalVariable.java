package Types_of_Variables;

public class Nonstatic_GlobalVariable {
	//Non static global variable call from same class
	
	int i=10; //Non-static global variable
	String s="Mohit";

	public static void main(String[] args) {
		Nonstatic_GlobalVariable Ns=new Nonstatic_GlobalVariable();
		System.out.println(Ns.i);
		System.out.println(Ns.s);
		m1();

	}
	public static void m1() {
		Nonstatic_GlobalVariable Ns1= new Nonstatic_GlobalVariable();
		System.out.println(Ns1.i);
		System.out.println(Ns1.s);
	}

}
