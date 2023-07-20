package entintes;

public class Product {
	public String name;
	public double price;
	public int quantity;
	public int add;

	public double totalValueStock() {
		double total = price * quantity;
		return total;
	}
	
	public double addProduct() {
		 quantity+=add;
		 return price * quantity;
	}
	
	public double removeProduct() {
		 quantity-=add;
		 return price * quantity;
	}		

}
