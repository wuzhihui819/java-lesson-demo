public class BankAccount {
	private String ownerName;
	private int accountNumber;
	private float balance;

	public String getOwnerName() {
		return ownerName;
	}

	public void setOwnerName(String ownerName) {
		this.ownerName = ownerName;
	}

	public int getAccountNumber() {
		return accountNumber;
	}

	public void setAccountNumber(int accountNumber) {
		this.accountNumber = accountNumber;
	}

	public float getBalance() {
		return balance;
	}

	public void setBalance(float balance) {
		this.balance = balance;
	}

	void deposit(float depo) {
		this.balance += depo;
	}

	public BankAccount() {
		this.ownerName = "nobody";
		this.accountNumber = 0;
		this.balance = 0;
	}

	public BankAccount(String ownerName, int accountNumber) {
		this.ownerName = ownerName;
		this.accountNumber = accountNumber;
	}

	public BankAccount(String ownerName, int accountNumber, float balance) {
		super();
		this.ownerName = ownerName;
		this.accountNumber = accountNumber;
		this.balance = balance;
	}

}
