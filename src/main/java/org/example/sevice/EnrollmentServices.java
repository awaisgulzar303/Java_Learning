package org.example.sevice;

import org.example.model.Course;
import org.example.model.EnrollCourses;

import java.util.ArrayList;
import java.util.List;

public class EnrollmentServices {

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


    public static List<EnrollCourses> enrollCourses(String enrollementID, String userId, String courseId, List<Course> courseList){
         EnrollCourses enrollCourse=new EnrollCourses(enrollementID,userId,courseId);
        List<EnrollCourses> listOfEnrollCourses=new ArrayList<>();
         if(courseIdCheck(courseList,courseId)){

         listOfEnrollCourses.add(enrollCourse);
         return listOfEnrollCourses;}else {
             return listOfEnrollCourses;
         }
    }

    public static Boolean courseIdCheck(List<Course> courseList,String courseId){
        return courseList.stream().anyMatch(n->n.getCourseId().equals(courseId));

    }
}



