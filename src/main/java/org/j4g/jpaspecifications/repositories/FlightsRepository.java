package org.j4g.jpaspecifications.repositories;

import org.j4g.jpaspecifications.model.db.Flight;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

public interface FlightsRepository extends JpaRepository<Flight, Long>, JpaSpecificationExecutor<Flight> {
}
