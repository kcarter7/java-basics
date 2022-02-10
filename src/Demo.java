import java.util.Scanner;
import java.util.Date;

public class Demo {

	public static void main(String[] args) {
		Demo d = new Demo();
		d.demo();
		Demo f = new Demo();
		int a = f.addNumbers(10, 20, 28, 34);
		a += f.addNumbers(4, 6);
		
		Scanner console = new Scanner(System.in);
		System.out.println("Please enter youre age: ");
		int age = console.nextInt();
		
		System.out.println("You are " + age + " years old");
		f.getDate();
		
		f.printProductNames("Hello","Watch", "Water","Coke");
		
	}
	
	public Date getDate(){
		Date date = new Date();
		System.out.println(date);
		return date;
		
	}
	
	public void demo() {
		System.out.println("This is a demo test.");
		
	}
	// var args ...
	public int addNumbers(int...number1) {
		int sum = 0;
		// enhanced for loop
		for(int i: number1) {
			System.out.println(i);
			sum = sum + i;
		}
		return sum;
	}
	
	public void printProductNames(String...productName) {
		for (String p: productName) {
			System.out.println(p);
		}
	}
	
	
}
