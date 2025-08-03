package org.example.sevice;

import lombok.Getter;

@Getter
public class ManagerService {
    CourseService courseService = new CourseService();
    StudentService studentService = new StudentService();
    TeacherService teacherService = new TeacherService();
    ManagementService managementService = new ManagementService();
    EnrollmentService enrollmentService = new EnrollmentService();
}
