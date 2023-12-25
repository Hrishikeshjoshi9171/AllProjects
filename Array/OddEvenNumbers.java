package Array;

public class OddEvenNumbers {

	public static void main(String[] args) {
		int arr[]= {2,4,5,7,8,9,11};
		System.out.println("Odd Numbers");
		
		for(int i=0;i<arr.length;i++) {
			if(arr[i]%2 !=0) { // ! = Not Equal operator
				System.out.print(arr[i]+" ");
			}
		}
		System.out.println();
		System.out.println("Even Number");
		
		for(int j=0;j<arr.length;j++) {
			if(arr[j]%2==0) {
				System.out.print(arr[j]+" ");
			}
		}

	}

}
