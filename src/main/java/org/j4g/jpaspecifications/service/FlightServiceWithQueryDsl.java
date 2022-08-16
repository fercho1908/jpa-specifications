package org.j4g.jpaspecifications.service;

import org.j4g.jpaspecifications.model.db.Flight;

import java.util.List;

public interface FlightServiceWithQueryDsl {

    public List<Flight> getAll(String status, String flightNo);
}
