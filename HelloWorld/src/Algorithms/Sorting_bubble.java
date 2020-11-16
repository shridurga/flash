package Algorithms;

import java.util.Scanner;

public class Sorting_bubble {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("enter the size of the array");
		
		Scanner sc = new Scanner(System.in);
		int size = sc.nextInt();
		System.out.println("enter the elements of the array");
		int arr[]= new int[size];
		for(int i =0;i<size;i++)
		arr[i]=sc.nextInt();
		System.out.println("after bubble sort the array is ");
		for(int i=0;i<size;i++)
		{
			for (int j=0;j<size-i-1;j++)
			{
				if(arr[j]>arr[j+1])
				{
					int temp = arr[j+1];
					arr[j+1]=arr[j];
					arr[j]=temp;
				}
			}
		}
		for(int p=0;p<size;p++)
		{
			System.out.println(arr[p]);
		}
		
		
	}

}
