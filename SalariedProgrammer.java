package com.chengran.payme;

/**
 * This is a subclass that extends the Programmer superclass. The user 
 * can input the first name, last name and social security number of the 
 * programmer. In addition, the user can input weekly Salary of the programmer.
 * @author Chengran Sun
 * @version 1.0
 * @since javac 11.0.15
 * @see Payme
 * @see Programmer
 */
public class SalariedProgrammer extends Programmer {
	
	private double weeklySalary;

	/**
	 * This is an constructor.
	 * @param firstName the first name of the programmer
	 * @param lastName the last name of the programmer
	 * @param socialSecurityNumber the social security number of the programmer
	 * @param weeklySalary the weekly Salary of the programmer
	 */
	public SalariedProgrammer(String firstName, String lastName, 
			String socialSecurityNumber, double weeklySalary) {
		
		super(firstName, lastName, socialSecurityNumber);
		
		if (weeklySalary < 0.0) {
			throw new IllegalArgumentException("Weekly salary must be >= 0.0");
		}

		this.weeklySalary = weeklySalary;
		super.setProgrammerType("salaried Programmer");
	} 

	/**
	 * This method set the value of the weeklySalary
	 * @param weeklySalary the weekly Salary of the programmer
	 */
	public void setWeeklySalary(double weeklySalary) {
		if (weeklySalary < 0.0) {
			throw new IllegalArgumentException("Weekly salary must be >= 0.0");
		}

		this.weeklySalary = weeklySalary;
	} 

	/**
	 * This method get the value of the weeklySalary
	 * @return weeklySalary the weekly Salary of the programmer
	 */
	public double getWeeklySalary() {
		return weeklySalary;
	} 

	/**
	 * This an override method get the value of the weeklySalary
	 * @return getWeeklySalary the weekly Salary of the programmer
	 */
	@Override                                                           
	public double getPaymentAmount() {                                          
		return getWeeklySalary();
	}                                             

	/**
	 * This is an override method return String representation of 
	 * SalariedProgrammer object.
	 * @return String representation of Programmer object
	 */ 
	@Override        
	public String toString() {
		return String.format("%s%n%s: $%,.2f", 
				super.toString(),
				"weekly salary", getWeeklySalary());
	}
}