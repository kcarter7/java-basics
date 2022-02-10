package objective.exercise;

public class Truck extends Vehicle {
	
	public Truck() {
		noOfWheels = 6;
		color = "Gray";
		model = "Ford";
	}
	
	public Truck(String color, int noOfWheels, String model) {
		super(color, noOfWheels, model);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void drive() {
		System.out.println("Barrel Forward!");
	}
	
	public void reverse() {
		System.out.println("BEEP! BEEP!");
	}
	
	public void printDetails() {
		super.printDetails();
	}
	
}
