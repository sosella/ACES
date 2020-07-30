/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oop;

import java.util.HashSet;
import java.util.Set;

/**
 *
 * @author steph
 */
public class OOP {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int n = 0;  // allocated on the Stack (goes away when function terminates)
        // I created (allocated memory for) a Student object, 
        // and assigned a reference to that object to the variable student
        // Allocate memory for the Student object, and call its constructor
        Student student1 = new Student("John", "Doe");    // allocated on the Heap (goes away when there are no longer any references to the object)
        //student1.setFirstName("John");
        //student1.setLastName("Doe");
        //System.out.println(student1.toString());
        student1.setGrade(9);
        
        Student student2 = new Student("Mary", "Poppins");
        //student2.setFirstName("Mary");
        //student2.setLastName("Poppins");        
        //System.out.println(student2.toString());
        student2.setGrade(10);

        Student student3 = new Student("Frank", "Herbert");
        //System.out.println(student3.toString());
        student3.setGrade(11);

        Teacher teacher1 = new Teacher("Paul", "Roberts", 5);
        //System.out.println(teacher1.toString());

        MathTeacher mathTeacher1 = new MathTeacher("Roger", "Smith", 3, "Algebra");
        //System.out.println(mathTeacher1.toString());

        ScienceTeacher scienceTeacher1 = new ScienceTeacher("Sally", "Ride", 7, "Cosmology");
        //System.out.println(scienceTeacher1.toString());

        Principal principal = new Principal("Julia", "Childs", "Meanie");
        //System.out.println(principal.toString());

        School school = new School("Anderson High School");
        school.setPrincipal(principal);

        school.addSchoolYear(new SchoolYear("2016"));
        school.addSchoolYear(new SchoolYear("2017"));
        SchoolYear schoolYear2018 = new SchoolYear("2018");
        school.addSchoolYear(schoolYear2018);

        Semester fallSemester = new Semester(schoolYear2018, Semester.Semesters.FALL);
        schoolYear2018.setFallSemester(fallSemester);
        Semester springSemester = new Semester(schoolYear2018, Semester.Semesters.SPRING);
        schoolYear2018.setSpringSemester(springSemester);

        Class english = new Class("English");
        fallSemester.addClass(english);
        english.setTeacher(teacher1);
        english.addStudent(student1);

        Class algebra = new Class("Algebra");
        fallSemester.addClass(algebra);
        algebra.setTeacher(mathTeacher1);
        algebra.addStudent(student2);

        Class biology = new Class("Biology");
        fallSemester.addClass(biology);
        biology.setTeacher(scienceTeacher1);
        biology.addStudent(student3);

        school.print();
    }
}
