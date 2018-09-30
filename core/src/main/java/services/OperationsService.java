package services;

import model.Response;
import model.User;
import repos.RequestRepo;
import repos.ResponseRepo;
import repos.ReviewRepo;
import repos.UserRepo;

public interface OperationsService {
    Response createResponse(Long sitterId, Long RequestId);

    void acceptResponse(Long requestId, Long responseId);

    User closeRequest(Long requestId, Long reviewId);

    User rateOwner(Long requestId, Long reviewId);

    void setRequestRepo(RequestRepo requestRepo);

    void setUserRepo(UserRepo userRepo);

    void setResponseRepo(ResponseRepo responseRepo);

    void setReviewRepo(ReviewRepo reviewRepo);
}
