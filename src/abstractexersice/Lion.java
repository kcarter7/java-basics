package abstractexersice;

public class Lion extends Feline {
	
	@Override
	public void makeNoise() {
		System.out.println("Roar!");
	}
	
	@Override
	public void eat() {
		System.out.println("Felines eat ");
	}
}
