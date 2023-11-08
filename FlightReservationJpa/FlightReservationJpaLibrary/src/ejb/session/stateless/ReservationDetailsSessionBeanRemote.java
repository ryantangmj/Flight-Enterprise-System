/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/J2EE/EJB30/SessionRemote.java to edit this template
 */
package ejb.session.stateless;

import entity.ReservationDetails;
import javax.ejb.Remote;

/**
 *
 * @author Lenovo
 */
@Remote
public interface ReservationDetailsSessionBeanRemote {
    public Long createReservationDetails(ReservationDetails reservationDetails, long customerId, long flightScheduleId);
}