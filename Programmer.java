package com.chengran.payme;

/**
 * This is an abstract superclass that implements the Payme interface. The user 
 * can input the first name, last name and social security number of the 
 * programmer.
 * @author Chengran Sun
 * @version 1.0
 * @since javac 11.0.15
 * @see Payme
 */
public abstract class Programmer implements Payme {

	private String programmerType = null;
	private String firstName;
	private String lastName;
	private String socialSecurityNumber;

	/**
	 * This is an constructor.
	 * @param first the first name of the programmer
	 * @param last the last name of the programmer
	 * @param ssn the social security number of the programmer
	 */
	public Programmer(String first, String last, String ssn) {
		
		firstName = first;
		lastName = last;
		socialSecurityNumber = ssn;
	}

	/**
	 * This method get the value of the first name
	 * @return firstName the first name of the programmer
	 */
	public String getFirstName() {
		return firstName;
	}
	
	/**
	 * This method get the value of the last name
	 * @return lastName the last name of the programmer
	 */
	public String getLastName() {
		return lastName;
	}
	
	/**
	 * This method get the value of the social security number
	 * @return socialSecurityNumber the social security number of the programmer
	 */
	public String getSocialSecurityNumber() {
		return socialSecurityNumber;
	}
	
	/**
	 * This method set the value of the programmer type
	 * @param type the type of the programmer
	 */
	public void setProgrammerType(String type) {
		this.programmerType = type;
	}
	
	/**
	 * This method get the value of the programmer type
	 * @return programmerType the type of the programmer
	 */
	public String getProgrammerType() {
		return programmerType;
	}
	
	/**
	 * This is an abstract method that calculates the total payment.
	 * @return calculate the total payment of objects
	 */
	public abstract double getPaymentAmount();

	/**
	 * This is an override method return String representation of Programmer object
	 * @return String representation of Programmer object
	 */
	@Override
	public String toString() {
		return String.format("%s: %s %s%n%s: %s", 
				getProgrammerType(), getFirstName(), getLastName(),
				"social security number", getSocialSecurityNumber());
	}

} 