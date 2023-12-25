package Casting;

public class Test {

	public static void main(String[] args) {
//		Childclass c=new Childclass();
//		c.automatic();
		
		Superclass s=new Childclass(); //UpCasting
		s.Start();
		s.Stop();
		s.Refule();
		
		Childclass c=(Childclass)new Superclass(); //Downcasting
		
	}

}
