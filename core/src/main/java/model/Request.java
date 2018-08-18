package model;

import enums.RequestStatus;
import lombok.Getter;
import lombok.Setter;
import lombok.experimental.FieldDefaults;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;

import static lombok.AccessLevel.PRIVATE;

@Getter
@Setter
@FieldDefaults(level = PRIVATE)
public class Request extends AbstractEntity {

    User user;
    Date startAt;
    Date endAt;
    RequestStatus requestStatus;
    Set<Pet> pets = new HashSet<>();
    String details;
    Set<Response> responses = new HashSet<>();

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;

        Request request = (Request) o;

        if (user != null ? !user.getId().equals(request.user.getId()) : request.user != null) return false;
        if (startAt != null ? !startAt.equals(request.startAt) : request.startAt != null) return false;
        if (endAt != null ? !endAt.equals(request.endAt) : request.endAt != null) return false;
        if (requestStatus != request.requestStatus) return false;
        return pets != null ? pets.equals(request.pets) : request.pets == null;

    }

    @Override
    public int hashCode() {
        int result = super.hashCode();
        result = 31 * result + (user != null ? user.hashCode() : 0);
        result = 31 * result + (startAt != null ? startAt.hashCode() : 0);
        result = 31 * result + (endAt != null ? endAt.hashCode() : 0);
        result = 31 * result + (requestStatus != null ? requestStatus.hashCode() : 0);
        result = 31 * result + (pets != null ? pets.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        return String.format("Request[id='%,.2f', user='%s', startAt='%s', requestStatus='%s', requestStatus='%s']",
                id, user == null ? "" : user.getId(), sdf.format(startAt), sdf.format(endAt), pets);
    }
}
