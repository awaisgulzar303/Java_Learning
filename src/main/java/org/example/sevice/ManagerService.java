package org.example.sevice;

public class ManagerService {
    CourseService courseService = new CourseService();
    StudentService studentService = new StudentService();
    TeacherService teacherService = new TeacherService();

    public CourseService getCourseService() {
        return courseService;
    }

    public StudentService getStudentService() {
        return studentService;
    }

    public TeacherService getTeacherService() {
        return teacherService;
    }
}
