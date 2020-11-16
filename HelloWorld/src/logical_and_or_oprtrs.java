import java.util.Scanner;

public class logical_and_or_oprtrs {
	
	
public static void main(String args[]) {
	String username = "sridurga";
	String password = "password";
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter username");
	String u = sc.next();
	System.out.println("Enter password");
	String p = sc.next();
	
	if(u.equals(username) && p.equals(password)) {
		System.out.println("both are correct and u can login");
	}
	else if(!(u.equals(username)) || !(p.equals(password)))
	{
		System.out.println("one of the credentials is wrong");
	}
	else {
		System.out.println("Both are wrong");
	}
		
	
		
}
}
