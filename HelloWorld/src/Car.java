

 class vehicle{

	protected String brand ="audi";
	
	public void honk() {
		System.out.println("toooot");
	}

}

public class Car extends vehicle {
	
	private String modelname = "AudiA6";
	public static void main (String[] args) {
	Car myCar = new Car();
	
	myCar.honk();
	System.out.println(myCar.brand+" "+myCar.modelname);
	
	
	}
	
}
