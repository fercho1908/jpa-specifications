package org.j4g.jpaspecifications.service.impl;

import org.j4g.jpaspecifications.model.db.Flight;
import org.j4g.jpaspecifications.service.FlightsService;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service("JPA-Specifications")
public class FlightsServicesJPASpecificationsImpl implements FlightsService {
    @Override
    public List<Flight> getAll() {
        return new ArrayList<>();
    }

    @Override
    public Flight getById(Long id) {
        return null;
    }
}
