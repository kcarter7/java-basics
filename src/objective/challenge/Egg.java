package objective.challenge;

import java.util.Scanner;

public class Egg {

	public static void main(String[] args) {
		Scanner console = new Scanner(System.in);
		
		System.out.println("Please enter a number of eggs");
		int eggs = console.nextInt();
			
		Egg g = new Egg();
		
		g.calculateEgg(eggs);
		
		console.close();
		
	}
	
	public void calculateEgg(int eggs) {
		int gross = (int) (eggs / 144);
		int dozen = (int) (gross / 12);
		int remaining = (int) (gross % 12);
		
		System.out.println("You have " + gross + " gross, " + dozen + " dozen, " + remaining + " remaining");
	}

}
