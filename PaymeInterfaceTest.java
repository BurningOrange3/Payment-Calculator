package com.chengran.payme;

/**
 * This is a test class with main method that instantiate the Invoice and 
 * Programmer class. Put the instantiates objects in a array then print them one
 * by one.
 * @author Chengran Sun
 * @version 1.0
 * @since javac 11.0.15
 * @see Payme
 * @see Invoice
 * @see Programmer
 */
public class PaymeInterfaceTest {

	/**
	 * This is a main method that instantiate the Invoice and Programmer class. 
	 * Put the instantiates objects in a array then print them one by one.
	 * @param args arguments passed from command line
	 */
	public static void main(String[] args) {
		
		// Create an array then put the instantiates in it.
		Payme[] paymeObjects = new Payme[6];
	
		paymeObjects[0] = new Invoice("22776", "brakes", 3, 300.00);
		paymeObjects[1] = new Invoice("33442", "gear", 5, 90.99);
		paymeObjects[2] = new SalariedProgrammer("Chioma", "Chidimma", "345-67-0001", 320.00);
		paymeObjects[3] = new HourlyProgrammer("Amara", "Chukwu", "234-56-7770", 18.95, 40.00);
		paymeObjects[4] = new CommissionProgrammer("Peter", "Goodman", "123-45-6999", 16500.00, 0.44);
		paymeObjects[5] = new BasePlusCommissionProgrammer("Chengran", "Sun", "102-34-5888", 1200.00, 0.04, 720.00);

		// print the head message
		System.out.println(
				"Payment for Invoices and Programmers are processed polymorphically:\n");

		// generically process each element in array paymeObjects
		for (Payme currentPayme : paymeObjects) {
			
			// output currentPayme and its appropriate payment amount
			System.out.printf("%s %n", currentPayme.toString());
			
			// append a special content in the end of BasePlusCommissionProgrammer Object
			if (currentPayme instanceof BasePlusCommissionProgrammer) {
				
				BasePlusCommissionProgrammer programmer = 
						(BasePlusCommissionProgrammer) currentPayme;

				double oldBaseSalary = programmer.getBaseSalary();
				programmer.setBaseSalary(1.10 * oldBaseSalary);
				
				System.out.printf(
						"new base salary with 10%% increase is: $%,.2f%n",
						programmer.getBaseSalary());
			} // end if statement
			
			//append a payment due amount in the end of each paymeObjects
			System.out.printf(
					"%s: $%,.2f%n%n",
					"payment due", currentPayme.getPaymentAmount());
			
		} // end of for loop
		
	} // end of main method
	
} // end of this class 