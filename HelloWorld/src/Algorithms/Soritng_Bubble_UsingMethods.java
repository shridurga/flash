package Algorithms;

import java.util.Scanner;

public class Soritng_Bubble_UsingMethods {

	// to print
	// to sort
	public static void print(int arr[], int size)
	{
	
		for(int i=0;i<size;i++)
			System.out.println(arr[i]);
	}
	
	public static void sort(int arr[], int size)
	{
		for(int i=0;i<size;i++)
		{
			for(int j=0;j<size-i-1;j++)
			{
				if(arr[j]>arr[j+1])
				{
					int temp = arr[j];
					arr[j]= arr[j+1];
					arr[j+1]= temp;
				}
					
			}
		}
	}
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int size;
		System.out.println(" enter the size");
		size = sc.nextInt();
		System.out.println(" enter the elements to the array");
		int arr[] = new int[size];
		for(int i=0;i<size;i++)
		{
			arr[i]= sc.nextInt();
		}
		sort(arr, size);
		System.out.println(" After sorting the elements are");
		print(arr,size);
		
		
	}

}
