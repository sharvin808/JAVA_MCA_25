/*Create a class for a student having (sno, sname, sprogram) [example sno-1,sname-sanjay,sprogram-MCA]. Provide functions for reading and displaying the same information. Also provide a function for comparing two student objects for equality. */

import java.util.*;
import java.io.*;

class Student {
    int sno;
    String sname;
    String sprogram;
    public void read() {
        Scanner s = new Scanner(System.in);

        System.out.print("Enter Student Number: ");
        sno = s.nextInt();
        s.nextLine();
        System.out.print("Enter Student Name: ");
        sname = s.nextLine();
        System.out.print("Enter Student Program: ");
        sprogram = s.nextLine();
    }
    public void display() {
        System.out.println("Student Number : " + sno);
        System.out.println("Student Name   : " + sname);
        System.out.println("Student Program: " + sprogram);
    }

    public boolean compare(Student stu) {
        return this.sno == stu.sno &&
               this.sname.equals(stu.sname) &&
               this.sprogram.equals(stu.sprogram);
    }
}

public class Program_14{
    public static void main(String args[]) {

        Student s1 = new Student();
        Student s2 = new Student();

        System.out.println("Enter details of Student 1:");
        s1.read();
        System.out.println("\nEnter details of Student 2:");
        s2.read();
        System.out.println("\nDetails of Student 1:");
        s1.display();
        System.out.println("\nDetails of Student 2:");
        s2.display();
        System.out.println("\nComparing Students...");
        if (s1.compare(s2))
            System.out.println("Both students are SAME.");
        else
            System.out.println("Both students are DIFFERENT.");
    }
}

