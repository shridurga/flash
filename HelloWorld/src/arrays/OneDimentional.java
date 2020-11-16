package arrays;

class Student{
	
	public int rollno;
	public String name;
	Student(int rollno,String name)
	{
		this.rollno = rollno;
		this.name = name;
	}
}
public class OneDimentional {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Student s[] = new Student[3];
	
		s[0] = new Student(13, "dfg");
		s[1] = new Student(14,  "dfg");
		s[2] = new Student(15, " hbvcx");
		
		for(int i = 0; i< s.length;i++) {
			 System.out.println("the student "+ i+1+ "roll is" + s[i].rollno+ "name is "+ s[i].name);
		}
			
		int r[] = {1,3,4};
		String z[] = {"fgh","df","ghjk"};
		
		int intArray[];    
		intArray = new int[20];
		
		int intArray2[] = {1,2,3,4,5};
		
		int[] intArray1 = new int[20];
		intArray1[3]=5;
		
	}

}
