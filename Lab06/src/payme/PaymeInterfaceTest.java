/*
* Title Assessment: Lab06
* Student Name: Andres Camilo Porras Becerra
* Due Date: 19 Nov
* Description: This program shows polymorphism and interfaces by applying a method to objects of different classes. 
* Professor Name: Islam Gomaa
* Course CST8284 Section 331
*/
package payme;

/**
 * This is the test for the interface Payme.
 * @arg args No arguments for main method
 * @author AndresPorras
 */
public class PaymeInterfaceTest  {

	public static void main(String[] args) {

	 //Creation of six elements for test the programmers classes
		Payme[] paymeObjects = new Payme[6];

	
	/*TO DO: POPULATE THE ARRAY YOU CREATED WITH OBJECTS THAT IMPLEMENT Payable
	*CHECK THE OUTPUT FILE AND REUSE EXACTLY THE DETAILS PROVIDED SUCH AS FIRST NAME
	*LAST NAME, SOCIAL INSURANCE NUMBER, ETC.
	*/
	 // START CODE
		paymeObjects[0] = new Invoice("22776","brakes", 3, 300);
		paymeObjects[1] = new Invoice("33442","gear", 5, 90.99);
		paymeObjects[2] = new SalariedProgrammer("Chioma" , "Chidimma", "345-67-0001", 11, 2023, 320);
		paymeObjects[3] = new HourlyProgrammer("Amara", "Chukwu", "234-56-7770", 11, 2023, 18.95, 40);
		paymeObjects[4] = new CommissionProgrammer("Peter", "Goodman", "123-45-6999", 11, 2023, 16500, 0.44);
		paymeObjects[5] = new BasePlusCommissionProgrammer("Esther", "Patel", "102-34-5888", 11, 2023, 1200, 0.04, 720);
	// END CODE
	
	
	 System.out.println(
	    "Payment for Invoices and Programmers are processed polymorphically:\n"); 
	
	 // generically process each element in array paymeObjects
	 
		 for (Payme currentPayme : paymeObjects) {
		    // output currentPayme and its appropriate payment amount
		    System.out.printf("%s \n", currentPayme.toString()); 
		       
		    if (currentPayme instanceof BasePlusCommissionProgrammer) {
		       // downcast Payme reference to 
		       // BasePlusCommissioProgrammer reference
		       BasePlusCommissionProgrammer programmer = 
		          (BasePlusCommissionProgrammer) currentPayme;
		
		       double oldBaseSalary = programmer.getBaseSalary();
		       programmer.setBaseSalary(1.10 * oldBaseSalary);
		       System.out.printf(
		          "new base salary with 10%% increase is: $%,.2f\n",
		          programmer.getBaseSalary());
		    	} 
		 	}
	}
}


