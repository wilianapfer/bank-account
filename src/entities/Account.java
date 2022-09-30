package entities;

public class Account {

	private int number;
	private String holder;
	private double balance;
	
	public Account() {
	}
	
	public Account(int number, String holder, double initialDeposit) {
		this.number = number;
		this.holder = holder;
		deposite(initialDeposit);
	}
	
	public Account(int number, String holder) {
		this.number = number;
		this.holder = holder;
	}


	public String getHolder() {
		return holder;
	}

	public void setHolder(String holder) {
		this.holder = holder;
	}

	public double getBalance() {
		return balance;
	}

	public int getNumber() {
		return number;
	}

	public void deposite(double amount) {
		this.balance += amount;
	}

	public void withdraw(double amount) {
		double taxa = 5.00;
		this.balance -= (amount + taxa);
	}

	public String toString() {
		return 	"Account "
				+ number
				+ ", Holder: "
				+ holder
				+ ", Balance: $ "
				+ String.format("%.2f%n", balance);
	}

	
}
