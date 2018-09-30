package services;

import enums.ReviewGrade;
import model.Review;

public interface ReviewService {
    Review createReview(ReviewGrade grade, String details);
}
