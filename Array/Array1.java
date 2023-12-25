package Array;

import java.util.Arrays;

public class Array1 {

	public static void main(String[] args) {
		//int Array
		
		int arr[]=new int[5];
		arr[0]=30;
		arr[1]=60;
		arr[2]=70;
		arr[3]=40;
		arr[4]=80;
		
		System.out.println(arr.length);
		
		Arrays.sort(arr);
		
//		System.out.println(arr);
//		System.out.println();
		
//		System.out.println(arr[2]);
//		System.out.println(arr[3]);
		System.out.println();
		
		for(int i=0;i<5;i++) {
			System.out.print(arr[i]+" ");
		}
		
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}

	}

}
