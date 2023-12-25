package Array;

import java.util.Arrays;

public class Array7 {

	public static void main(String[] args) {
		// Declaration & Initialization
		// int arr[]=new int[5]; Array Declaration
		//-----------------------------------------//
		
		int arr1[]= {10,35,60,50,40}; //Array Declaration & Initialization
		
		System.out.println(arr1.length);
		Arrays.sort(arr1);
		
		for(int i=0;i<arr1.length;i++) {
			System.out.println(arr1[i]);
		}
			

	}

}
