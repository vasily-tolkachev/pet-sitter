package model;

import enums.UserType;
import lombok.Getter;
import lombok.Setter;

import java.util.HashSet;
import java.util.Set;

@Getter
@Setter
public class User extends AbstractEntity {
    /**
     * username = email
     */
    private String username;
    private String firstName;
    private String lastName;
    private String password;
    private UserType userType;
    private String address;
    private String email;
    /***
     * Rating for a used is computed from reviews for a user
     */
    private Double rating;
    private Set<Pet> pets = new HashSet<>();
    private Set<Request> requests = new HashSet<>();
    private Set<Response> responses = new HashSet<>();
    private boolean active;

    //required by JPA
    public User() {
        super();
    }

    public boolean addPet(Pet pet) {
        pet.setOwner(this);
        return pets.add(pet);
    }

    public boolean addRequest(Request request) {
        request.setUser(this);
        return requests.add(request);
    }

    public boolean addResponse(Response response) {
        response.setUser(this);
        return responses.add(response);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        User user = (User) o;
        if (username != null ? !username.equals(user.username) : user.username != null) return false;
        return userType == user.userType;
    }

    @Override
    public int hashCode() {
        int result = super.hashCode();
        result = 31 * result + (username != null ? username.hashCode() : 0);
        result = 31 * result + (userType != null ? userType.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("User{");
        sb.append("id=").append(id);
        sb.append(", username='").append(username).append('\'');
        sb.append(", firstName='").append(firstName).append('\'');
        sb.append(", lastName='").append(lastName).append('\'');
        sb.append(", password='").append(password).append('\'');
        sb.append(", userType=").append(userType);
        sb.append(", address='").append(address).append('\'');
        sb.append(", email='").append(email).append('\'');
        sb.append(", rating=").append(rating);
        sb.append(", pets=").append(pets);
        sb.append(", requests=").append(requests);
        sb.append(", responses=").append(responses);
        sb.append(", active=").append(active);
        sb.append('}');
        return sb.toString();
    }
}