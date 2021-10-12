package entities.concretes;

import entities.abstracts.Entity;

public class BankAccount implements Entity {
	private int balance;
	private int previousTransaction;
	private String customerName;
	private String customerId;
	
	public BankAccount() { }
	
	public BankAccount(String customerName, String customerId) {
		this.customerName = customerName;
		this.customerId = customerId;
	}

	
	public int getBalance() {
		return balance;
	}

	public void setBalance(int balance) {
		this.balance = balance;
	}

	public int getPreviousTransaction() {
		return previousTransaction;
	}

	public void setPreviousTransaction(int previousTransaction) {
		this.previousTransaction = previousTransaction;
	}

	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	public String getCustomerId() {
		return customerId;
	}

	public void setCustomerId(String customerId) {
		this.customerId = customerId;
	}

}
