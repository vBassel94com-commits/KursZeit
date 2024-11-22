package com.kurszeit.enrollment.controller;

import com.kurszeit.enrollment.model.Enrollment;
import com.kurszeit.enrollment.service.EnrollmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/enrollments")
public class EnrollmentController {

    @Autowired
    private EnrollmentService enrollmentService;

    @PostMapping("/enroll")
    public Enrollment enrollUser(@RequestParam Long userId, @RequestParam Long courseId) {
        return enrollmentService.enrollUser(userId, courseId);
    }

    @GetMapping("/user/{userId}")
    public List<Enrollment> getUserEnrollments(@PathVariable Long userId) {
        return enrollmentService.getUserEnrollments(userId);
    }
}
