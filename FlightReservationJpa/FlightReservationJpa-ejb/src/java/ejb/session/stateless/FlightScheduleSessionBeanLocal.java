/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/J2EE/EJB30/SessionLocal.java to edit this template
 */
package ejb.session.stateless;

import entity.Cabin;
import entity.FlightSchedule;
import java.time.Duration;
import java.util.Date;
import java.util.List;
import javax.ejb.Local;
import util.exception.ConflictingFlightScheduleException;
import util.exception.FlightScheduleDoesNotExistException;
import entity.FlightSchedulePlan;
import java.time.LocalTime;
import util.exception.FlightDoesNotExistException;

/**
 *
 * @author admin
 */
@Local
public interface FlightScheduleSessionBeanLocal {
    public FlightSchedule createNewFlightSchedule(Integer flightNumber, FlightSchedule flightSchedule) throws ConflictingFlightScheduleException;
    public void checkForConflictingFlights(Integer flightNumber, List<Date> departureDates, List<Duration> durations) throws ConflictingFlightScheduleException;
    public void checkForConflictingFlights(Integer flightNumber, Date departureDate, Duration duration) throws ConflictingFlightScheduleException;
    public List<FlightSchedule> getFlightSchedulesWithId(Long id) throws FlightScheduleDoesNotExistException;
    public Long changeFlightScheduleDateTime(Long flightScheduleId, Date departureDateTime, Duration duration) throws FlightScheduleDoesNotExistException;
    public List<FlightSchedule> retrieveFlightSchedulePlanWithSameTiming(List<FlightSchedulePlan> listOfFlightSchedulePlan, Date departureDate) ;
    public List<FlightSchedule> retrieveFlightSchedulePlanWith3DaysBefore(List<FlightSchedulePlan> listOfFlightSchedulePlan, Date departureDate);
    public List<FlightSchedule> retrieveFlightSchedulePlanWith3DaysAfter(List<FlightSchedulePlan> listOfFlightSchedulePlan, Date departureDate);
    public List<FlightSchedule> retrieveFlightScheduleInPlan(List<FlightSchedulePlan> listOfFlightSchedulePlan);
    public Date retrieveDateOfFlightPicked(Long id) throws FlightDoesNotExistException;
    public List<FlightSchedule> retrieveFlightSchedulePlanAfterTiming(List<FlightSchedulePlan> listOfFlightSchedulePlan, Date departureDateTime);
    public FlightSchedule getFlightScheduleWithId(long id);
    public List<Cabin> getCabins(long id);
    public char[][] getCabinSeats(long id, String cabName);
    public Integer[] getIslesPlan(long id, String cabName);
    public long bookSeat(long id, String cabName, int seat, char letter);
}
