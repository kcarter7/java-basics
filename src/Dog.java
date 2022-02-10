
public class Dog {

	String dogbreed;
	int age = 11;
	int weight = 0;
	
	public void feedDog() {
		int food;
		if (age > 10) {
			food = 10;
		} 
		
		System.out.println(food);
	}
	
	public static void main(String[] args) {
		int counter = 0;
		Dog d = new Dog();
		
		d.feedDog();

	}
	
	public void bark() {
		System.out.println("Roof!");
	}

}
