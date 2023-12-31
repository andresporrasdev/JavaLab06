/*
* Title Assessment: Lab06
* Student Name: Andres Camilo Porras Becerra
* Due Date: 19 Nov
* Description: This program shows polymorphism and interfaces by applying a method to objects of different classes. 
* Professor Name: Islam Gomaa
* Course CST8284 Section 331
*/
// THIS IS A CODE FILE FOR LAB 6. THIS CODE FILE REQUIRES SOME MODIFICATIONS!!!

//CommissionProgrammer.java
package payme;

/**
 * CommissionProgrammer class extends Programmer.
 * @author AndresPorras
 */
public class CommissionProgrammer extends Programmer { 

private double grossSales; // gross weekly sales
private double commissionRate; // commission percentage

//constructor
public CommissionProgrammer(String firstName, String lastName, 
String socialSecurityNumber, int month, int year, 
double grossSales, double commissionRate) {
super(firstName, lastName, socialSecurityNumber, month, year);

if (commissionRate <= 0.0 || commissionRate >= 1.0) { // validate 
  throw new IllegalArgumentException(
     "Commission rate must be > 0.0 and < 1.0");
}

if (grossSales < 0.0) { // validate
  throw new IllegalArgumentException("Gross sales must be >= 0.0");
}

this.grossSales = grossSales;
this.commissionRate = commissionRate;
} 

//set gross sales amount on the creation of apps
public void setGrossSales(double grossSales) {
if (grossSales < 0.0) { // validate
  throw new IllegalArgumentException("Gross sales must be >= 0.0");
}

this.grossSales = grossSales;
} 

//return gross sales amount 
public double getGrossSales() {
return grossSales;
} 

//set commission rate
public void setCommissionRate(double commissionRate) {
if (commissionRate <= 0.0 || commissionRate >= 1.0) { // validate
  throw new IllegalArgumentException(
     "Commission rate must be > 0.0 and < 1.0");
}

this.commissionRate = commissionRate;
} 

//return commission rate
public double getCommissionRate() {
return commissionRate;
} 

//calculate earnings; override abstract method earnings in Programmer.

//MODIFY THIS PORTION. WHY WILL THIS PORTION OF YOUR CODE REQUIRE MODIFICATION?
//PROVIDE THE ANSWER TO THIS QUESTION TO YOUR PROFESSOR DURING DEMO
//Ans: Because earnings is a abstract method in programmer and should be implemented in subtypes classes
//Same for getPaymentAmount() as it comes from the interface payme that was implemented in Programmer class

@Override                                                           
public double earnings() {                                            
return getCommissionRate() * getGrossSales();                    
}                                             

//return String representation of CommissionProgrammer object

@Override        
public String toString() {
return String.format("commission programmer:  %s %s\nsocial security number: %s\ngross sales: %.2f \ncommission rate: %.2f \npayment due: %.2f\n", 
  getFirstName(), getLastName(), getSocialSecurityNumber(), getGrossSales(), getCommissionRate(), earnings(), getPaymentAmount());
}

@Override
public double getPaymentAmount() {
	return earnings();
} 
                                             
}

