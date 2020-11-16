package arrays;

public class ReturningArraysFromMethods2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int arr[] = method();
		for(int i=0;i<arr.length;i++)
		{
			System.out.println(arr[i]+"\t");
		}
		System.out.println(arr.getClass());
		System.out.println(arr.getClass().getSuperclass());
	}

	private static int[] method() {
		
		int arr1[]= {1,3,4};
		return arr1;
		
	}
	
	

}
