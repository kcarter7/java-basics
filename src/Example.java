public class Example {
	public static void main(String args[]) {
		int i = 0;
		int j = 2;
		boolean b = (i < j) || (j++ > i);
		System.out.println(j);
		b = (i < j) | (j++ > i);
		System.out.println(j);
		
		byte num = 127;
		float marks = 3.9f;
		
		float f1=19.9f;
		double d1 = 987.9;
		
		short s1 = 98;
		short s2 = 190;
		
		int nums[] = new int[10];
		for (int number: nums) {
			System.out.println(num += 1);
		} 
		
		
		short s3 = (short) (s1 + s2);
		
	}
}