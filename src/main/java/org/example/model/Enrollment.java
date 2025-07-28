package org.example.model;

public class Enrollment {
    private String enrollmentId;
    private String userId;
    private String courseId;

    public Enrollment(String enrollmentId, String userId, String courseId) {
        this.enrollmentId = enrollmentId;
        this.userId = userId;
        this.courseId = courseId;
    }

    public String getEnrollmentId() {
        return enrollmentId;
    }

    public void setEnrollmentId(String enrollmentId) {
        this.enrollmentId = enrollmentId;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getCourseId() {
        return courseId;
    }

    public void setCourseId(String courseId) {
        this.courseId = courseId;
    }
}
