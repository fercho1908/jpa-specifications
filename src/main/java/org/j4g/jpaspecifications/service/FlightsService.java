package org.j4g.jpaspecifications.service;

import org.j4g.jpaspecifications.model.db.Flight;
import org.springframework.stereotype.Service;

import java.util.List;

public interface FlightsService {

    public List<Flight> getAll();

    public Flight getById(Long id) throws Exception;
}
