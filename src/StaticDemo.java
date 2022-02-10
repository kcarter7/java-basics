
public class StaticDemo {

	public int num1;
	public int num2;
	
	
	
	public StaticDemo() {
		num1 = 10;
		num2 = 20;
	}

	// static variables can only access static variables
	public void display1() {
		num1 = num2++;
		num2 = 100;
	}
	
	public void display2() {
		num2 = 300;
	}
	
	public void print() {
		System.out.println(num1);
		System.out.println(num2);
	}
	
	public static void main(String[] args) {
		StaticDemo demo = new StaticDemo();
		
		demo.display1();
		demo.display2();
		demo.print();
		
		
		

	}

}
