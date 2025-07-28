package org.example;

import org.example.model.CourseRecord;
import org.example.model.Student;
import org.example.model.Teacher;
import org.example.model.University;
import org.example.sevice.CourseService;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.Scanner;

import static org.example.sevice.EnrollmentService.filterById;


//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        CourseService courseService = new CourseService();
        Student s1 = new Student("Awais", 27, "Lahore", "2121sds", "A");
        Student s2 = new Student("Bilal", 27, "Lahore", "2121sdsss", "A");
        Student s3 = new Student("Farhad", 27, "Lahore", "2121sxsds", "A");


        Teacher t1 = new Teacher("Waqas", 33, "lahore", "PF", "eew222");
        Teacher t2 = new Teacher("Aizaz", 33, "lahore", "OOP", "eew232");
        Teacher t3 = new Teacher("Waqas", 33, "lahore", "Math", "eew2242");
        Teacher t4 = new Teacher("Aizaz", 33, "lahore", "DSA", "eew2232");

        List<Student> studentList = Arrays.asList(s1, s2, s3);
        List<Teacher> teachersList = Arrays.asList(t1, t2, t3, t4);


        University u1 = new University("UMT", "Johar town", studentList, teachersList, List.of());

        System.out.println("Welcome to " + u1.getName());


        Scanner scanner = new Scanner(System.in);
        int choice = 0;
        System.out.println("\n--- Menu ---");
        System.out.println("Press 1 to enroll courses as a Teacher");
        System.out.println("Press 2 to enroll courses as a Student");
        System.out.println("Press 3 to create courses");
        System.out.println("Press 4 to get all courses");
        System.out.println("Press 5 to get course by Id");
        System.out.println("6. Exit");
        System.out.print("Enter your choice: ");
        while (choice != 6) {
            choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    System.out.println("Enter your Id to fetch your details");
                    String id = scanner.nextLine();
                    if (filterById(id, teachersList)) {

                        System.out.println("Enroll subjects as a teacher");

                    }
                    System.out.println("Press 1");
                    break;
                case 2:
                    System.out.println("You selected Option 2");
                    break;
                case 3:
                    courseService.createCourse("pf1", "Programming Fundamental");
                    courseService.createCourse("oop1", "Object Oriented Programming");
                    courseService.createCourse("dsa1", "Data Structure");
                    courseService.createCourse("math1", "Math");
                    break;
                case 4:
                    System.out.println(courseService.getCourses());
                    break;
                case 5:
                    Optional<CourseRecord> courseRecordOptional = courseService.getCourseById("pf1");
                    if (courseRecordOptional.isPresent()) {
                        CourseRecord courseRecord = courseRecordOptional.get();
                        System.out.println("Course ID: " + courseRecord.courseId() + ", Course Name: " + courseRecord.courseName());
                    } else {
                        System.out.println("Course not found!");
                    }
                    break;
                case 6:
                    System.out.println("Goodbye!");
                    break;
                default:
                    System.out.println("Invalid choice!");
            }
        }
    }


}

