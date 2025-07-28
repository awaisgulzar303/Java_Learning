package org.example.sevice;

import org.example.model.CourseRecord;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class CourseService {
    private List<CourseRecord> courses = new ArrayList<>();

    public void createCourse(String courseId, String courseName) {
        courses.add(new CourseRecord(courseId, courseName));
    }

    public List<CourseRecord> getCourses() {
        return courses;
    }

    public Optional<CourseRecord> getCourseById(String courseId) {
        /*Optional<String> string = Optional.of("courseId");
        Optional<String> stringNullable = Optional.ofNullable(courseId);*/
        return courses.stream()
                .filter(course -> course.courseId().equals(courseId))
                .findFirst();
    }
}
