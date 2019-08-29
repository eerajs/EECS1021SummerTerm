public class Order {

	String product;
	double price;
	int quantity;
	
	public Order(String product, double price, int quantity) {
		this.product = product;
		this.price = price;
		this.quantity = quantity;
	}
	
	Order () {
		product = null;
		price = 0;
		quantity = 0;
	}
	
	void setProduct (String product) {
		this.product = product;
	}
	
	void setPrice (double price) {
		this.price = price;
	}
	
	void setQuantity (int quantity) {
		this.quantity = quantity;
	}

	String getProduct() {
		return product;
	}
	
	double getPrice() {
		return price;
	}
	
	int getQuantity() {
		return quantity;
	}
	
	

}
