package com.chengran.payme;

/**
 * This is an interface class that has one abstract method getPaymentAmount.
 * @author Chengran Sun
 * @version 1.0
 * @since javac 11.0.15
 * @see Invoice
 * @see Programmer
 */
public interface Payme {
	
	/**
	 * This is an abstract method that calculates the total payment.
	 * @return calculate the total payment of objects
	 */
	public abstract double getPaymentAmount();
}