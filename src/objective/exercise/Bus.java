package objective.exercise;

public class Bus extends Vehicle {

	public Bus() {
		color = "Yellow";
		noOfWheels = 16;
		model = "County Issued";
	}

	public Bus(String color, int noOfWheels, String model) {
		super(color, noOfWheels, model);
		
	}
	
	public void drive() {
		super.drive();
	}
	
	public void reverse() {
		System.out.println("Please move away");
	}
	
	public void printDetails() {
		super.printDetails();
	}

}
