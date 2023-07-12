/* Author: Nick Hortua
 *  Project: CS 3560 Assignment 2 Question 1
 *  Implementation of Student class for the required task from Question 1  */
public class Student {

    String name;
    String major;
    double gpa;

    public Student(){
        name = "Mary Ann";
        major = "CE";
        gpa = 3.3;
    }

    public Student(String name, String major){
        this.name = name;
        this.major = major;
        gpa = 3.3; // setting it to the same value as the no-arg constructor for consistency

    }

    public Student(String name, String major, double gpa){
        this.name = name;
        this.major = major;
        this.gpa = gpa;
    }

    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name = name;
    }

    public String getMajor(){
        return major;
    }

    public void setMajor(String major){
        this.major = major;
    }

    public double getGpa(){
        return gpa;
    }

    public void setGpa(double gpa){
        this.gpa = gpa;
    }

    public String toString(){
        return "Name: " + name + ", Major: " + major + ", GPA: " + gpa;
    }

    public boolean equals(Object obj){
        if (name.equals(major))
           return true;

        else
            return false;
    }
}
