package repos;

import model.Request;
import model.Response;
import model.Review;
import model.User;

import java.util.Set;

public interface ReviewRepo extends AbstractRepo<Review> {
    Set<Review> findAllForUser(User user);

    Set<Review> findAllForRequest(Request request);

    Set<Review> findAllForResponse(Response response);
}
