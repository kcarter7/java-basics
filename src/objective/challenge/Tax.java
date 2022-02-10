package objective.challenge;

import java.util.Scanner;

public class Tax {

	public static void main(String[] args) {
		Scanner console = new Scanner(System.in);
		
		System.out.println("Enter your gender : ");
		String gender = console.nextLine();
		
		System.out.println("Enter your income : ");
		int income = console.nextInt();
		
		Tax t = new Tax();
		
		t.calculateTax(gender, income);
		
		console.close();
		

	}
	
	public void calculateTax(String gender, int income) {
		if (gender.equalsIgnoreCase("male")) {
			if (income <= 180000 || income == 0) 
				System.out.println("No tax payable");
			
			else if (income >= 180001 && income < 500000)
				System.out.println((int) (income * .10));
			
			else if (income >= 500001 && income < 800000)
				System.out.println((int) (income * .20));
			
			else if (income >= 800001)
				System.out.println((int) (income * .30));
		} 
		
		else if (gender.equalsIgnoreCase("female")) { 
	
			if (income <= 190000 || income == 0)
				System.out.println("No tax payable");
			
			else if (income >= 190001 && income < 500000)
				System.out.println((int) (income * .10));
			
			else if (income >= 500001 && income < 800000)
				System.out.println((int) (income * .20));
			
			else if (income > 800001)
				System.out.println((int) (income * .30));
		} 
	}

}
