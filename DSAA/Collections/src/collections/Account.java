/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package collections;

/**
 *
 * @author steph
 */
public class Account
{
    // Fields
    private final String firstName;
    private final String lastName;

    // Properties
    public String getFirstName()
    {
        return firstName;
    }
    public String getLastName()
    {
        return lastName;
    }
    
    // Constructors
    public Account (String _firstName, String _lastName)
    {
        firstName = _firstName;
        lastName = _lastName;
    }

    // Methods
    @Override
    public String toString()
    {
        return firstName + " " + lastName;
    }
}
