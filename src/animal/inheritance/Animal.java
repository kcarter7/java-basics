package animal.inheritance;

public class Animal {
	int age;
	public void eat() {
		System.out.println("Animal must eat to survive");
		}
	public void sleep() {
		
	}
}
class Cat extends Animal {
	public void eat() {
		System.out.println("Cat eats milk");
	}
}
class Dog extends Animal {
	public void eat() {
		System.out.println("Dog eats meat");
	}
}


