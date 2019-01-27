package BankManagerApplication;

public class BankAccount {

	private String account;

	public String getAccount() {
		return account;
	}

	public void setAccount(String account) {
		this.account = account;
	}

	public int getBalance() {
		return balance;
	}

	public void setBalance(int balance) {
		this.balance = balance;
	}

	private int balance;

	public BankAccount(String account, int balance) {
		super();
		this.account = account;
		this.balance = balance;
	}

}
