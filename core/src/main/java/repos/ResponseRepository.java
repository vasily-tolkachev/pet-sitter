package repos;

import enums.RequestStatus;
import model.Response;
import model.User;

import java.util.Set;

public interface ResponseRepository extends AbstractRepo<Response> {
    Set<Response> findAllForUser(User user);

    Set<Response> findByStatus(RequestStatus status);
}
