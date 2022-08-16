package org.j4g.jpaspecifications.rest;

import org.j4g.jpaspecifications.model.db.Flight;
import org.j4g.jpaspecifications.service.FlightServiceWithSpecifications;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

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
}
