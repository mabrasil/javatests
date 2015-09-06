package bank;

public class Bank {
	public void deposit(Account account, int total){
		account.setBalance(account.getBalance() + total);
		System.out.println("Deposit Succeeded");
	}
	
	public void take(Account account, int total){
		account.setBalance(account.getBalance() - total);
	}
	
	public void transfer(Account account, Account account2, int total){
		take(account, total);
		deposit(account2, total);
	}
	
	
}
