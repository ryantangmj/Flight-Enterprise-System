/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/J2EE/EJB30/SessionRemote.java to edit this template
 */
package ejb.session.stateless;

import entity.Flight;
import java.util.List;
import javax.ejb.Remote;

/**
 *
 * @author Lenovo
 */
@Remote
public interface FlightSessionBeanRemote {
    public Long createNewFlight(Flight flight, Long flightRouteId, Long aircraftConfigId);
    public List<Flight> retrieveAllFlights();
    public Flight getFlightWithId(Long id);
    public long removeFlight(Long id);
}