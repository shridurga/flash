package arrays;

import java.util.Scanner;

public class multidimentioal_arr {

	public static void main(String[] args) {
		// two dimention decalration
		
		int arr1[][] = new int[2][2];
		int arr[][]= {{1,2,3,4},{2,3,4},{2,3,4,5}};
 int sum=0;
		
		// matrix multipliction
		Scanner sc = new Scanner(System.in);
				
		System.out.println("enter size of first matrix a");
		int r1 = sc.nextInt();
		int c1  = sc.nextInt();
		System.out.println("enter the size of 2nd matrix");
		int r2 = sc.nextInt();
		int c2 =sc.nextInt();
		if(c1==r2)
		
		{
			System.out.println("You can perform matrix multiplication");
			int first[][]=new int[r1][c1];
			int second[][]=new int[r2][c2];
			
			System.out.println("Enter the values of first matrix");
			for(int i=0;i<r1;i++)
				for(int j=0;j<c1;j++)
					first[i][j]= sc.nextInt();
			
			System.out.println("enter thenvalues of second matrix");
			for(int i =0;i<r2;i++)
				for(int j=0;j<c2;j++)
					second[i][j]= sc.nextInt();
			
			
			int result[][] = new int[r1][c2];
			
			for(int i=0;i<r1;i++) {
				for(int j=0;j<c2;j++)
				{
					for(int k=0;k<r2;k++) {
						
					sum = sum + first[i][k]* second[k][j];
					
					}
					result[i][j]= sum;
					sum =0;
				}
			}
				
				
				System.out.println("product of the matrices is");
				for(int i = 0;i<c1;i++)
					for(int j=0;j<c2;j++)
						System.out.println(result[i][j]+"\t");
					
				System.out.println("\n");
				
				
			
			
		}
		else
		{
			System.out.println("the entered matrices cant be multiplied");
		}
		
	}

}
