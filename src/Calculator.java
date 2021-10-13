
class Calculator {
	int balance = 0;
	
	public void setBalance(int i) {
		balance = i;
	}
	public int deposit(int Price) {
		if (Price > 0) {
			balance = balance + Price;
			return 0;
		}
		else {
			return -1;
		}
	}
	public int payment(int Price) {
		if (balance > Price) {
			balance = balance - Price;
			return 0;
		}
		else {
			return -1;
		}
	}
	public int getBalance() {
		System.out.println(balance);
		return balance; 
	}
}

