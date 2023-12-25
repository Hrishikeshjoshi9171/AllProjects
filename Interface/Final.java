package Interface;

public class Final {

	public static void main(String[] args) {
		int i=100; //Non-Final
		i=50;
		System.out.println(i);
		
		i=200;
		System.out.println(i);
		
		final int j=400;
		System.out.println(j);
		
//		j=40;
//		System.out.println(j);

	}

}
