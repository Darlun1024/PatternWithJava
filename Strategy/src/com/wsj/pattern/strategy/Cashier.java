package com.wsj.pattern.strategy;

public class Cashier {

	CashCompute cashCompute;
	public Cashier(CashCompute cashCompute){
		this.cashCompute = cashCompute;
	}
	public void setCashCompute(CashCompute cashCompute){
		this.cashCompute=cashCompute;
	}
	
	public float cash(float price){
		return this.cashCompute.cash(price);
	}
}
