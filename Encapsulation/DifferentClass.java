package Encapsulation;

public class DifferentClass {

	public static void main(String[] args) {
		EmpData emp=new EmpData();
		emp.setName("Rohit");
		emp.setAge(22);
		emp.setpin(1234);
		
		System.out.println(emp.getName());
		System.out.println(emp.getAge());
		System.out.println(emp.getpin());
	}

}
