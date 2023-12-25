package ThisandSuper;

public class Sample2 extends Sample1{
	/*What is the use of super keyword?
	Answer-->>Super keyword is used to access global variables from different class.
	 */
	int rollno=20;
	int rollno1=30; //Global Non-Static variable

	public static void main(String[] args) {
		Sample2 s2=new Sample2();
		s2.m1();
	}
	public void m1() {
		int rollno=70;
		System.out.println("Local Variable: "+rollno);  //70
		System.out.println("Global Variable call from same class: "+this.rollno); //20
		System.out.println("Global Variable call from other call: "+super.rollno); //60
	}

}
