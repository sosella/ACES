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
public class ScienceTeacher extends Teacher
{
    // Fields
    private String scienceSubject;

    // Properties (get and set)
    public String getScienceSubject() {
        return scienceSubject;
    }
    public void setScienceSubject(String value) {
        scienceSubject = value;
    }

    // Constructors
    public ScienceTeacher()    // default constructor
    {
        super();            // call default constructor of parent class (Teacher)
        scienceSubject = null;
    }
    public ScienceTeacher(
        String _firstName, 
        String _lastName, 
        int _yearsAtSchool, 
        String _scienceSubject)
    {
        super(_firstName, _lastName, _yearsAtSchool);   // call parent constructor
        scienceSubject = _scienceSubject;
    }

    // Methods
    @Override
    public String toString() {
        return super.toString() + " and teaches " + scienceSubject;
    }
}
