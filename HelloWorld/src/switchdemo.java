import java.util.Scanner;

public class switchdemo {

	public static void main(String[] args) {
	
		int i;	
		boolean flag=true;
		
		
		do {
			System.out.println("enter month number");
			Scanner sc = new Scanner(System.in);
			i = sc.nextInt();
		switch (i)
		{
			case 1:
				System.out.println("january");
				break;
			case 2:
				System.out.println("feb");
				break;
			case 3:
				System.out.println("march");
			break;
			case 4:
				System.out.println("april");
			break;
			case 5:
				System.out.println("may");
				break;
			default :
			{
				 flag = false;
				System.out.println("try nxt time");
			}
		}
		}while (flag==false);
		
		
	}

}
