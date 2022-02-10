package inheritance;

class Customer {
	
	String customerId;
	
	
	public String getCustomerId() {
		return customerId;
	}

	public void setCustomerId(String customerId) {
		this.customerId = customerId;
	}

	@Override
	protected void finalize() throws Throwable {
		System.out.println("Finalize Called!");
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Product other = (Product) obj;
		return price == other.price && productID == other.productID && quantityOnHand == other.quantityOnHand;
	}
	
	
}
public class DemoFinalize {

	public static void main(String[] args) {
		Customer customer1 = new Customer();
		customer1 = null;
		Customer customer2 = new Customer();
		Customer customer3 = new Customer();
		Customer customer4 = new Customer();
		customer2 = null;
		customer3 = null;
		System.gc();
		
		
	}
}
 