package model;

import enums.ResponseStatus;
import lombok.Getter;
import lombok.Setter;
import lombok.experimental.FieldDefaults;

import static lombok.AccessLevel.PRIVATE;

@Getter
@Setter
@FieldDefaults(level = PRIVATE)
public class Response extends AbstractEntity {

    User user;
    Request request;
    ResponseStatus responseStatus;
    String details;

    //required by JPA
    public Response() {
        super();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;

        Response response = (Response) o;

        if (user != null ? !user.getId().equals(response.user.getId()) : response.user != null) return false;
        if (request != null ? !request.getId().equals(response.request.getId()) : response.request != null) return false;
        return responseStatus == response.responseStatus;

    }

    @Override
    public int hashCode() {
        int result = super.hashCode();
        result = 31 * result + (user != null ? user.hashCode() : 0);
        result = 31 * result + (request != null ? request.hashCode() : 0);
        result = 31 * result + (responseStatus != null ? responseStatus.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return String.format("Request[id='%,.2f', user='%s', request='%s', responseStatus='%s']",
                id, user == null ? "" : user.getId(), request == null ? "" : request.getId(), responseStatus);
    }
}
