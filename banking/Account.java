//Account.java
package banking;

public class Account {
	Person customer;
	private double balance;
	int accountNumber;
	
	static int NumberOfAccounts;
	
	public Account(Person customer) {
		this.customer = customer;
		this.balance = 0;
		NumberOfAccounts++;
		this.accountNumber = NumberOfAccounts;
	}
	
	public Person getCustomer() {
		return customer;
	}
	
	public double getBalance() {
		return balance;
	}
		
	public void setCustomer(Person customer) {
		this.customer = customer;
	}
	
	public void makeDeposit(double amount) {
		if (amount > 0) {
			this.balance = this.balance + amount;
		} else if (amount == 0){
			System.out.println("Can't deposit nothing.");
		} else {
			System.out.println("Can't deposit negatives.");
		}
	}
	
	public void drawMoney(double sum) {
		if ( sum > this.balance) {
		this.balance = this.balance - sum;
		} else {
			System.out.println("You don't have enough money to do this.");
		}
	}
	
	@Override
	public String toString() {		
		return String.format("Account %s: %.2f €", customer, balance);
	}
}
