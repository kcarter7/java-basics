import java.util.Scanner;

public class LeapYear {

	int year;
	boolean leapYear;
	
	public static void main(String[] args) {
		LeapYear ly = new LeapYear();
		Scanner console = new Scanner(System.in);
		
		System.out.println("Enter the year: ");
		int year = console.nextInt();
		
		ly.detectYear(year);
		
		
		console.close();
		
	}
	
	public void detectYear(int year) {
		if (year == 2020) {
			System.out.println("Yes, " + year + " is a leap year.");
		} else {
			System.out.println("No, " + year + " is a not a leap year.");
		}
	}

}
