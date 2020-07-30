/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oop;

import java.util.LinkedList;

/**
 *
 * @author steph
 */
public class Teacher extends Person {
    // Fields
    private final LinkedList<String> subjects;
    private int yearsAtSchool;
    
    // Properties (get and set)
    public LinkedList<String> getSubjects() { return subjects; }
    
    public int getYearsAtSchool() { return yearsAtSchool; }
    public void setYearsAtSchool(int value) { yearsAtSchool = value; }
    
    // Constructors
    public Teacher()    // default Constructor (optional)
    {
        super();    // call the parent class base constructor
        subjects = new LinkedList<>();
        yearsAtSchool = 0;
    }
    public Teacher(String _firstName, String _lastName, int _yearsAtSchool)
    {
        super(_firstName, _lastName);   // call the parent class constructor
        subjects = new LinkedList<>();
        yearsAtSchool = _yearsAtSchool;
    }

    // Methods
    @Override
    public String toString() {
        return super.toString() + " has been at this school for " + yearsAtSchool + " years";
    }
}
