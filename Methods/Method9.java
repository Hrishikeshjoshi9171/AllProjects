package Methods;

public class Method9 {

	public static void main(String[] args) {
		
		studentinformation("Rahul",10,'A',65.4f);
		System.out.println();
		studentinformation("Rohit",30,'B',40.5f);
		
	}
	
	
	public static void studentinformation(String Studentname,int Studentrollno,char Sgrade,float Spercentage) {
		
		System.out.println("Student name :"+Studentname+" ,"+"Student rollno :"+Studentrollno+", "
		+"Student grade: "+Sgrade+", "+"Student Percentage: "+Spercentage);
	}


	

}
