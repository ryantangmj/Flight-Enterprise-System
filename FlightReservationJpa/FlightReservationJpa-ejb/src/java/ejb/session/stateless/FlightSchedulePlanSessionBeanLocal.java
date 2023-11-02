/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/J2EE/EJB30/SessionLocal.java to edit this template
 */
package ejb.session.stateless;

import entity.Flight;
import entity.FlightSchedulePlan;
import java.util.List;
import javax.ejb.Local;
import util.exception.AirportDoesNotExistException;
import util.exception.ConflictingFlightScheduleException;

/**
 *
 * @author admin
 */
@Local
public interface FlightSchedulePlanSessionBeanLocal {
    public Long createSingleFlightSchedulePlan(FlightSchedulePlan flightSchedulePlan, Long flightScheduleid) throws AirportDoesNotExistException, ConflictingFlightScheduleException;
    public List<FlightSchedulePlan> retrieveFlightSchedulePlanWithSameFlight(List<Flight> listOfFlights);
}
