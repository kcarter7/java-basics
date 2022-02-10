package abstractexersice;

public abstract class Hippo extends Animal {
	
	@Override
	public void makeNoise() {
		System.out.println("Hippos roar");
	}
	
	@Override
	public void roam() {
		System.out.println("Hippos gallop");
	}
}
