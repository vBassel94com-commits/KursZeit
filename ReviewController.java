package com.kurszeit.review.controller;

import com.kurszeit.review.model.Review;
import com.kurszeit.review.service.ReviewService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/reviews")
public class ReviewController {

    @Autowired
    private ReviewService reviewService;

    @PostMapping("/add")
    public Review addReview(@RequestBody Review review) {
        return reviewService.addReview(review);
    }

    @GetMapping("/course/{courseId}")
    public List<Review> getCourseReviews(@PathVariable Long courseId) {
        return reviewService.getCourseReviews(courseId);
    }
}
