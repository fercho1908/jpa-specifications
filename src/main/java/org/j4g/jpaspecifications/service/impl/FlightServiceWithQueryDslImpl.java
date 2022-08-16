package org.j4g.jpaspecifications.service.impl;

import com.querydsl.core.types.dsl.BooleanExpression;
import org.j4g.jpaspecifications.model.db.Flight;
import org.j4g.jpaspecifications.model.db.QFlight;
import org.j4g.jpaspecifications.repositories.FlightsRepository;
import org.j4g.jpaspecifications.service.FlightServiceWithQueryDsl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FlightServiceWithQueryDslImpl implements FlightServiceWithQueryDsl {

    @Autowired
    private FlightsRepository flightsRepository;

    @Override
    public List<Flight> getAll(String status, String flightNo) {
        QFlight flight = QFlight.flight;

        BooleanExpression flightStatusExpression = status != null ? flight.status.eq(status) : null;
        BooleanExpression flightNumberExpression = flightNo != null ? flight.flightNumber.eq(flightNo) : null;

        return (List<Flight>) flightsRepository.findAll(flightStatusExpression.and(flightNumberExpression));
    }
}
