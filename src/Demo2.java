
public class Demo2 {

	int num1 = 1;
	int num2 = 2;
	static int num3 = 3;
	
	
	public Demo2() {
		num1++;
		num2--;
		num3++;
	}


	public static void main(String[] args) {
		
		Demo2 d = new Demo2();
		Demo2 e = new Demo2();
		
		System.out.println("demo num1 " + d.num1);
		System.out.println("demo num2 " + e.num2);
		
		
	}

}
