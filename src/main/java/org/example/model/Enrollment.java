package org.example.model;

public record Enrollment(
        String enrollmentId,
        String studentId,
        String teacherId,
        String courseId) {
}
