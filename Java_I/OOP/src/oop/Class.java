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
public class Class {
    // Fields
    private final String title;
    private Teacher teacher;
    private final LinkedList<Student> students;
    
    // Properties
    public String getTitle() { return title; }

    public Teacher getTeacher() { return teacher; }
    public void setTeacher(Teacher _teacher) {
        teacher = _teacher;
    }

    public LinkedList<Student> getStudents() { return students; }
    
    // Constructors
    public Class(String _title)
    {
        title = _title;
        students = new LinkedList<>();
    }
    
    // Methods
    public void addStudent(Student student) {
        students.add(student);
    }

    public void print()
    {
        System.out.println(this);
        printStudents();
    }

    private void printStudents()
    {
        System.out.println("Students");
        for (Student student : students)
        {
            student.print();
        }
    }

    @Override
    public String toString()
    {
        return title;
    }
}
