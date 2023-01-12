package com.chengran.payme;

/**
 * This is a subclass that extends the Programmer superclass. The user 
 * can input the first name, last name and social security number of the 
 * programmer. In addition, the user can input gross Sales, commission Rate 
 * and base Salary of the programmer.
 * @author Chengran Sun
 * @version 1.0
 * @since javac 11.0.15
 * @see Payme
 * @see Programmer
 * @see CommissionProgrammer
 */
public class BasePlusCommissionProgrammer extends CommissionProgrammer { 

	private double baseSalary; // base salary per week

	/**
	 * This is an constructor.
	 * @param firstName the first name of the programmer
	 * @param lastName the last name of the programmer
	 * @param socialSecurityNumber the social security number of the programmer
	 * @param grossSales the gross Sales of the programmer
	 * @param commissionRate the commission Rate of the programmer
	 * @param baseSalary the base Salary Rate of the programmer
	 */
	public BasePlusCommissionProgrammer(
			String firstName, String lastName, String socialSecurityNumber, 
			double grossSales, double commissionRate, double baseSalary) {
		
		super(firstName, lastName, socialSecurityNumber, grossSales, commissionRate);

		if (baseSalary < 0.0) { // validate baseSalary                  
			throw new IllegalArgumentException("Base salary must be >= 0.0");
		}

		this.baseSalary = baseSalary;
		super.setProgrammerType("base-plus commission programmer");
	}

	/**
	 * This method set the value of the baseSalary
	 * @param baseSalary the base Salary of the programmer
	 */
	public void setBaseSalary(double baseSalary) {
		if (baseSalary < 0.0) { // validate baseSalary                  
			throw new IllegalArgumentException("Base salary must be >= 0.0");
		}

		this.baseSalary = baseSalary;                
	} 

	/**
	 * This method get the value of the baseSalary
	 * @return baseSalary the base Salary of the programmer
	 */
	public double getBaseSalary() {
		return baseSalary;
	}

	/**
	 * This is an override method that calculate total earnings.
	 * @return total earnings of the programmer
	 */
	@Override                                                            
	public double getPaymentAmount() {                                             
		return getBaseSalary() + super.getPaymentAmount();                        
	} 

	/**
	 * This is an override method return String representation of 
	 * HourlyProgrammer object
	 * @return String representation of BasePlusCommissionProgrammer object
	 */
	@Override     
	public String toString() {
		return String.format("%s; %s: $%,.2f", 
				super.toString(),
				"base salary", getBaseSalary());
	}
}