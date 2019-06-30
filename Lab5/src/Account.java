public class Account {
	
	String name;
	char type;
	double amount;
	
	public Account(String name, char type, double amount) {
		this.name = name;
		this.type = type;
		this.amount = amount;
	}
	
	Account(String name, char type){
		this.name = name;
		this.type = type;
		this.amount = 0.0;
	}
	
	double getBalance() {
		double balance = amount;
		return balance;
	}
	
	String getDescription() {
		
		String result = "";
		
		if (type == 'i') {
			result = "International account with owner " + this.name + " has current balance $" + this.amount;
			return result;
		}
		else if (type == 'd') {
			result = "Domestic account with owner " + this.name + " has current balance $" + this.amount;
			return result;
		}
		return result;
	}
	
	void setBalance (double balance) {
		this.amount = balance;
	}
	
	void deposit (double deposit) {
		if (this.type == 'i') {
			deposit = deposit - (deposit * 0.10);
			this.amount = this.amount + deposit;
		}
		else {
			this.amount = this.amount + deposit;
		}
	}
	
	void withdraw (double withdraw) {
		if (this.type == 'i') {
			withdraw = withdraw + (withdraw * 0.10);
			this.amount = this.amount - withdraw;
		}
		else {
			this.amount = this.amount - withdraw;
		}
	}
	
	void transferTo (Account accType, double amount) {
		
		double amount2 = amount;
				
		if (this.type == 'i' && accType.type == 'd') { 
			accType.amount = accType.amount + amount;
			amount = amount + (amount * 0.10);
			this.amount = this.amount - amount;
		}
		else if (this.type == 'd' && accType.type == 'i') {
			this.amount = this.amount - amount;
			amount = amount - (amount * 0.10);
			accType.amount = accType.amount + amount;
		}
		else if (this.type == 'i' && accType.type == 'i') {
			amount2 = amount2 + (amount2 * 0.10);
			this.amount = this.amount - amount2;
			amount = amount - (amount * 0.10);
			accType.amount = accType.amount + amount;
		}
		else {
			accType.amount = accType.amount + amount;
			this.amount = this.amount - amount;
		}
	}
}
