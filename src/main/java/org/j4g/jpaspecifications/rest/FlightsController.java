package org.j4g.jpaspecifications.rest;

import org.j4g.jpaspecifications.model.db.Flight;
import org.j4g.jpaspecifications.service.FlightsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/flights/jpa")
public class FlightsController {

    @Autowired
    private FlightsService flightsService;

    @GetMapping
    public List<Flight> getFlights() {
        return flightsService.getAll();
    }

    @GetMapping("/{id}")
    public Flight getFlightById(@PathVariable Long id) throws Exception {
        return flightsService.getById(id);
    }
}
