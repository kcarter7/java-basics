package inheritance;

public class WrapperClassDemo {

	public static void main(String[] args) {
		
		//This is known as boxing converting primitive types
		// to objects.
		int sum = Integer.parseInt(args[0]) + Integer.parseInt(args[1]);

		long salary1 = 91716;
		Long salary2 = 91716l;
		
		int marks = 100;
		Integer newMarks = new Integer(marks);
		
		// example of autoboxing
		Integer newMarks2 = marks;
		
		// example of unboxing
		Double budget = 19272.87;
		double budget1 = Double.valueOf(budget);
		
		// example of auto-unboxing
		double budget2 = budget;
		
	}

}
