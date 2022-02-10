package inheritance;

abstract class Vehicle {
	
	abstract void start();
	abstract void stop();
	
	public void applyingBreak() {
		System.out.println("Applying break should stop");
	}
}
class Bike extends Vehicle {
	
	@Override
	void start() {
		System.out.println("Bike start by self or by kick");
	}
	
	void stop( ) {
		System.out.println("Stop!!");
	}
	
}

public class AbstractClassDemo2 {

	public static void main(String[] args) {
		
	}

}
