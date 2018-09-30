package repos;

import enums.RequestStatus;
import model.Request;
import model.User;

import java.util.Set;

public interface RequestRepo extends AbstractRepo<Request> {
    Set<Request> findAllForUser(User user);

    Set<Request> findByStatus(RequestStatus status);
}
