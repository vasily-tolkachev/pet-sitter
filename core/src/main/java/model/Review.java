package model;

import enums.ReviewGrade;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Review extends AbstractEntity {
    Request request;
    Response response;
    ReviewGrade grade;
    String details;
    //required by JPA
    public Review() {
        super();
    }
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Review review = (Review) o;
        if (request != null ? !request.equals(review.request) : review.request != null) return false;
        if (response != null ? !response.equals(review.response) : review.response != null) return false;
        if (grade != review.grade) return false;
        return details != null ? details.equals(review.details) : review.details == null;
    }
    @Override
    public int hashCode() {
        int result = super.hashCode();
        result = 31 * result + (request != null ? request.hashCode() : 0);
        result = 31 * result + (response != null ? response.hashCode() : 0);
        result = 31 * result + (grade != null ? grade.hashCode() : 0);
        result = 31 * result + (details != null ? details.hashCode() : 0);
        return result;
    }
    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Review{");
        sb.append("id=").append(id);
        sb.append(", request=").append(request);
        sb.append(", response=").append(response);
        sb.append(", grade=").append(grade);
        sb.append(", details='").append(details).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
