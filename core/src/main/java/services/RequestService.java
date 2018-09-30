package services;

import model.Pet;
import model.Request;
import model.User;
import org.joda.time.DateTime;
import util.Pair;

public interface RequestService {
    Request createRequest(User user, Pet pet, Pair<DateTime, DateTime> interval, String details);
}
