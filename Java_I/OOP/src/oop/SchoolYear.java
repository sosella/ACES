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
public class SchoolYear {
    // Fields
    private final String year;
    private Semester fallSemester;
    private Semester springSemester;
    
    // Properties
    public String getYear() { return year; }

    public Semester getFallSemester() { return fallSemester; }
    public void setFallSemester(Semester value) {
        fallSemester = value;
    }
    
    public Semester getSpringSemester() { return springSemester; }
    public void setSpringSemester(Semester value) {
        springSemester = value;
    }
    
    // Constructors
    public SchoolYear(String _year)
    {
        year = _year;
    }
    
    // Methods
    public void print()
    {
        System.out.println("School Year: " + this);
        if (fallSemester != null)
        {
            fallSemester.print();
        }
        if (springSemester != null)
        {
            springSemester.print();
        }
    }

    @Override
    public String toString()
    {
        return year;
    }
}
