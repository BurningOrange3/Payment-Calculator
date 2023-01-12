package com.chengran.payme;

/**
 * This is a subclass that extends the Programmer superclass. The user 
 * can input the first name, last name and social security number of the 
 * programmer. In addition, the user can input wage and hours of the programmer.
 * @author Chengran Sun
 * @version 1.0
 * @since javac 11.0.15
 * @see Payme
 * @see Programmer
 */
public class HourlyProgrammer extends Programmer {
	
	private double wage; // wage per hour
	private double hours; // hours worked for week

	/**
	 * This is an constructor.
	 * @param firstName the first name of the programmer
	 * @param lastName the last name of the programmer
	 * @param socialSecurityNumber the social security number of the programmer
	 * @param wage the wage of the programmer
	 * @param hours the hours of the programmer
	 */
	public HourlyProgrammer(String firstName, String lastName,
			String socialSecurityNumber, double wage, double hours) {
		super(firstName, lastName, socialSecurityNumber);

		if (wage < 0.0) { // validate wage
			throw new IllegalArgumentException(
					"Hourly wage must be >= 0.0");
		}

		if ((hours < 0.0) || (hours > 168.0)) { // validate hours
			throw new IllegalArgumentException(
					"Hours worked must be >= 0.0 and <= 168.0");
		}

		this.wage = wage;
		this.hours = hours;
		super.setProgrammerType("hourly Programmer");
	} 

	/**
	 * This method set the value of the wage
	 * @param wage the wage of the programmer
	 */
	public void setWage(double wage) {
		if (wage < 0.0) { // validate wage
			throw new IllegalArgumentException(
					"Hourly wage must be >= 0.0");
		}

		this.wage = wage;
	} 

	/**
	 * This method get the value of the wage
	 * @return wage the wage of the programmer
	 */
	public double getWage() {
		return wage;
	} 

	/**
	 * This method set the value of the hours
	 * @param hours the hours of the programmer
	 */
	public void setHours(double hours) {
		if ((hours < 0.0) || (hours > 168.0)) { // validate hours
			throw new IllegalArgumentException(
					"Hours worked must be >= 0.0 and <= 168.0");
		}

		this.hours = hours;
	} 

	/**
	 * This method get the value of the hours
	 * @return hours the hours of the programmer
	 */
	public double getHours() {
		return hours;
	} 

	/**
	 * This is an override method that calculate total earnings.
	 * @return total earnings of the programmer
	 */
	@Override
	public double getPaymentAmount() {                                            
		if (getHours() <= 40) { // no overtime                           
			return getWage() * getHours();   
		}
		else {                                                             
			return 40 * getWage() + (getHours() - 40) * getWage() * 1.5;
		}
	}

	/**
	 * This is an override method return String representation of 
	 * HourlyProgrammer object
	 * @return String representation of Programmer object
	 */ 
	@Override
	public String toString() {
		return String.format("%s%n%s: $%,.2f; %s: %.2f", 
				super.toString(),
				"hourly wage", getWage(), "hours worked", getHours());
	}                 
}