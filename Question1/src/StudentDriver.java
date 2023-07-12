/* Author: Nick Hortua
*  Project: CS 3560 Assignment 2 Question 1
*  Driver class for the required task from Question 1  */

import java.util.Scanner;

public class StudentDriver {
    public static void main(String[] args) {

        System.out.println("== Question 1 == \n");
        Scanner myScan = new Scanner(System.in);

        // we first create the student object that will require inputted parameters

        System.out.println("Creating a new student... \n");
        System.out.println("Please enter the student's name: ");
        String studentName = myScan.nextLine();
        System.out.println("\nPlease enter the student's major: ");
        String studentMajor = myScan.nextLine();
        System.out.println("\nPlease enter the student's GPA: ");
        double studentGPA = myScan.nextDouble();
        System.out.println("\n");

        Student student1 = new Student(studentName, studentMajor, studentGPA);

        // now the other student object with no args
        System.out.println("Creating a new student... \n");
        Student student2 = new Student();

        System.out.println(student1);
        System.out.println("\n" + student2 + "\n");

        System.out.println("Preparing to update... \n");
        // now we perform updates on both student objects with the following
        String newName1 = "Ferdinand";
        String newName2 = "Cynthia";
        String newMajor1 = "BIO";
        String newMajor2 = "ME";
        double newGPA1 = 3.3;
        double newGPA2 = 3.4;

        student1.setName(newName1);
        student1.setMajor(newMajor1);
        student1.setGpa(newGPA1);

        student2.setName(newName2);
        student2.setMajor(newMajor2);
        student2.setGpa(newGPA2);

        System.out.println(student1);
        System.out.println("\n" + student2);

    }
}