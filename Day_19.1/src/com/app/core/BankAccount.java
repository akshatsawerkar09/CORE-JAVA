package com.app.core;

import java.time.LocalDate;

import custom_exceptions.AccountHandlingException;

import static utils.BankValidationRules.validateBalance;

public class BankAccount {

	private int acctNo;
	private String customerName;
	private AcType acctType;
	private double balance;
	private LocalDate createdOn;

	public BankAccount(int acctNo, String customerName, AcType acctType, double balance, LocalDate createdOn) {
		super();
		this.acctNo = acctNo;
		this.customerName = customerName;
		this.acctType = acctType;
		this.balance = balance;
		this.createdOn = createdOn;
	}

	// getters
	public LocalDate getCreatedOn() {
		return createdOn;
	}

	public String getCustomerName() {
		return customerName;
	}

	public double getBalance() {
		return balance;
	}

	public AcType getAcctType() {
		return acctType;
	}

	@Override
	public String toString() {
		return "BankAccount [acctNo=" + acctNo + ", customerName=" + customerName + ", acctType=" + acctType
				+ ", balance=" + balance + ", createdOn=" + createdOn + "]";
	}

	// BL methods
	public void deposit(double amount) {
		this.balance += amount;
	}

	public void withdraw(double amount) throws AccountHandlingException {
		validateBalance(this.balance - amount);
		this.balance -= amount;
	}

	public void transferFunds(BankAccount dest, double amt) throws AccountHandlingException {
		this.withdraw(amt);
		dest.deposit(amt);
	}

	// apply interest
	public void applyInterest(double rate) {
		// period = 1yr
		double simpleIt = (balance * rate) / 100;
		deposit(simpleIt);
	}

}
