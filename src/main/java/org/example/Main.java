package org.example;

import org.example.model.University;
import org.example.sevice.ManagerService;

import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        ManagerService managerService = new ManagerService();
        University u1 = new University("UMT", "Johar town", managerService.getStudentService().getStudents(), managerService.getTeacherService().getTeachers());
        System.out.println("Welcome to " + u1.name());


        Scanner scanner = new Scanner(System.in);
        int choice = 0;

        do {
            System.out.println("\n--- Menu ---");
            System.out.println("Press 1 to add teacher");
            System.out.println("Press 2 to add student");
            System.out.println("Press 3 to add courses");
            System.out.println("Press 4 to get all courses");
            System.out.println("Press 5 to enroll a course");
            System.out.println("6. Exit");
            System.out.print("Enter your choice: ");

            choice = scanner.nextInt();
            scanner.nextLine();
            String id;
            int temp = 0;
            switch (choice) {
                case 1:
                    System.out.println("Enter Id of the teacher:");
                    id = scanner.nextLine();
                    do {
                        if (managerService.getTeacherService().getTeacherById(id).isPresent()) {
                            System.out.println("Teacher with the given ID already exists.");
                        } else {
                            System.out.println("Enter your name:");
                            String name = scanner.nextLine();
                            System.out.println("Enter your subject:");
                            String subject = scanner.nextLine();
                            System.out.println("Enter your department:");
                            String department = scanner.nextLine();
                            System.out.println("Enter your age:");
                            int age = scanner.nextInt();
                            System.out.println("Enter your address:");
                            String address = scanner.nextLine();
                            scanner.nextLine();
                            managerService.getTeacherService().addTeacher(name, department, age, address, id, department);
                            System.out.println("Teacher added successfully!");
                            System.out.println("Press 1 to add another teacher or any other key to exit");
                            id = null;
                            temp = scanner.nextInt();
                            scanner.nextLine();

                        }
                    } while (temp == 1);
                    break;
                case 2:
                    System.out.println("Enter Id for the student:");
                    id = scanner.nextLine();
                    do {

                        if (managerService.getStudentService().getStudentById(id).isPresent()) {
                            System.out.println("Student with the given ID already exists.");
                        } else {
                            System.out.println("Enter your name:");
                            String name = scanner.nextLine();
                            System.out.println("Enter your age:");
                            int age = scanner.nextInt();
                            System.out.println("Enter your address:");
                            String address = scanner.nextLine();
                            scanner.nextLine();
                            managerService.getStudentService().createStudent(name, age, address, id);
                            System.out.println("Student added successfully!");
                            System.out.println("Press 1 to add another student or any other key to exit");
                            temp = scanner.nextInt();
                            scanner.nextLine();
                            id = null;
                        }
                    } while (temp == 1);
                    break;

                case 3:
                    System.out.println("Enter Course ID:");
                    id = scanner.nextLine();
                    do {

                        if (managerService.getCourseService().getCourseById(id).isPresent()) {
                            System.out.println("Course with the given ID already exists.");
                        } else {
                            System.out.println("Enter Course Name:");
                            String courseName = scanner.nextLine();
                            managerService.getCourseService().createCourse(id, courseName);
                            System.out.println("Course added successfully!");
                            System.out.println("Press 1 to add another course or any other key to exit");
                            temp = scanner.nextInt();
                            id = null;
                        }
                    } while (temp == 1);
                    break;

                case 4:
                    System.out.println(managerService.getCourseService().getCourses());
                    break;
                case 5:
                    System.out.println("Enter Enrollment ID:");
                    id = scanner.nextLine();
                    do {
                        System.out.println("Enter user ID:");
                        String userId = scanner.nextLine();
                        System.out.println("Enter Course ID:");
                        String courseId = scanner.nextLine();
                        System.out.println("Press 1 to enroll more courses:");
                        temp = scanner.nextInt();
                        scanner.nextLine();
                        id = null;
                    } while (temp == 1);
                    break;
                case 6:
                    System.out.println("Goodbye!");

                default:
                    System.out.println("Invalid choice!");
            }
        } while (choice != 6);
    }


}

