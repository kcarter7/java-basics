package objective.exercise;

public class Vehicle {
	
	protected String color;
	protected int noOfWheels;
	protected String model;
	
	public Vehicle() {
		color = "Generic";
		noOfWheels = 4;
		model = "Factory";
	}
	
	public Vehicle(String color, int noOfWheels, String model) {
		this.color = color;
		this.noOfWheels = noOfWheels;
		this.model = model;
	}

	public void drive() {
		System.out.println("vroom!");
	}
	
	public void reverse() {
		System.out.println("beep beep.");
	}
	
	public void add(String num1, String num2) {
		System.out.println("Adding two strings: " + (num1 + num2));
	}
	
	public void add(int num1, String num2) {
		System.out.println("Adding one number and one string" + (num1 + num2));
	}
	
	public void printDetails() {
		System.out.println("Details:");
		System.out.println("Color: " + this.color);
		System.out.println("Wheel Number: " + this.noOfWheels);
		System.out.println("Model: " + this.model);
		System.out.println("--------------------------");
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public int getNoOfWheels() {
		return noOfWheels;
	}

	public void setNoOfWheels(int noOfWheels) {
		this.noOfWheels = noOfWheels;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}
	
	
}
