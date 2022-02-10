package inheritance;

abstract class Animal {
	int ags;
	
	public abstract void eat();
		
	public void sleep() {
		System.out.println("Animal should sleep");
	}
	
}

class Cat extends Animal {
	
	@Override 
	public void eat() {
		System.out.println("Cat eats milk");
	}
}
public class AbstractClassDemo {

	public static void main(String[] args) {
		Cat c = new Cat();
		c.eat();
		
	}
}
