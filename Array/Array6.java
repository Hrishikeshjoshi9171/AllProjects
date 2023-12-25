package Array;

public class Array6 {

	public static void main(String[] args) {
		Object obj[]=new Object[5];
		
		obj[0]=10; //Integer
		obj[1]=20.5; //Double
		obj[2]="Welcome"; //String
		obj[3]='A'; //Char
		obj[4]=true; //Boolean
		System.out.println(obj.length);
		
		for(int i=0;i<obj.length;i++) {
			System.out.println(obj[i]);
		}

	}

}
