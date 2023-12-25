package Array;

public class DuplicateNumbers {

	public static void main(String[] args) {
		
		int[] arr= {1,3,4,2,1,2,7,9,3,10};
		
		System.out.println(arr.length);
		System.out.println("Duplicate element in given Array:");
		
		
		for(int i=0;i<arr.length;i++) {
			
			for(int j=i+1;j<arr.length;j++) {
				
				if(arr[i]==arr[j]) {
					
				System.out.print(arr[j]+" ");
				}
			}
		}

	}

}
