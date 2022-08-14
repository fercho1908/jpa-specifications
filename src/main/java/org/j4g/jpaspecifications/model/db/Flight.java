package org.j4g.jpaspecifications.model.db;

import org.springframework.data.annotation.Immutable;
import javax.persistence.Column;
import javax.persistence.Entity;

import javax.persistence.Id;
import javax.persistence.Table;
import java.time.LocalDateTime;
import java.time.ZonedDateTime;

@Entity
@Immutable
@Table(name = "flights_v")
public class Flight {

    @Id
    @Column(name = "flight_id")
    private Long flightId;

    @Column(name = "flight_no")
    private String flightNumber;

    @Column(name = "scheduled_departure")
    private ZonedDateTime scheduleDeparture;

    @Column(name = "scheduled_departure_local")
    private LocalDateTime scheduleDepartureLocal;

    @Column(name = "scheduled_arrival")
    private ZonedDateTime scheduleArrival;

    @Column(name = "scheduled_arrival_local")
    private LocalDateTime scheduleArrivalLocal;

    @Column(name = "scheduled_duration")
    private String schedule_duration;

    @Column(name = "departure_airport")
    private String departureAirportCode;

    @Column(name = "departure_airport_name")
    private String departureAirportName;

    @Column(name = "departure_city")
    private String departureCity;

    @Column(name = "arrival_airport")
    private String ArrivalAirportCode;

    @Column(name = "arrival_airport_name")
    private String ArrivalAirportName;

    @Column(name = "arrival_city")
    private String ArrivalCity;

    @Column(name = "status")
    private String status;

    @Column(name = "aircraft_code")
    private String aircraftCode;

    @Column(name = "actual_departure")
    private ZonedDateTime actualDepartureTime;

    @Column(name = "actual_arrival")
    private ZonedDateTime actualArrivalTime;

    @Column(name = "actual_duration")
    private String actualDuration;

    public Long getFlightId() {
        return flightId;
    }

    public void setFlightId(Long flightId) {
        this.flightId = flightId;
    }

    public String getFlightNumber() {
        return flightNumber;
    }

    public void setFlightNumber(String flightNumber) {
        this.flightNumber = flightNumber;
    }

    public ZonedDateTime getScheduleDeparture() {
        return scheduleDeparture;
    }

    public void setScheduleDeparture(ZonedDateTime scheduleDeparture) {
        this.scheduleDeparture = scheduleDeparture;
    }

    public LocalDateTime getScheduleDepartureLocal() {
        return scheduleDepartureLocal;
    }

    public void setScheduleDepartureLocal(LocalDateTime scheduleDepartureLocal) {
        this.scheduleDepartureLocal = scheduleDepartureLocal;
    }

    public ZonedDateTime getScheduleArrival() {
        return scheduleArrival;
    }

    public void setScheduleArrival(ZonedDateTime scheduleArrival) {
        this.scheduleArrival = scheduleArrival;
    }

    public LocalDateTime getScheduleArrivalLocal() {
        return scheduleArrivalLocal;
    }

    public void setScheduleArrivalLocal(LocalDateTime scheduleArrivalLocal) {
        this.scheduleArrivalLocal = scheduleArrivalLocal;
    }

    public String getSchedule_duration() {
        return schedule_duration;
    }

    public void setSchedule_duration(String schedule_duration) {
        this.schedule_duration = schedule_duration;
    }

    public String getDepartureAirportCode() {
        return departureAirportCode;
    }

    public void setDepartureAirportCode(String departureAirportCode) {
        this.departureAirportCode = departureAirportCode;
    }

    public String getDepartureAirportName() {
        return departureAirportName;
    }

    public void setDepartureAirportName(String departureAirportName) {
        this.departureAirportName = departureAirportName;
    }

    public String getDepartureCity() {
        return departureCity;
    }

    public void setDepartureCity(String departureCity) {
        this.departureCity = departureCity;
    }

    public String getArrivalAirportCode() {
        return ArrivalAirportCode;
    }

    public void setArrivalAirportCode(String arrivalAirportCode) {
        ArrivalAirportCode = arrivalAirportCode;
    }

    public String getArrivalAirportName() {
        return ArrivalAirportName;
    }

    public void setArrivalAirportName(String arrivalAirportName) {
        ArrivalAirportName = arrivalAirportName;
    }

    public String getArrivalCity() {
        return ArrivalCity;
    }

    public void setArrivalCity(String arrivalCity) {
        ArrivalCity = arrivalCity;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getAircraftCode() {
        return aircraftCode;
    }

    public void setAircraftCode(String aircraftCode) {
        this.aircraftCode = aircraftCode;
    }

    public ZonedDateTime getActualDepartureTime() {
        return actualDepartureTime;
    }

    public void setActualDepartureTime(ZonedDateTime actualDepartureTime) {
        this.actualDepartureTime = actualDepartureTime;
    }

    public ZonedDateTime getActualArrivalTime() {
        return actualArrivalTime;
    }

    public void setActualArrivalTime(ZonedDateTime actualArrivalTime) {
        this.actualArrivalTime = actualArrivalTime;
    }

    public String getActualDuration() {
        return actualDuration;
    }

    public void setActualDuration(String actualDuration) {
        this.actualDuration = actualDuration;
    }
}
