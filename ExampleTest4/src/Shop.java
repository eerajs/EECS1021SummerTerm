public class Shop {

	private Member[] members;
	private int numMem;
	
	Shop (){
		members = new Member[100];
		numMem = 0;
	}
	
	Member[] getMembers() {
		Member[] ms = new Member[numMem];
		
		for (int i = 0; i < numMem; i++) {
			ms [i] = members[i];
		}
		
		return ms;
	}

	private int indexOfMember (String id) {
		int index = -1;
		
		for (int i = 0; i < numMem; i++) {
			if (members[i].getId().equals(id)) {
				index = i;
			}
		}
		
		return index;
	}
	
	boolean hasMember(String id) {
		return indexOfMember(id) >= 0;
	}

	void addMember(Member m) {
		members[numMem] = m;
		numMem++;
	}

	void checkOut(String id) {
		int index = indexOfMember(id);
		if (index >= 0) {
			Member m = members[index];
			double amount = m.getAmountToPay();
			m.withdraw(amount);
			m.clearOrders();
		}
		else {
			// Non-existing member: do nothing.
		}
	}
}
