package entintes;

public class Product_Construtor {
	public String name;
	public double price;
	public int quantity;
	
	public Product_Construtor(String name,double price,int quantity){
		this.name = name;
		this.price = price;
		this.quantity = quantity;
	}

	public double totalValueStock() {
		return price * quantity;
	}
	
	public void addProduct(int quantity) {
		 this.quantity += quantity;
	}
	
	public void removeProduct(int quantity) {
		 this.quantity -= quantity;
	}	
	
	public String toString() {
		return name
				+ ", $"
				+ String.format("%.2f", price)
				+ ", "
				+ quantity
				+ " units, Total: $ "
				+ String.format("%.2f", totalValueStock());
	}
}
