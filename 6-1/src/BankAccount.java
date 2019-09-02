class BankAccount {
	private String OwnerName;
	private int AccountNumber;
	private float Balance;
	public BankAccount(String name, int num1, float num2) {
		OwnerName = name;
		AccountNumber = num1;
		Balance = num2;
	}
	
	String getOwnerName() {
		return OwnerName;
	}
	
	int getAccountNumber() {
		return AccountNumber;
	}
	
	float getBalance() {
		return Balance;
	}
	
	@Override
	public boolean equals(Object x) {
		if(this.getClass() != x.getClass()) {
			return false;
		}
		BankAccount b = (BankAccount)x;
		return ((this.getOwnerName().equals(b.getOwnerName()))
				&& (this.getAccountNumber() == b.getAccountNumber())
				&& (this.getBalance() == b.getBalance()));
	}
}
