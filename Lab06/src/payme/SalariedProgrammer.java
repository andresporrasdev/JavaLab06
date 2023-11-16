/*
* Title Assessment: Lab06
* Student Name: Andres Camilo Porras Becerra
* Due Date: 19 Nov
* Description: This program shows polymorphism and interfaces by applying a method to objects of different classes. 
* Professor Name: Islam Gomaa
* Course CST8284 Section 331
*/
// THIS IS A CODE FILE FOR LAB 6. THIS CODE FILE REQUIRES SOME MODIFICATIONS!!!

//SalariedProgrammer.java
//SalariedProgrammer concrete class extends abstract class Programmer.
package payme;

/**
 * SalariedProgrammer concrete class extends abstract class Programmer
 * @author AndresPorras
 */
public class SalariedProgrammer extends Programmer  {

// Variable for store the Weekly salary of the programmer
private double weeklySalary;

//constructor
public SalariedProgrammer(String firstName, String lastName, 
String socialSecurityNumber, int month, int year, 
double weeklySalary) {
super(firstName, lastName, socialSecurityNumber, month, year); 

if (weeklySalary < 0.0) {
  throw new IllegalArgumentException(
     "Weekly salary must be >= 0.0");
}

this.weeklySalary = weeklySalary;
} 

//set salary
public void setWeeklySalary(double weeklySalary) {
if (weeklySalary < 0.0) {
  throw new IllegalArgumentException(
     "Weekly salary must be >= 0.0");
}

this.weeklySalary = weeklySalary;
} 

//return salary
public double getWeeklySalary() {
return weeklySalary;
} 

//calculate earnings; override abstract method earnings in Programmer

//MODIFY THIS PORTION. WHY WILL THIS PORTION OF YOUR CODE REQUIRE MODIFICATION?
//PROVIDE THE ANSWER TO THIS QUESTION TO YOUR PROFESSOR DURING DEMO
//Ans: Because earnings is a abstract method in programmer and should be implemented in subtypes classes
//Same for getPaymentAmount() as it comes from the interface payme that was implemented in Programmer class


@Override                                                           
public double earnings() {                                          
return getWeeklySalary();                                        
}

@Override
public double getPaymentAmount() {
	return getWeeklySalary();
}                                             
/**
 * Return a string representation of SalariedProgrammer object 
 * @return string String representation of SalariedProgrammer object   

 */
@Override        
public String toString() {
return String.format("salaried Programmer: %s %s\nsocial security number: %s:\nweekly salary:%.2f: \npayment due: %.2f\n", 
  getFirstName(), getLastName(), getSocialSecurityNumber(), earnings(), getPaymentAmount());
} 

}

