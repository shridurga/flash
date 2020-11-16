import java.util.Scanner;

class student{
	
	public int rollno;
	public String name;
	student(int rollno,String name)
	{
		this.rollno = rollno;
		this.name = name;
	}
	
	
	
	
}

public class experiment {

	public static void main(String[] args) {

		
		student[] s= new student[3];
		
		s[0] = new student(13, "dfg");
		s[1] = new student(14,  "dfg");
		s[2] = new student(15, " hbvcx");
		
		for(int i = 0; i< s.length;i++) {
			 System.out.println("the student "+ i+1+ "roll is" + s[i].rollno+ "name is "+ s[i].name);
		}
				
				
		
		
		
		
		
	}

}
