package arrays;

public class PassingArraysToMethods1 {

	public static void main(String[] args) {
		
		int i=2;
		int j= 3;
		
		
		System.out.println(i);
		
		
		int arr[]= {1,2,3,4,5};
		int Sum =summation(arr);
		System.out.println(Sum);
		
		
	}
	public static int summation(int[] arr) {
		// TODO Auto-generated method stub
		int add=0;
		for(int i=0;i<arr.length;i++)
		{
			add =add + arr[i];
		}
		return add;
	}
	public static void sum(int i,int j)
	{
		i= i+1;		
	}
	
}


