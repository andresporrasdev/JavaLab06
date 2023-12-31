/*
* Title Assessment: Lab06
* Student Name: Andres Camilo Porras Becerra
* Due Date: 19 Nov
* Description: This program shows polymorphism and interfaces by applying a method to objects of different classes. 
* Professor Name: Islam Gomaa
* Course CST8284 Section 331
*/
//Programmer.java
package payme;

/**
 * Programmer - This is an abstract superclass that IMPLEMENTS the Payme interface.
 *  @author AndresPorras
 */

public abstract class Programmer implements Payme {

private String firstName;
private String lastName;
private String socialSecurityNumber;
private int month;
private int year;

//three-argument constructor
public Programmer(String first, String last, String ssn) {
 firstName = first;
 lastName = last;
 socialSecurityNumber = ssn;
}

//five-argument method overloading constructor
public Programmer(String first, String last, String ssn, int month, int year) {
this(first, last, ssn);
month = this.month;
year = this.year;
}

/**
 * Get name of programmer
 * @return firstName Name of programmer
 */
public String getFirstName() {
	return firstName;
}

/**
 * Set name of programmer
 * @param firstName Name of programmer
 */
public void setFirstName(String firstName) {
	this.firstName = firstName;
}

/**
 * Get last name of programmer
 * @return lastName Return last name of programmer
 */
public String getLastName() {
	return lastName;
}

/**
 * Set last name programmer
 * @param lastName Last name programmer
 */
public void setLastName(String lastName) {
	this.lastName = lastName;
}

/**
 * Get social security Number
 * @return social security number of programmer
 */
public String getSocialSecurityNumber() {
	return socialSecurityNumber;
}

/**
 * Set social security number of programmer
 * @param socialSecurityNumber security number of programmer
 */
public void setSocialSecurityNumber(String socialSecurityNumber) {
	this.socialSecurityNumber = socialSecurityNumber;
}

/**
 * Get month of the payment
 * @return month of the payment
 */
public int getMonth() {
	return month;
}

/**
 * Set month of the payment
 * @param month month of the payment
 */
public void setMonth(int month) {
	this.month = month;
}

/**
 * Get year of the payment
 * @return year year of the payment
 */
public int getYear() {
	return year;
}

/**
 * Set year of the payment
 * @param year year of the payment
 */
public void setYear(int year) {
	this.year = year;
}

/**
 * String representation of Programmer object
 * @return string String representation of Programmer object
 */
@Override
public String toString() {
return String.format("%s %s\n%s: %s\n%s: %s", 
  getFirstName(), getLastName(), getSocialSecurityNumber());
} 

/**
 * Abstract earnings() method
 */
public abstract double earnings(); /** No implementation here. DO YOU KNOW WHY? What should this method be? Ans: Abstract*/
} 


