import java.util.Scanner;

public class ifelsedemo {

	public static void main(String[] args) {
		System.out.println("enter a number");
		int n1;
		Scanner sc = new Scanner(System.in);
		n1 = sc.nextInt();
		if(n1 > 10) {
		System.out.println("the num "+n1+" is greater than 10");
		}

	
		else
		{
			System.out.println("the num "+n1+" is less than 10");
		}
	}

}
