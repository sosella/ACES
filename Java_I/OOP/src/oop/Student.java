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
public class Student extends Person {
    // Fields
    private int grade;
    
    // Properties (get and set)
    public int getGrade() { return grade; }
    public void setGrade(int value) { grade = value; }
    
    // Constructors (method whose name is the class name, and has NO return type)
    // Can have as many constuctors as you want as long as their Signaure is different
    public Student()    // default Constructor (optional)
    {
        super();
        grade = 0;          // default value of an int is 0
    }
    public Student(String _firstName, String _lastName)
    {
        super(_firstName, _lastName);
        grade = 0;
    }
    
    // Methods
    public void print()
    {
        System.out.println(this);
    }

    @Override
    public String toString() {
        return super.toString() + " in grade " + grade;
    }
}
