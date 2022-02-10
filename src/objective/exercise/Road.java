package objective.exercise;

public class Road {

	public static void main(String[] args) {
		Truck truck = new Truck();
		truck.printDetails();
		truck.drive();
		truck.reverse();
		
		Bus bus = new Bus();
		bus.printDetails();
		bus.drive();
		bus.reverse();
		
		Car car = new Car();
		car.printDetails();
		car.drive();
		car.reverse();
	}

}
