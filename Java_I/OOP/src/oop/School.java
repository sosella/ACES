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
public class School
{
    // Fields
    private final String name;
    private Principal principal;    // reference to a Principal object
    private final LinkedList<SchoolYear> schoolYears;
    
    // Properties
    public String getName() { return name; }

    public Principal getPrincipal() { return principal; }
    public void setPrincipal(Principal _principal) { 
        principal = _principal;
    }
    
    // Constructors
    public School(String _name)
    {
        name = _name;
        principal = null;
        schoolYears = new LinkedList<>();
    }
    
    // Methods
    public void addSchoolYear(SchoolYear schoolYear)
    {
        schoolYears.add(schoolYear);
    }
    
    public void print()
    {
        System.out.println("Name: " + this);
        System.out.println("Principal: " + principal);
        System.out.println("The School Years are:");
        printSchoolYears();
    }

    private void printSchoolYears()
    {
        for (SchoolYear schoolYear : schoolYears)
        {
            schoolYear.print();
        }
    }

    @Override
    public String toString()
    {
        return name;
    }
}
