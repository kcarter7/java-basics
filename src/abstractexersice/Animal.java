package abstractexersice;


interface Beverages {
	
	public final int cast = 5;
	abstract void prepareTea();
	default void mix() {
		
	}
	
	static void ratings() {
		System.out.println("ratings for beverages");
	}
	
}

interface Games {
	void play();
	void pause();
}

interface ModernGames extends Games {
	void graphics();
	void animation();
}

class Men extends Animal {
	
	public void makeNoise() {
		System.out.println("Hello");
	}
	
	public void eat() {
		System.out.println("Humans eat alot of things");
	}
	
	public void roam() {
		System.out.println("Using cruise control");
	}
	
}

public abstract class Animal {
	
	String picture;
	String food;
	boolean hunger;
	int boundaries;
	int location;
	
	public abstract void makeNoise();
	public abstract void eat();
	public abstract void roam();
	
	public void sleep() {
		System.out.println("Animals must sleep");
	}
	
}
