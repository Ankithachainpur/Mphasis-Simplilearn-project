package com.camerarental.bean.wallet;

public class Wallet {
	 private double balance;
	 public Wallet() {
	 this.balance = 0.0;
	 }
	 public double getBalance() {
	 return balance;
	 }
	 public void deposit(double amount) {
	 balance += amount;
	 }
	 public boolean withdraw(double amount) {
	 if (amount <= balance) {
	 balance =balance-amount;
	 return true;
	 }
	 return false;
	 }
	}
