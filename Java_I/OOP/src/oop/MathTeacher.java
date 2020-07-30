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
public class MathTeacher extends Teacher
{
    public enum MathSubjects { Algebra1, Algebra2, PreCalculus, Calculus1, Calculus2, Trigenometry };

    // Fields
    private String mathSubject;

    // Properties (get and set)
    public String getMathSubject() {
        return mathSubject;
    }
    public void setMathSubject(String value) {
        mathSubject = value;
    }

    // Constructors (initialize object)
    public MathTeacher()    // default constructor
    {
        super();            // call default constructor of parent class (Teacher)
        mathSubject = null;
    }
    public MathTeacher(
        String _firstName, 
        String _lastName, 
        int _yearsAtSchool, 
        String _mathSubject)
    {
        super(_firstName, _lastName, _yearsAtSchool);   // call parent constructor
        mathSubject = _mathSubject;
    }

    // Methods
    @Override
    public String toString() {
        return super.toString() + ((mathSubject != null) ? (" teaches " + mathSubject) : " has not been assigned to teach a subject");
    }
}
