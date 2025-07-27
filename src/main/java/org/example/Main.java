package org.example;

import org.example.model.*;

import java.sql.SQLOutput;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

import static org.example.sevice.EnrollmentServices.filterById;


//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
   Student s1 =new Student("Awais",27,"Lahore","2121sds","A");
   Student s2=new Student("Bilal",27,"Lahore","2121sdsss","A");
   Student s3=new Student("Farhad",27,"Lahore","2121sxsds","A");


  Teacher t1=new Teacher("Waqas",33,"lahore","PF","eew222");
  Teacher t2=new Teacher("Aizaz",33,"lahore","OOP","eew232");
  Teacher t3=new Teacher("Waqas",33,"lahore","Math","eew2242");
  Teacher t4=new Teacher("Aizaz",33,"lahore","DSA","eew2232");




        Course c1=new Course("pf1","Programming Fundamental");
        Course c2=new Course("oop1","Object Oriented Programming");
        Course c3=new Course("dsa1","Data Structure");
        Course c4=new Course("math1","Math");



  List<Student> studentList= Arrays.asList(s1,s2,s3);
  List<Teacher> teachersList=Arrays.asList(t1,t2,t3,t4);
  List<Course> courseList = Arrays.asList(c1,c2,c3,c4);






  Univeristy u1=new Univeristy("UMT","Johar town",studentList,teachersList,courseList);

  System.out.println("Welcome to "+ u1.getName());


        Scanner scanner = new Scanner(System.in);
        int choice = 0;
        System.out.println("\n--- Menu ---");
        System.out.println("Press 1 to enroll courses as a Teacher");
        System.out.println("Press 2 to enroll courses as a Student");
        System.out.println("3. Exit");
        System.out.print("Enter your choice: ");
        while(choice!=3) {

            choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    System.out.println("Enter your Id to fetch your details");
                    String id = scanner.nextLine();
                    if (filterById(id,teachersList)){

                        System.out.println("Enroll subjects as a tecaher");

                    }
                    System.out.println("Press 1");
                    break;
                case 2:
                    System.out.println("You selected Option 2");
                    break;
                case 3:
                    System.out.println("Goodbye!");
                    break;
                default:
                    System.out.println("Invalid choice!");
            }
        } 
    }


}

