
public class Monitor {

	int num = 900;
	
	{
		System.out.println("3. Initializer Block Called!");
	}
	
	static {
		System.out.println("1. Static Initializer Called");
	}
	
	public Monitor() {
		System.out.println("4. Monitor Constructor Called");
	}
	
	public void display() {
		System.out.println("5. Display called and the value of num is : " + num);
	}
	
	public static void main(String[] args) {
		System.out.println("2. Main")

	}

}
