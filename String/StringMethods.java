package String;

public class StringMethods {

	public static void main(String[] args) {
		// 1. CharAt-->It returns char value for the particular index.		
		String s1="VELOCITY";
		System.out.println("Index:"+s1.charAt(3));
		System.out.println("Index:"+s1.charAt(5));
		
		// 2. length();-->It returns String length/size
		System.out.println("String Length:"+s1.length());
		
		// 3.equal --> It checks the equality of string with given object
		String s2="Velocity";
		String s3="Velocity";
		String s4=new String("Velocity");
		System.out.println(s2.equals(s3)); //True
		System.out.println(s2.equals(s4)); //True
		
		// 4.isempty -->To check whether the string is empty or not.
		String s5="Java";
		System.out.println(s5.isEmpty()); //False
		String s6="";
		System.out.println(s6.isEmpty()); //True
		
		// 5. Replace -->Replace the particular Alphabets with other.
		String s7="Velocity";
		System.out.println(s7.replace('e', 'R'));
		System.out.println(s7.replace('l', 'D'));
		
		String s8="04-05-2020";
		System.out.println(s8.replace('-','/'));
		
		// 6.Replace all -->Replace a complete word with other.
		String s9="Python Java Class";
		System.out.println(s9.replaceAll("Java","Ruby"));
		System.out.println(s9.replaceAll(" ",""));
		
		// 7.Substring -->It returns substring for given string
		//Starting index is included and end index is excluded.
		String s10="Velocity Classes";
		System.out.println(s10.substring(2));
		System.out.println(s10.substring(4, 8));
		System.out.println(s10.substring(9, 14));
		
		// 8.Index of char -->Prints the index number of required word.
		String s11="Pythtn tuby Python";
		System.out.println("Index :"+s11.indexOf('t')); //1st occurrence
		System.out.println("Index :"+s11.indexOf('t',s11.indexOf('t')+1)); //2nd occurrence
		System.out.println("Index :"+s11.indexOf('t',s11.indexOf('t',s11.indexOf('t')+1)+1)); //3rd occurance
		
		// 9.lastindexof --> Prints the Index number of Last Alphabet
		String s12="Python";
		System.out.println(s12.lastIndexOf('n'));
		
		// 10.toLowerCase --> Converts the upper case letters to lower case letters.
		String s13="WELCOME";
		System.out.println(s13.toLowerCase());
		
		// 11.toUpperCase --> Converts the lower case letters to upper case letters.
		String s14="welcome";
		System.out.println(s14.toUpperCase());
		
		// 12.trim -->It removes beginning and ending spaces of the string.
		String s15=" Good Morning ";
		System.out.println(s15.trim());
		
		// 13.Split --> Split the words as per requirement.
		String s16="Hello/world/Test/Selenium";
		String s17[]=s16.split("/");
		for(int i=0;i<s17.length;i++) {
			System.out.println(s17[i]);
		}
		String s18="Good Morning";
		 String s19[]=s18.split(" ");
		 for(int i=0;i<s19.length;i++) {
			 System.out.println(s19[i]);
		 }
		 String s20="14-05-1994";
		 String s21[]=s20.split("-");
		 for(int i=0;i<s21.length;i++) {
			 System.out.println(s21[i]);
		 }
		 //Concat-->It concatenates the specified string
		 String s22="Hello";
		 System.out.println(s22.concat("Java"));
		 String x="Hello";
		 String y="World";
		 
		 int a=10;
		 int b=20;
		 
		 System.out.println(x+y); //HelloWorld
		 System.out.println(a+b); //30
		 System.out.println(x+y+a+b); //HelloWorld1020
		 System.out.println(a+b+x+y); //30HelloWorld
		 System.out.println(x+y+(a+b)); //HelloWorld30
		 
//		 Reverse String
		 StringBuffer sb=new StringBuffer("Selenium");
		 sb.reverse();
		 System.out.println(sb);		
	}

}
