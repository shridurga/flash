package oops;


interface E
{
	void showE();
}

interface D
{
	void showD();
}

class AB implements E, D{
	
	public  void showE() {
		System.out.println("E");
	}
	

	public void showD() {
		System.out.println("D");
	}
}

public class Inheritance  {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		AB obj = new AB();
		obj.showD();
		obj.showE();
		

	}

}
