package entities;

public class Product101 {
	 
	private String name;
	private double price;
	private int quantity;
	 
	 public Product101() {
	 }
	 
	 public Product101(String name, double price, int quantity) {
		 this.name = name;
		 this.price = price;
		 this.quantity = quantity;
	 }
	 
	 public Product101(String name, double price) {
		 this.name = name;
		 this.price = price;
	 }
	 
	 public String getName() {
		 return name;
	 }
	 
	 public void setName(String name) {
		 this.name = name; 
	 }
	 
	 public double getPrice() {
		 return price;
	 }
	 
	 public void setPrice(double price) {
		 this.price = price;
	 }
	 
	 public int getQuantity() {
		 return quantity;
	 }
	 
	 public double totalValueInStock() {
		 return price * quantity;
	 }
	
	 public void addProducts(int quantity) {
		 this.quantity += quantity;
	 }
	 
	 public void removeProducts(int quantity) {
		 this.quantity-= quantity;
	 }
	 
	 public String toString() {
		 return name
				 + ", $ "
				 + String.format("%.2f", price)
				 + ", "
				 + quantity
				 + " units, Total: $ "
				 + String.format("%.2f", totalValueInStock());
	 }
}
