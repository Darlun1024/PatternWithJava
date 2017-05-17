package com.wsj.pattern.strategy;

public class StrategyTest {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Cashier cashier = new Cashier(new Normal());
		System.out.println(cashier.cash(300));
		cashier.setCashCompute(new ReturnCash(300.0f, 20f));
		System.out.println(cashier.cash(300));
		cashier.setCashCompute(new Discount(0.85f));
		System.out.println(cashier.cash(300));
	}
}
