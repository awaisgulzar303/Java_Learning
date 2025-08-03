package org.example.sevice;

import lombok.Getter;
import org.example.model.Course;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Getter
public class CourseService {
    private List<Course> courses = new ArrayList<>();

    public void createCourse(String courseId, String courseName) {
        courses.add(new Course(courseId, courseName));
    }

    public Optional<Course> getCourseById(String courseId) {
        /*Optional<String> string = Optional.of("courseId");
        Optional<String> stringNullable = Optional.ofNullable(courseId);*/
        return courses.stream()
                .filter(course -> course.courseId().equals(courseId))
                .findFirst();
    }
}
