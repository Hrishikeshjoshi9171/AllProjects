package DataTypes;

public class Sample1 {

	public static void main(String[] args) {
		
//Primitive Data Types
		//1.(Numeric + Non-decimal):
		
		//1] Byte data type
		//Syntax--> DataType variablename = information
		byte b=80; //-128 to 127
		byte b1=127; //Max limit //1 byte
		
		System.out.println("byte data type: " + b);
		System.out.println("byte data type: " + b1);
		System.out.println("********************");
		
		byte b2=-48;
		byte b3=-128;
		
		System.out.println("byte data type: " + b2);
		System.out.println("byte data type: " + b3);
		System.out.println("***********************");
		
		//2]Short data type
		short s=32767; //Max value //2 byte
		short s1=-32768;
		
		System.out.println("Short data type: " + s);
		System.out.println("Short data type: " + s1);
		System.out.println("************************");
		
		//3]int data type
		int i=2147483647; //Max value //4 byte
		int i1=-2147483647;
		
		System.out.println("int data type: " + i);
		System.out.println("int data type: " + i1);
		System.out.println("*****************************");
		
		//4] Long data type
		long l=21474836476644l; //Max value //8 byte
		long l1=-214748364737644l;
		
		System.out.println("Long data type: " + l);
		System.out.println("Long data type: " + l1);
		System.out.println("*******************************");
		
		//2.(Numeric + Decimal):
		
		//5]float data type
		float f=36.55f; // Max value // 4 byte
		float f1=-38.5555555555f;
		
		System.out.println("Float data type: " + f);
		System.out.println("Float data type: " + f1);
		System.out.println("***************************");
		
		//6]Double data type
		double d=48.66; // Max value //8 byte
		double d1= -45.55;
		
		System.out.println("Double data type: " + d);
		System.out.println("Double data type: " + d1);
		System.out.println("*************************");
		
		//3. Character:
		
		//7]char data type
		char c= 'A';   //2 byte
		System.out.println("Character data type: " + c);
		System.out.println("************************");
		
		//4. Conditional:
		
		//8]Boolean data type
		boolean b5=true;   //1 bit
		boolean b6=false;
		
		System.out.println("Boolean data type: " + b5);
		System.out.println("Boolean data type: " + b6);
		System.out.println("***************************");

	}

}
