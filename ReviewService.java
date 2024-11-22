package com.kurszeit.review.service;

import com.kurszeit.review.model.Review;
import com.kurszeit.review.repository.ReviewRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ReviewService {

    @Autowired
    private ReviewRepository reviewRepository;

    public Review addReview(Review review) {
        return reviewRepository.save(review);
    }

    public List<Review> getCourseReviews(Long courseId) {
        return reviewRepository.findByCourseId(courseId);
    }
}
