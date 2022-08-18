package org.j4g.jpaspecifications.rest;

import org.j4g.jpaspecifications.model.Filter;
import org.j4g.jpaspecifications.model.db.Flight;
import org.j4g.jpaspecifications.service.FlightServiceWithSpecifications;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/flights/specifications")
public class FlightWithSpecificationController {

    @Autowired
    private FlightServiceWithSpecifications flightServiceWithSpecifications;

    @GetMapping
    public List<Flight> getAll(@RequestParam(required = false) String status,
                               @RequestParam(required = false) String flightNo) {
        return flightServiceWithSpecifications.getAll(status, flightNo);
    }

    @PostMapping
    public List<Flight> getAll(@RequestBody List<Filter> filters) throws Exception {
        return flightServiceWithSpecifications.getAll(filters);
    }
}
