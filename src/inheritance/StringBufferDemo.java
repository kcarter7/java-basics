package inheritance;

public class StringBufferDemo {

	public static void main(String[] args) {
		StringBuffer data = new StringBuffer("Hello");
		
		System.out.println(data.length());
		data.append(" Richard");
		
		System.out.println(data);
		
		System.out.println(data.capacity());

		data.append("poouit");
		
		System.out.println("Length : " + data.length());
		System.out.println("Capacity : " + data.capacity());
		
		
		
	}

}
