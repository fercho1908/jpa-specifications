package org.j4g.jpaspecifications.service.impl;

import org.j4g.jpaspecifications.model.db.Flight;
import org.j4g.jpaspecifications.repositories.FlightsRepository;
import org.j4g.jpaspecifications.service.FlightsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FlightsServiceImpl implements FlightsService {

    @Autowired
    FlightsRepository flightsRepository;

    @Override
    public List<Flight> getAll(String status, String flighNo) {

        if(status != null && flighNo != null){
            return flightsRepository.findByStatusAndFlightNumber(status, flighNo);
        }else if(status == null && flighNo != null){
            return  flightsRepository.findByFlightNumber(flighNo);
        }
        else if(status != null && flighNo == null){
            return  flightsRepository.findByStatus(status);
        }
        return flightsRepository.findAll();
    }


    @Override
    public Flight getById(Long id) throws Exception {
        return flightsRepository.findById(id).orElseThrow(() -> new Exception("error"));
    }
}
