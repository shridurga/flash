package oops;

public class Dog {

	
	String name;
	String breed;
	int age;
	String colour;
	
	public Dog(String name, String breed, int age, String colour)
	{
		this.name=name;
		this.breed=breed;
		this.age= age;
		this.colour =colour;
		
	}
	 
	public String getName() {
		return name;
	}
	
	public String getBreed() {
		return breed;
	}
	
	public int getAge() {
		return age;
	}
	
	public String getColour() {
		return colour;
	}

	public String toString()
	{
		return( "my details are"+ name+ this.getBreed()+this.getAge()+this.getColour());
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Dog x = new Dog("snoopy","Dolmatian",12,"white and black");
		System.out.println(x.toString());
			
	}

}
