/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oop;

/**
 *
 * @author steph
 */
public class Person {
    // Fields
    protected String firstName;
    protected String lastName;
    
    // Properties
    public String getFirstName() { return firstName; }
    public void setFirstName(String value) { firstName = value; }
    
    public String getLastName() { return lastName; }
    public void setLastName(String value) { lastName = value; }    
    
    // Constructors
    public Person()    // default Constructor (optional)
    {
        firstName = null;   // default value of a reference type is null
        lastName = null;
    }
    public Person(String _firstName, String _lastName)
    {
        firstName = _firstName;
        lastName = _lastName;
    }
    
    // Methods
    @Override
    public String toString() {
        return firstName + " " + lastName;
    }
}
