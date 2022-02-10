import java.util.Scanner;

public class DemoArray {

	public static void main(String[] args) {
		int marks[] = {35, 34, 12, 43, 74, 35};
		
		for (int i: marks) {
			System.out.println(i);
		}
		
		//Use case
		
		int num[] = new int[5];
		Scanner console = new Scanner(System.in);
		int sum = 0;
		System.out.println("Please enter 5 numbers: ");
		for(int i = 0;i < num.length; i++) {
			num[i] = console.nextInt();
			sum += num[i];
		}
		
		System.out.println("The sum of all of the numbers is " + sum);
	}

}
