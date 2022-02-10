
public class ShoppingApp {

	public static void main(String[] args) {
		Review r = new Review(10394, "Reed", 5);
		r.setRating(10);
		
		System.out.println(r.getReviewGivenBy());
		System.out.println(r.getRating());
		
		// remember each and every object will have separate copy of instance variables
	}

}
