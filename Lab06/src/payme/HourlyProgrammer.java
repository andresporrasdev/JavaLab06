/*
* Title Assessment: Lab06
* Student Name: Andres Camilo Porras Becerra
* Due Date: 19 Nov
* Description: This program shows polymorphism and interfaces by applying a method to objects of different classes. 
* Professor Name: Islam Gomaa
* Course CST8284 Section 331
*/
// THIS IS A CODE FILE FOR LAB 6. THIS CODE FILE REQUIRES SOME MODIFICATIONS!!!
package payme;

/**
 * HourlyProgrammer.java
 * HourlyProgrammer class extends Programmer.
 * @author AndresPorras
 */


public class HourlyProgrammer extends Programmer {
private double wage; // wage per hour
private double hours; // hours worked for week

//constructor
public HourlyProgrammer(String firstName, String lastName,
String socialSecurityNumber, int month, int year, 
double wage, double hours) {
super(firstName, lastName, socialSecurityNumber, month, year);

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
} 

//set wage
public void setWage(double wage) {
if (wage < 0.0) { // validate wage
  throw new IllegalArgumentException(
     "Hourly wage must be >= 0.0");
}

this.wage = wage;
} 

//return wage
public double getWage() {
return wage;
} 

//set hours worked
public void setHours(double hours) {
if ((hours < 0.0) || (hours > 168.0)) { // validate hours
  throw new IllegalArgumentException(
     "Hours worked must be >= 0.0 and <= 168.0");
}

this.hours = hours;
} 

//return hours worked
public double getHours() {
return hours;
} 

//calculate earnings; override abstract method earnings in Programmer

//MODIFY THIS PORTION. WHY WILL THIS PORTION OF YOUR CODE REQUIRE MODIFICATION?
//PROVIDE THE ANSWER TO THIS QUESTION TO YOUR PROFESSOR DURING DEMO
//Ans: Because earnings is a abstract method in programmer and should be implemented in subtypes classes
//Same for getPaymentAmount() as it comes from the interface payme that was implemented in Programmer class

@Override                                                           
public double earnings() {                                            
if (getHours() <= 40) { // no overtime                           
  return getWage() * getHours();   
}
else {                                                             
  return 40 * getWage() + (getHours() - 40) * getWage() * 1.5;
}
}

@Override
public double getPaymentAmount() {
	return earnings();
}                                          

//return String representation of HourlyProgrammer object              
@Override        
public String toString() {
return String.format("hourly Programmer:  %s %s\nsocial security number: %s:\nhourly wage: %.2f hours worked: %.2f\npayment due: %.2f\n", 
  getFirstName(), getLastName(), getSocialSecurityNumber(), getWage(), getHours(), getPaymentAmount());
}                                              
             
}

