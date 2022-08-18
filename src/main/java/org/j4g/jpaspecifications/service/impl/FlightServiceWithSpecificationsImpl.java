package org.j4g.jpaspecifications.service.impl;

import org.j4g.jpaspecifications.model.Filter;
import org.j4g.jpaspecifications.model.db.Flight;
import org.j4g.jpaspecifications.repositories.FlightsRepository;
import org.j4g.jpaspecifications.service.FlightServiceWithSpecifications;
import org.j4g.jpaspecifications.specifications.FlightsSpecifications;
import org.j4g.jpaspecifications.specifications.SpecificationFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.stereotype.Service;

import java.util.List;

@Service()
public class FlightServiceWithSpecificationsImpl implements FlightServiceWithSpecifications {

    @Autowired
    private FlightsRepository flightsRepository;

    @Autowired
    private SpecificationFactory<Flight> flightSpecificationFactory;

    @Override
    public List<Flight> getAll(String status, String flightNo) {

        Specification<Flight> flightSpecification = Specification.where(status != null ? FlightsSpecifications.StatusEquals(status) : null)
                    .and(flightNo != null ? FlightsSpecifications.FlightNumberEquals(flightNo) : null);

        return flightsRepository.findAll(flightSpecification);
    }

    @Override
    public List<Flight> getAll(List<Filter> filters) throws Exception {

        Specification<Flight> flightSpecification = Specification.
                where(flightSpecificationFactory.createSpecification(filters.remove(0)));

        for(Filter filter: filters){
            flightSpecification = flightSpecification.and(flightSpecificationFactory.createSpecification(filter));
        }

        return flightsRepository.findAll(flightSpecification);
    }
}
