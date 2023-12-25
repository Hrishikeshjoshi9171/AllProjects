package Polymorphism;

public class Test_Car {

	public static void main(String[] args) {
	Maruti_Car M=new Maruti_Car();
	M.Start();
	M.stop();
	M.Refuel();
	M.TheftSafety();
	System.out.println();
	
	Car c=new Car();
	c.Start();
	c.stop();
	c.Refuel();
	System.out.println();
	
	Car c1=new Maruti_Car(); //Top Casting  //Dynamic Polymorphism
	c1.Start();
	c1.stop();
	c1.Refuel();
	System.out.println();
	
	Static S1=new Static_child(); //Method Hiding
	S1.m1(); //Child Class
	S1.m2(); //Child Class

	}
	

}
