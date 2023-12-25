package Constructor;

public class DefaultConstructor {
/* 1]Default constructor
   
   public DefaultConstructor() {
   super();
   }
   
   Use --> It copies the members of classes into object.
   
   Rules :-
   1] It is always no arguments/zero parameter constructor.
   
   2]Access modifier of the default constructor is same as class modifier.
   
   3]Default constructor contains only one line that is super class constructor.
  
*/
	public static void main(String[] args) {
		DefaultConstructor DC= new DefaultConstructor();
		DC.m1();
		DC.addition();

	}
	public void m1() {
		System.out.println("Zero parameter method");
	}
	public void addition() {
		int a=10;
		int b=20;
		int add=a+b;
		System.out.println(add);
	}

}
