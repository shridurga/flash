import java.util.Scanner;

public class Hello {

	public static void main(String[] args) {
		
		Scanner sc =new Scanner(System.in);
		System.out.println("enter n1");
		int n1;
		n1 = sc.nextInt();
		System.out.println("enter n2");
		int n2 = sc.nextInt();
		
		int sum = n1+n2;
		System.out.println("sum of the two numbers" +sum);
		
	}

}

