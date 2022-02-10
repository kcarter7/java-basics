
public class Message {
	
	private String message;
	
	public Message() {
		this.message = "The quick brown fox jumps over the lazy dog";
	}

	public static void main(String[] args) {
		Message m = new Message();
		
		System.out.println(m.message.charAt(12));
		System.out.println(m.message.contains("is"));
		System.out.println(m.message.concat(" and it killed it"));
		System.out.println(m.message.endsWith("dogs"));
		System.out.println(m.message.equals("The quick brown Fox jumps over the lazy Dog"));
		System.out.println(m.message.equals("THE QUICK BROWN FOX JUMPS OVER THE LAZY DOG"));
		
		System.out.println(m.message.length());
		System.out.println(m.message == "The quick brown Fox jumps over the lazy Dog");
		System.out.println(m.message.replace("The", "A"));
		
		System.out.println(m.message.substring(20));
		
		int sizeHalf = m.message.length() / 2;
		System.out.println("First Part: " + m.message.substring(0, sizeHalf - 2) + " Second Part: " + m.message.substring(sizeHalf - 1, m.message.length()));
	
		System.out.println(m.message.substring(16, 20));
		System.out.println(m.message.substring(40, 43));
		
		System.out.println(m.message.toUpperCase());
		System.out.println(m.message.toLowerCase());
		
		System.out.println(m.message.indexOf('a'));
		System.out.println(m.message.lastIndexOf('e'));
		

	}

}
