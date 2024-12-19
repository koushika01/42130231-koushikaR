package com.encapsulation;

class BankAccount{
	private int accountNumber;
	private int balance;
	private String accountHolder;
	
	BankAccount( int accountNumber, int balance,String accountHolder){
		this.setAccountNumber(accountNumber);
		this.setBalance(balance);
		this.setAccountHolder(accountHolder);
	}

	public int getAccountNumber() {
		return accountNumber;
	}

	public void setAccountNumber(int accountNumber) {
		this.accountNumber = accountNumber;
	}

	public int getBalance() {
		return balance;
	}

	public void setBalance(int balance) {
		this.balance = balance;
	}

	public String getAccountHolder() {
		return accountHolder;
	}

	public void setAccountHolder(String accountHolder) {
		this.accountHolder = accountHolder;
	}
	
	void deposit(int amnt){
		balance+=amnt;
		System.out.println("deposited successfully");
		System.out.println("current balance: "+ balance+"\n");
	}
	void withdraw(int amnt){
		balance-=amnt;
		System.out.println("withdrawn successfully");
		System.out.println("current balance: "+ balance);
	}
}

public class Account_management_system {

	public static void main(String[] args) {
	BankAccount c1=new BankAccount(98444462,200000,"koushika");
   c1.deposit(500);
   c1.withdraw(300);
   
	}

}
