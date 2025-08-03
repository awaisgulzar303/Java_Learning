package org.example.sevice;

import org.example.model.Course;
import org.example.model.Enrollment;

import java.util.ArrayList;
import java.util.List;


public class EnrollmentService {
    CourseService courseService = new CourseService();

    public List<Enrollment> enrollCourses(String enrollementID, String userId, String courseId, List<Course> courseList) {
        if (courseService.getCourseById(courseId).isEmpty()) {
            return List.of();
        }
        Enrollment enrollCourse = new Enrollment(enrollementID, userId, courseId);
        List<Enrollment> listOfEnrollCourses = new ArrayList<>();
        listOfEnrollCourses.add(enrollCourse);
        return listOfEnrollCourses;
    }


}



