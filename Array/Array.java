package Array;

import java.util.Arrays;

public class Array {

	public static void main(String[] args) {
//		int i=10;
//		i=20;
//		int k=30;
//		int j1=40;
		
//	    Array Declaration
		int a[] = new int[10];

//      Array Initialization
		a[0] = 10;
		a[1] = 50;
		a[2] = 30;
		a[3] = 40;
		a[4] = 70;
		a[5] = 60;
		a[6] = 80;
		a[7] = 40;
		a[8] = 90;
		a[9] = 100;
		
		System.out.println(a.length);
		
		Arrays.sort(a);
		System.out.println();

//	    Array Usage
		System.out.println(a[1]);
		System.out.println(a[2]);
		System.out.println(a[3]);
		System.out.println(a[4]);
		System.out.println();
		
		for(int i=0;i<a.length;i++) {
			System.out.println(a[i]);
		}

	}

}
