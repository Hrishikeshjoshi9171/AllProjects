package Constructor;

public class RulesofConstructor {
/*	1]Name of the constructor must be same as class name.
	public  RulesofConstructor () {
		System.out.println("Default constructor");
	}
	
    2]We cannot create constructor inside the method/block.
	public RulesofConstructor() {
		System.out.println("Default constructor");
	}
	
	3]Return type concept is not applicable for constructor, even for void also.
	If you take void keyword, that time, compiler will treat it as method.

	public RulesofConstructor() {
		System.out.println("Default constructor");
	}
	
	4]Applicable modifiers/keyword-->public, private, protected, default
	Non-Applicable modifiers/keyword-->final, static, abstract, native
	RulesofConstructor(){
		System.out.println("Default Constructor");
	}
	
	5]Any number of constructor can be declared in java class, but constructor name should be 
	same as class name, but argument/parameter should be different.*/
	
	public RulesofConstructor() {
		System.out.println("Default Constructor");
	}
	public RulesofConstructor(int i) {
		System.out.println("int Default Constructor");
	}
	public RulesofConstructor(int i, int j) {
		System.out.println("Default Constructor");
	}
	public RulesofConstructor(String s) {
		System.out.println("String Default Constructor");
	}

	public static void main(String[] args) {
		RulesofConstructor R0= new RulesofConstructor();
		RulesofConstructor R1= new RulesofConstructor(10);
		R0.m1();
		R1.m1();
	}
	public void m1() {
		System.out.println("Default method");
	}

}
