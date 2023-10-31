/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/J2EE/EJB30/SessionLocal.java to edit this template
 */
package ejb.session.stateless;

import entity.Flight;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author Lenovo
 */
@Local
public interface FlightSessionBeanLocal {
    public Long createNewFlight(Flight flight, Long flightRouteId, Long aircraftConfigId);
    public List<Flight> retrieveAllFlights();
    public Flight getFlightWithId(Long id);
    public long removeFlight(Long id);
}