/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hw5;

/**
 *
 * @author steph
 */
class Account
{
    // Fields
    private static int s_accountNbr = 0;
    private final int accountNbr;
    private final String firstName;
    private final String lastName;

    // Properties
    public int getAccountNbr()
    {
        return accountNbr;
    }
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
        accountNbr = s_accountNbr++;
        firstName = _firstName;
        lastName = _lastName;
    }

    // Methods
    @Override
    public String toString()
    {
        return accountNbr + " " + firstName + " " + lastName;
    }    
}
