package Encapsulation;

public class EmpData {
	/* Encapsulation in java is a process of wrapping the code and data together into a single unit.
	   It is also called Data Hiding.
	  
	  Variables are always private.Getter and setter method are always public in nature.
	  
	  Private data members/variables-->We cannot access directly from another class.
	  
	  To provide the security in java we use encapsulation concept
	 */
	private int Pin;
	private String Name;
	private int Age;

	public static void main(String[] args) {
		EmpData emp=new EmpData();
		
		emp.setName("Hrishikesh");
		emp.setpin(2712);
		emp.setAge(25);
		
		System.out.println("Emp Name is:"+emp.getName());
		System.out.println("Emp Age is:"+emp.getAge());
		System.out.println("Emp PIN is:"+emp.getpin());
		
	}
	public int getpin() {
		return Pin;
	}
	public void setpin(int pin) {
		Pin=pin;
	}
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name=name;
	}
	public int getAge() {
		return Age;
	}
	public void setAge(int age) {
		Age=age;
	}

}
