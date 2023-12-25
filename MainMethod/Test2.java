package MainMethod;

public class Test2 {

	public final static synchronized strictfp void main(String[] args) {
		System.out.println("Good Morning");
/*   1]The order of access modifier is not important i.e. instead of "Public static"
       we can take "static public".
     2]We can declare string[] in any acceptable form
       String[] args
       String []args
       String args[] 
 */
//	3]args --> name of array
//	  instead of "args" we can take any valid java identifier
//	4]String[] args--> String...args
//    We can replace "String[]run" with variable args parameter
//	5]Que-->Can I Declare main method with final/synchronized keyword
//	  Ans--> Yes.
//	6]public final static synchronized strictfp void main(String[] args){
//	  //Statement 
//	  }	
		
	}

}
