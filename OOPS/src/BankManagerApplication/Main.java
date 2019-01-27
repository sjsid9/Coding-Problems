package BankManagerApplication;

public class Main {
	public static void main(String[] args) {
		
		CheckingAccount checkingAccount = new CheckingAccount("1ca",5000);
		SavingsAccount savingsAccount = new SavingsAccount("1sa", 2000);
		COD cod = new COD("1cod",10000);
		
		System.out.println(cod.getBalance());
		System.out.println(savingsAccount.getBalance());
		System.out.println(checkingAccount.getBalance());
		
	}
}
