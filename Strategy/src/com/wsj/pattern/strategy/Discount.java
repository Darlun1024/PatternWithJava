package com.wsj.pattern.strategy;

public class Discount implements CashCompute {

	private float rate;
	
	/**
	 * @param rate 打折比例
	 */
	public Discount(float rate){
		this.rate = rate;
	}
	
	@Override
	public float cash(float price) {
		return price*rate;
	}

}
