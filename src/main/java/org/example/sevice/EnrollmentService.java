package org.example.sevice;

import lombok.Getter;
import org.example.model.Enrollment;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Getter
public class EnrollmentService {
    private List<Enrollment> listOfEnrollCourses = new ArrayList<>();
    CourseService courseService = new CourseService();

    public void enrollCourses(String enrollementID, String studentId, String teacherId, String courseId) {
        if (courseService.getCourseById(courseId).isEmpty()) {
            return;
        }
        listOfEnrollCourses.add(new Enrollment(enrollementID, studentId, teacherId, courseId));
    }

    public Optional<Enrollment> getEnrollmentById(String enrollementID) {
        return listOfEnrollCourses.stream()
                .filter(enrollment -> enrollment.enrollmentId().equals(enrollementID))
                .findFirst();
    }

}



