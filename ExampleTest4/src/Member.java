public class Member {

	double balance;
	String id;
	Order[] orders;
	int numOrders;
	static int globalCounter = 1;
	
	Member(double balance) {
		this.balance = balance;
		id = "mem" + globalCounter;
		globalCounter++;
		orders = new Order[30];
		numOrders = 0;
	}

	Member() {
		this.balance = 0;
		id = "mem" + globalCounter;
		globalCounter++;
		orders = new Order[30];
		numOrders = 0;
	}

	String getId() {
		return id;
	}

	double getBalance() {
		return balance;
	}
	
	double getAmountToPay() {
		double amount = 0;
		
		for (int i = 0; i<numOrders; i++) {
			Order o = orders [i];
			amount += o.getPrice()*o.getQuantity();
		}
		
		return amount;
	}

	Order[] getOrders() {
		Order[] os = new Order[numOrders];
		
		for (int i = 0; i < numOrders; i++) {
			os[i] = orders[i];
		}
		
		return os;
	}

	void addOrder(Order o1) {
		orders[numOrders] = o1;
		numOrders++;
	}

	void addOrder(String product, double price, int quantity) {
		Order o1 = new Order(product, price, quantity);
		orders[numOrders] = o1;
		numOrders++;
	}
	
	void deposit (double amount) {
		balance += amount;
	}
	
	void withdraw (double amount) {
		balance -= amount;
	}
	
	void clearOrders() {
		numOrders = 0;
	}

}
