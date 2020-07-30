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
public class Principal extends Person {
    // Fields
    private String nickName;
    
    // Properties (get and set)
    public String getNickName() { return nickName; }
    public void setNickName(String value) { nickName = value; }
    
    // Constructors
    public Principal()    // default Constructor (optional)
    {
        super();    // call the parent class base constructor
        nickName = null;
    }
    public Principal(String _firstName, String _lastName, String _nickName)
    {
        super(_firstName, _lastName);   // call the parent class constructor
        nickName = _nickName;
    }

    // Methods
    @Override
    public String toString() {
        return super.toString() + " has the nick name " + nickName;
    }
}
