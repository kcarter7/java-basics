package objective.exercise;

public class Car extends Vehicle {

	public Car() {
		super();
		color = "Black";
		model = "Toyota";
	}

	public Car(String color, int noOfWheels, String model) {
		super(color, noOfWheels, model);
		
	}
	
	public void drive() {
		super.drive();
	}
	
	public void reverse() {
		super.reverse();
	}
	
	public void printDetails() {
		super.printDetails();
	}

}
