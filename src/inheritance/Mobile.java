package inheritance;

public class Mobile implements Music {

	@Override
	public void play() {
		System.out.println("Play Music");
	}
	
	@Override
	public void changeSong() {
		System.out.println("Next Song");
	}
}
