package Algorithms;

import java.util.Scanner;

public class Searching_Sequential_linear_usingMethod {

	public static void main(String[] args) {
		
		
		int size;		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("enter the size of array");
		 size =sc.nextInt();
		
			
		int arr[]= new int[size];
		
		
		System.out.println("enter the elements");
		for(int i =0;i<size;i++)
		{
			arr[i]= sc.nextInt();
		}
		
		
	
		int result = Searching_method1(arr,size);
		
		System.out.println(result);
	}
	
	
		public static int Searching_method1(int arr[],int size) {
		System.out.println("enter the elemet you want to search");
		try (Scanner sc2 = new Scanner(System.in)) {
			int key=sc2.nextInt();
			for(int i=0;i<size;i++) {
				if(key == arr[i])
				{
					return i;
				}
			}
		}
		return -1;
		
		
	}

}
