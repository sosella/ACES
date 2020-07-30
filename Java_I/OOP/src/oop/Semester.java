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
public class Semester
{
    public enum Semesters { FALL, SPRING }
    
    // Fields
    private final SchoolYear schoolYear;
    private final Semesters season;
    private final LinkedList<Class> classes;
    
    // Properties
    public SchoolYear getSchoolYear() { return schoolYear; }
    
    public Semesters getSeason() { return season; }
    public LinkedList<Class> getClasses() { return classes; }
    
    // Constructors
    public Semester(SchoolYear _schoolYear, Semesters _season)
    {
        schoolYear = _schoolYear;
        season = _season;
        classes = new LinkedList<>();
    }
    
    // Methods
    public void addClass(Class aClass) {
        classes.add(aClass);
    }

    public void print()
    {
        System.out.println(this);
        printClasses();
    }

    private void printClasses() {
        System.out.println("Classes:");
        for (Class aClass : classes) {
            aClass.print();
        }
    }

    @Override
    public String toString() {
        return schoolYear + " " + season.toString();
    }
}
