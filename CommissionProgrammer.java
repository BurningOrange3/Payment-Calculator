package com.chengran.payme;

/**
 * This is a subclass that extends the Programmer superclass. The user 
 * can input the first name, last name and social security number of the 
 * programmer. In addition, the user can input gross Sales and commission Rate 
 * of the programmer.
 * @author Chengran Sun
 * @version 1.0
 * @since javac 11.0.15
 * @see Payme
 * @see Programmer
 */
public class CommissionProgrammer extends Programmer { 

	private double grossSales; // gross weekly sales
	private double commissionRate; // commission percentage

	/**
	 * This is an constructor.
	 * @param firstName the first name of the programmer
	 * @param lastName the last name of the programmer
	 * @param socialSecurityNumber the social security number of the programmer
	 * @param grossSales the gross Sales of the programmer
	 * @param commissionRate the commission Rate of the programmer
	 */
	public CommissionProgrammer(String firstName, String lastName, 
			String socialSecurityNumber, double grossSales, double commissionRate) {
		super(firstName, lastName, socialSecurityNumber);

		if (commissionRate <= 0.0 || commissionRate >= 1.0) { // validate 
			throw new IllegalArgumentException(
					"Commission rate must be > 0.0 and < 1.0");
		}

		if (grossSales < 0.0) { // validate
			throw new IllegalArgumentException("Gross sales must be >= 0.0");
		}

		this.grossSales = grossSales;
		this.commissionRate = commissionRate;
		super.setProgrammerType("commission programmer");
	} 

	/**
	 * This method set the value of the grossSales
	 * @param grossSales the gross Sales of the programmer
	 */
	public void setGrossSales(double grossSales) {
		if (grossSales < 0.0) { // validate
			throw new IllegalArgumentException("Gross sales must be >= 0.0");
		}

		this.grossSales = grossSales;
	} 

	/**
	 * This method get the value of the grossSales
	 * @return grossSales the gross Sales of the programmer
	 */
	public double getGrossSales() {
		return grossSales;
	} 

	/**
	 * This method set the value of the commissionRate
	 * @param commissionRate the commission Rate of the programmer
	 */
	public void setCommissionRate(double commissionRate) {
		if (commissionRate <= 0.0 || commissionRate >= 1.0) { // validate
			throw new IllegalArgumentException(
					"Commission rate must be > 0.0 and < 1.0");
		}

		this.commissionRate = commissionRate;
	} 

	/**
	 * This method get the value of the commissionRate
	 * @return commissionRate the commission Rate of the programmer
	 */
	public double getCommissionRate() {
		return commissionRate;
	} 

	/**
	 * This is an override method that calculate total earnings.
	 * @return total earnings of the programmer
	 */
	@Override
	public double getPaymentAmount() {                                            
		return getCommissionRate() * getGrossSales();                    
	}
	
	/**
	 * This is an override method return String representation of 
	 * HourlyProgrammer object
	 * @return String representation of CommissionProgrammer object
	 */
	@Override
	public String toString() {
		return String.format("%s%n%s: $%,.2f; %s: %.2f", 
				super.toString(),
				"gross sales", getGrossSales(), "commission rate", getCommissionRate());
	}
}