package com.kurszeit.enrollment.service;

import com.kurszeit.enrollment.model.Enrollment;
import com.kurszeit.enrollment.repository.EnrollmentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EnrollmentService {

    @Autowired
    private EnrollmentRepository enrollmentRepository;

    public Enrollment enrollUser(Long userId, Long courseId) {
        Enrollment enrollment = new Enrollment();
        enrollment.setUserId(userId);
        enrollment.setCourseId(courseId);
        return enrollmentRepository.save(enrollment);
    }

    public List<Enrollment> getUserEnrollments(Long userId) {
        return enrollmentRepository.findByUserId(userId);
    }
}
