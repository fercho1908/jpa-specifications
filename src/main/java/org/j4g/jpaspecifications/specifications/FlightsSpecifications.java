package org.j4g.jpaspecifications.specifications;

import org.j4g.jpaspecifications.model.db.Flight;
import org.j4g.jpaspecifications.utils.Constants;
import org.springframework.data.jpa.domain.Specification;

public final class FlightsSpecifications {

    public static Specification<Flight> StatusEquals(String status) {
        return ((root, query, criteriaBuilder) -> criteriaBuilder.equal(root.get(Constants.FLIGHT_STATUS_FIELD), status));
    }

    public static Specification<Flight> FlightNumberEquals(String flightNo) {
        return ((root, query, criteriaBuilder) -> criteriaBuilder.equal(root.get(Constants.FLIGHT_NUMBER_FIELD), flightNo));
    }
}
