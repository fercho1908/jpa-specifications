package org.j4g.jpaspecifications.repositories;

import org.j4g.jpaspecifications.model.db.Flight;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.querydsl.QuerydslPredicateExecutor;

import java.util.List;

public interface FlightsRepository extends JpaRepository<Flight, Long>, JpaSpecificationExecutor<Flight>, QuerydslPredicateExecutor {

    public List<Flight> findByStatus(String status);

    public  List<Flight> findByFlightNumber(String FlightNumber);

    public  List<Flight> findByStatusAndFlightNumber(String Status, String FlightNumber);
}
