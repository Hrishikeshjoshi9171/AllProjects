package Array;

import java.util.Arrays;

public class Array5 {

	public static void main(String[] args) {
		int arry[]=new int[4];
		arry[0]=50;
		arry[1]=30;
		arry[2]=20;
		arry[3]=40;
		System.out.println(arry.length);
		
		Arrays.sort(arry);
		System.out.println();
		
		for(int i=0;i<arry.length;i++) {
			System.out.println(arry[i]);
		}

	}

}
