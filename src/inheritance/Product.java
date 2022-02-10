package inheritance;

import java.util.Objects;

public class Product {

	int productID;
	String productName;
	int quantityOnHand;
	int price;
	
	// constructor used to initialize
	Product() {
		productID = 1;
		productName = "Lakme";
		quantityOnHand = 100;
		price = 99;
		
		System.out.println("PRODUCT CONSTRUCTOR CALLED!");
	}
	
	
	// paramatrized constructor
	public Product(int productID, String productName, int quantityOnHand, int price) {
		this.productID = productID;
		this.productName = productName;
		this.quantityOnHand = quantityOnHand;
		this.price = price;
	}

	// example of constructor chaining
	public Product(int productID, String productName, int quantityOnHand) {
		this(); //calling separate constructor within a constructor
		this.productID = productID;
		this.productName = productName;
		this.quantityOnHand = quantityOnHand;
	}
	
	

	// updating variables using the constructor.
	public String changeProductName(String name) {
		productName = name;
		return productName;
	}
	
	public String getProductName() {
		return productName;
	}
	
	public void printProductDetails() {
		System.out.println("Product ID: " + productID);
		System.out.println("Product Name: " + productName);
		System.out.println("Product Quantity: " + quantityOnHand);
		System.out.println("Product Price: " + price);
	}
	
	@Override
	public String toString() {
		return "Product [Product ID = " + productID + " Product Name = " + productName + " Price = " + price + " Quantity On Hand = " + quantityOnHand;
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
	
	@Override
	public int hashCode() {
		return Objects.hash(price, productID, productName, quantityOnHand);
	}
	
	
	public static void main(String[] args) {
		Product product1 = new Product();
		System.out.println("Printing details of product 1");
		product1.printProductDetails();
		
		// results of changes
		Product product2 = new Product();
		product2.changeProductName("Liara");
		System.out.println(product2.getProductName());
		product2.printProductDetails();
		
		
		
		
		
	}

}
