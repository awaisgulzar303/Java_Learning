package org.example.sevice;

import org.example.model.CourseRecord;
import org.example.model.Enrollment;

import java.util.ArrayList;
import java.util.List;

public class EnrollmentService {

    public static <T> boolean filterById(String id, List<T> list) {
        return list.stream().anyMatch(item -> {
            try {
                // Use reflection to get getId() method dynamically
                return item.getClass().getMethod("getId").invoke(item).equals(id);
            } catch (Exception e) {
                e.printStackTrace();
                return false;
            }
        });
    }


    public static List<Enrollment> enrollCourses(String enrollementID, String userId, String courseId, List<CourseRecord> courseList) {
        if (!courseIdCheck(courseList, courseId)) {
            return List.of();
        }
        Enrollment enrollCourse = new Enrollment(enrollementID, userId, courseId);
        List<Enrollment> listOfEnrollCourses = new ArrayList<>();
        listOfEnrollCourses.add(enrollCourse);
        return listOfEnrollCourses;
    }

    public static Boolean courseIdCheck(List<CourseRecord> courseList, String courseId) {
        return courseList.stream().anyMatch(n -> n.courseId().equals(courseId));

    }
}



