package org.j4g.jpaspecifications.repositories;

import org.j4g.jpaspecifications.model.db.Flight;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.querydsl.QuerydslPredicateExecutor;

public interface FlightsRepository extends JpaRepository<Flight, Long>, JpaSpecificationExecutor<Flight>, QuerydslPredicateExecutor {
}
