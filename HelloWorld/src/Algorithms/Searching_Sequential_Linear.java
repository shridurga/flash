package Algorithms;

import java.util.Scanner;

public class Searching_Sequential_Linear {
	
	public static void main(String args[])
	{
		

		int size;
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the size of array");
		size = sc.nextInt();
		int arr[]= new int[size];
		int result[]= new int[size];
	
		System.out.println("enter the values of the array");
		for(int i =0;i<size;i++)
		{
			arr[i]= sc.nextInt();
		}
		
		System.out.println("Enter the element you want to search");
		int key = sc.nextInt();
		int j= 0;
		for(int i=0;i<size;i++)
		{
			if(arr[i]==key)
			{
				System.out.println(" the enetered key is at "+(i+1)+" ");
				
			}
			
		}
		
		
	}

}
