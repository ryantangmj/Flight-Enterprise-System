
package ws.partner;

import java.util.List;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.datatype.XMLGregorianCalendar;
import javax.xml.ws.Action;
import javax.xml.ws.FaultAction;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.3.3
 * Generated source version: 2.2
 * 
 */
@WebService(name = "PartnerWebService", targetNamespace = "http://ws.session.ejb/")
@XmlSeeAlso({
    ObjectFactory.class
})
public interface PartnerWebService {


    /**
     * 
     * @param arg0
     * @return
     *     returns ws.partner.FlightSchedule
     * @throws FlightScheduleDoesNotExistException_Exception
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "getFlightScheduleWithId", targetNamespace = "http://ws.session.ejb/", className = "ws.partner.GetFlightScheduleWithId")
    @ResponseWrapper(localName = "getFlightScheduleWithIdResponse", targetNamespace = "http://ws.session.ejb/", className = "ws.partner.GetFlightScheduleWithIdResponse")
    @Action(input = "http://ws.session.ejb/PartnerWebService/getFlightScheduleWithIdRequest", output = "http://ws.session.ejb/PartnerWebService/getFlightScheduleWithIdResponse", fault = {
        @FaultAction(className = FlightScheduleDoesNotExistException_Exception.class, value = "http://ws.session.ejb/PartnerWebService/getFlightScheduleWithId/Fault/FlightScheduleDoesNotExistException")
    })
    public FlightSchedule getFlightScheduleWithId(
        @WebParam(name = "arg0", targetNamespace = "")
        long arg0)
        throws FlightScheduleDoesNotExistException_Exception
    ;

    /**
     * 
     * @param id
     * @return
     *     returns java.util.List&lt;ws.partner.Cabin&gt;
     * @throws FlightScheduleDoesNotExistException_Exception
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "getCabins", targetNamespace = "http://ws.session.ejb/", className = "ws.partner.GetCabins")
    @ResponseWrapper(localName = "getCabinsResponse", targetNamespace = "http://ws.session.ejb/", className = "ws.partner.GetCabinsResponse")
    @Action(input = "http://ws.session.ejb/PartnerWebService/getCabinsRequest", output = "http://ws.session.ejb/PartnerWebService/getCabinsResponse", fault = {
        @FaultAction(className = FlightScheduleDoesNotExistException_Exception.class, value = "http://ws.session.ejb/PartnerWebService/getCabins/Fault/FlightScheduleDoesNotExistException")
    })
    public List<Cabin> getCabins(
        @WebParam(name = "id", targetNamespace = "")
        long id)
        throws FlightScheduleDoesNotExistException_Exception
    ;

    /**
     * 
     * @param cabName
     * @param id
     * @return
     *     returns java.util.List&lt;ws.partner.UnsignedShortArray&gt;
     * @throws FlightScheduleDoesNotExistException_Exception
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "getCabinSeats", targetNamespace = "http://ws.session.ejb/", className = "ws.partner.GetCabinSeats")
    @ResponseWrapper(localName = "getCabinSeatsResponse", targetNamespace = "http://ws.session.ejb/", className = "ws.partner.GetCabinSeatsResponse")
    @Action(input = "http://ws.session.ejb/PartnerWebService/getCabinSeatsRequest", output = "http://ws.session.ejb/PartnerWebService/getCabinSeatsResponse", fault = {
        @FaultAction(className = FlightScheduleDoesNotExistException_Exception.class, value = "http://ws.session.ejb/PartnerWebService/getCabinSeats/Fault/FlightScheduleDoesNotExistException")
    })
    public List<UnsignedShortArray> getCabinSeats(
        @WebParam(name = "id", targetNamespace = "")
        long id,
        @WebParam(name = "cabName", targetNamespace = "")
        String cabName)
        throws FlightScheduleDoesNotExistException_Exception
    ;

    /**
     * 
     * @param cabName
     * @param id
     * @return
     *     returns java.util.List&lt;java.lang.Integer&gt;
     * @throws FlightScheduleDoesNotExistException_Exception
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "getIslesPlan", targetNamespace = "http://ws.session.ejb/", className = "ws.partner.GetIslesPlan")
    @ResponseWrapper(localName = "getIslesPlanResponse", targetNamespace = "http://ws.session.ejb/", className = "ws.partner.GetIslesPlanResponse")
    @Action(input = "http://ws.session.ejb/PartnerWebService/getIslesPlanRequest", output = "http://ws.session.ejb/PartnerWebService/getIslesPlanResponse", fault = {
        @FaultAction(className = FlightScheduleDoesNotExistException_Exception.class, value = "http://ws.session.ejb/PartnerWebService/getIslesPlan/Fault/FlightScheduleDoesNotExistException")
    })
    public List<Integer> getIslesPlan(
        @WebParam(name = "id", targetNamespace = "")
        long id,
        @WebParam(name = "cabName", targetNamespace = "")
        String cabName)
        throws FlightScheduleDoesNotExistException_Exception
    ;

    /**
     * 
     * @param customerId
     * @param flightScheduleId
     * @return
     *     returns java.util.List&lt;ws.partner.ReservationDetails&gt;
     * @throws FlightScheduleDoesNotExistException_Exception
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "getReservationDetails", targetNamespace = "http://ws.session.ejb/", className = "ws.partner.GetReservationDetails")
    @ResponseWrapper(localName = "getReservationDetailsResponse", targetNamespace = "http://ws.session.ejb/", className = "ws.partner.GetReservationDetailsResponse")
    @Action(input = "http://ws.session.ejb/PartnerWebService/getReservationDetailsRequest", output = "http://ws.session.ejb/PartnerWebService/getReservationDetailsResponse", fault = {
        @FaultAction(className = FlightScheduleDoesNotExistException_Exception.class, value = "http://ws.session.ejb/PartnerWebService/getReservationDetails/Fault/FlightScheduleDoesNotExistException")
    })
    public List<ReservationDetails> getReservationDetails(
        @WebParam(name = "flightScheduleId", targetNamespace = "")
        long flightScheduleId,
        @WebParam(name = "customerId", targetNamespace = "")
        long customerId)
        throws FlightScheduleDoesNotExistException_Exception
    ;

    /**
     * 
     * @param seat
     * @param flightSchedId
     * @param cabName
     * @param rowNum
     * @return
     *     returns java.lang.Boolean
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "checkSeatIfAvailable", targetNamespace = "http://ws.session.ejb/", className = "ws.partner.CheckSeatIfAvailable")
    @ResponseWrapper(localName = "checkSeatIfAvailableResponse", targetNamespace = "http://ws.session.ejb/", className = "ws.partner.CheckSeatIfAvailableResponse")
    @Action(input = "http://ws.session.ejb/PartnerWebService/checkSeatIfAvailableRequest", output = "http://ws.session.ejb/PartnerWebService/checkSeatIfAvailableResponse")
    public Boolean checkSeatIfAvailable(
        @WebParam(name = "flightSchedId", targetNamespace = "")
        long flightSchedId,
        @WebParam(name = "cabName", targetNamespace = "")
        String cabName,
        @WebParam(name = "rowNum", targetNamespace = "")
        int rowNum,
        @WebParam(name = "seat", targetNamespace = "")
        int seat);

    /**
     * 
     * @param email
     * @return
     *     returns java.lang.Long
     * @throws InvalidLoginCredentialException_Exception
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "getPartnerId", targetNamespace = "http://ws.session.ejb/", className = "ws.partner.GetPartnerId")
    @ResponseWrapper(localName = "getPartnerIdResponse", targetNamespace = "http://ws.session.ejb/", className = "ws.partner.GetPartnerIdResponse")
    @Action(input = "http://ws.session.ejb/PartnerWebService/getPartnerIdRequest", output = "http://ws.session.ejb/PartnerWebService/getPartnerIdResponse", fault = {
        @FaultAction(className = InvalidLoginCredentialException_Exception.class, value = "http://ws.session.ejb/PartnerWebService/getPartnerId/Fault/InvalidLoginCredentialException")
    })
    public Long getPartnerId(
        @WebParam(name = "email", targetNamespace = "")
        String email)
        throws InvalidLoginCredentialException_Exception
    ;

    /**
     * 
     * @return
     *     returns java.util.List&lt;ws.partner.Airport&gt;
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "retrieveAllAirports", targetNamespace = "http://ws.session.ejb/", className = "ws.partner.RetrieveAllAirports")
    @ResponseWrapper(localName = "retrieveAllAirportsResponse", targetNamespace = "http://ws.session.ejb/", className = "ws.partner.RetrieveAllAirportsResponse")
    @Action(input = "http://ws.session.ejb/PartnerWebService/retrieveAllAirportsRequest", output = "http://ws.session.ejb/PartnerWebService/retrieveAllAirportsResponse")
    public List<Airport> retrieveAllAirports();

    /**
     * 
     * @param seat
     * @param cabName
     * @param letter
     * @param id
     * @return
     *     returns long
     * @throws FlightScheduleDoesNotExistException_Exception
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "bookSeat", targetNamespace = "http://ws.session.ejb/", className = "ws.partner.BookSeat")
    @ResponseWrapper(localName = "bookSeatResponse", targetNamespace = "http://ws.session.ejb/", className = "ws.partner.BookSeatResponse")
    @Action(input = "http://ws.session.ejb/PartnerWebService/bookSeatRequest", output = "http://ws.session.ejb/PartnerWebService/bookSeatResponse", fault = {
        @FaultAction(className = FlightScheduleDoesNotExistException_Exception.class, value = "http://ws.session.ejb/PartnerWebService/bookSeat/Fault/FlightScheduleDoesNotExistException")
    })
    public long bookSeat(
        @WebParam(name = "id", targetNamespace = "")
        long id,
        @WebParam(name = "cabName", targetNamespace = "")
        String cabName,
        @WebParam(name = "seat", targetNamespace = "")
        int seat,
        @WebParam(name = "letter", targetNamespace = "")
        int letter)
        throws FlightScheduleDoesNotExistException_Exception
    ;

    /**
     * 
     * @param password
     * @param email
     * @return
     *     returns java.lang.Long
     * @throws InvalidLoginCredentialException_Exception
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "login", targetNamespace = "http://ws.session.ejb/", className = "ws.partner.Login")
    @ResponseWrapper(localName = "loginResponse", targetNamespace = "http://ws.session.ejb/", className = "ws.partner.LoginResponse")
    @Action(input = "http://ws.session.ejb/PartnerWebService/loginRequest", output = "http://ws.session.ejb/PartnerWebService/loginResponse", fault = {
        @FaultAction(className = InvalidLoginCredentialException_Exception.class, value = "http://ws.session.ejb/PartnerWebService/login/Fault/InvalidLoginCredentialException")
    })
    public Long login(
        @WebParam(name = "email", targetNamespace = "")
        String email,
        @WebParam(name = "password", targetNamespace = "")
        String password)
        throws InvalidLoginCredentialException_Exception
    ;

    /**
     * 
     * @param listOfFlightSchedulePlan
     * @return
     *     returns java.util.List&lt;ws.partner.FlightSchedule&gt;
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "retrieveFlightScheduleInPlan", targetNamespace = "http://ws.session.ejb/", className = "ws.partner.RetrieveFlightScheduleInPlan")
    @ResponseWrapper(localName = "retrieveFlightScheduleInPlanResponse", targetNamespace = "http://ws.session.ejb/", className = "ws.partner.RetrieveFlightScheduleInPlanResponse")
    @Action(input = "http://ws.session.ejb/PartnerWebService/retrieveFlightScheduleInPlanRequest", output = "http://ws.session.ejb/PartnerWebService/retrieveFlightScheduleInPlanResponse")
    public List<FlightSchedule> retrieveFlightScheduleInPlan(
        @WebParam(name = "listOfFlightSchedulePlan", targetNamespace = "")
        List<FlightSchedulePlan> listOfFlightSchedulePlan);

    /**
     * 
     * @param listOfFlightSchedulePlan
     * @param departureDate
     * @return
     *     returns java.util.List&lt;ws.partner.FlightSchedule&gt;
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "retrieveFlightSchedulePlanWithSameTiming", targetNamespace = "http://ws.session.ejb/", className = "ws.partner.RetrieveFlightSchedulePlanWithSameTiming")
    @ResponseWrapper(localName = "retrieveFlightSchedulePlanWithSameTimingResponse", targetNamespace = "http://ws.session.ejb/", className = "ws.partner.RetrieveFlightSchedulePlanWithSameTimingResponse")
    @Action(input = "http://ws.session.ejb/PartnerWebService/retrieveFlightSchedulePlanWithSameTimingRequest", output = "http://ws.session.ejb/PartnerWebService/retrieveFlightSchedulePlanWithSameTimingResponse")
    public List<FlightSchedule> retrieveFlightSchedulePlanWithSameTiming(
        @WebParam(name = "listOfFlightSchedulePlan", targetNamespace = "")
        List<FlightSchedulePlan> listOfFlightSchedulePlan,
        @WebParam(name = "departureDate", targetNamespace = "")
        XMLGregorianCalendar departureDate);

    /**
     * 
     * @param listOfFlightSchedulePlan
     * @param departureDate
     * @return
     *     returns java.util.List&lt;ws.partner.FlightSchedule&gt;
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "retrieveFlightSchedulePlanWith3DaysAfter", targetNamespace = "http://ws.session.ejb/", className = "ws.partner.RetrieveFlightSchedulePlanWith3DaysAfter")
    @ResponseWrapper(localName = "retrieveFlightSchedulePlanWith3DaysAfterResponse", targetNamespace = "http://ws.session.ejb/", className = "ws.partner.RetrieveFlightSchedulePlanWith3DaysAfterResponse")
    @Action(input = "http://ws.session.ejb/PartnerWebService/retrieveFlightSchedulePlanWith3DaysAfterRequest", output = "http://ws.session.ejb/PartnerWebService/retrieveFlightSchedulePlanWith3DaysAfterResponse")
    public List<FlightSchedule> retrieveFlightSchedulePlanWith3DaysAfter(
        @WebParam(name = "listOfFlightSchedulePlan", targetNamespace = "")
        List<FlightSchedulePlan> listOfFlightSchedulePlan,
        @WebParam(name = "departureDate", targetNamespace = "")
        XMLGregorianCalendar departureDate);

    /**
     * 
     * @param id
     * @return
     *     returns javax.xml.datatype.XMLGregorianCalendar
     * @throws FlightDoesNotExistException_Exception
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "retrieveDateOfFlightPicked", targetNamespace = "http://ws.session.ejb/", className = "ws.partner.RetrieveDateOfFlightPicked")
    @ResponseWrapper(localName = "retrieveDateOfFlightPickedResponse", targetNamespace = "http://ws.session.ejb/", className = "ws.partner.RetrieveDateOfFlightPickedResponse")
    @Action(input = "http://ws.session.ejb/PartnerWebService/retrieveDateOfFlightPickedRequest", output = "http://ws.session.ejb/PartnerWebService/retrieveDateOfFlightPickedResponse", fault = {
        @FaultAction(className = FlightDoesNotExistException_Exception.class, value = "http://ws.session.ejb/PartnerWebService/retrieveDateOfFlightPicked/Fault/FlightDoesNotExistException")
    })
    public XMLGregorianCalendar retrieveDateOfFlightPicked(
        @WebParam(name = "id", targetNamespace = "")
        Long id)
        throws FlightDoesNotExistException_Exception
    ;

    /**
     * 
     * @param cabName
     * @param id
     * @return
     *     returns long
     * @throws FlightScheduleDoesNotExistException_Exception
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "bookgetHighestFareUsingCabinNameSeat", targetNamespace = "http://ws.session.ejb/", className = "ws.partner.BookgetHighestFareUsingCabinNameSeat")
    @ResponseWrapper(localName = "bookgetHighestFareUsingCabinNameSeatResponse", targetNamespace = "http://ws.session.ejb/", className = "ws.partner.BookgetHighestFareUsingCabinNameSeatResponse")
    @Action(input = "http://ws.session.ejb/PartnerWebService/bookgetHighestFareUsingCabinNameSeatRequest", output = "http://ws.session.ejb/PartnerWebService/bookgetHighestFareUsingCabinNameSeatResponse", fault = {
        @FaultAction(className = FlightScheduleDoesNotExistException_Exception.class, value = "http://ws.session.ejb/PartnerWebService/bookgetHighestFareUsingCabinNameSeat/Fault/FlightScheduleDoesNotExistException")
    })
    public long bookgetHighestFareUsingCabinNameSeat(
        @WebParam(name = "cabName", targetNamespace = "")
        String cabName,
        @WebParam(name = "id", targetNamespace = "")
        long id)
        throws FlightScheduleDoesNotExistException_Exception
    ;

    /**
     * 
     * @param listOfFlightSchedulePlan
     * @param departureDate
     * @return
     *     returns java.util.List&lt;ws.partner.FlightSchedule&gt;
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "retrieveFlightSchedulePlanWith3DaysBefore", targetNamespace = "http://ws.session.ejb/", className = "ws.partner.RetrieveFlightSchedulePlanWith3DaysBefore")
    @ResponseWrapper(localName = "retrieveFlightSchedulePlanWith3DaysBeforeResponse", targetNamespace = "http://ws.session.ejb/", className = "ws.partner.RetrieveFlightSchedulePlanWith3DaysBeforeResponse")
    @Action(input = "http://ws.session.ejb/PartnerWebService/retrieveFlightSchedulePlanWith3DaysBeforeRequest", output = "http://ws.session.ejb/PartnerWebService/retrieveFlightSchedulePlanWith3DaysBeforeResponse")
    public List<FlightSchedule> retrieveFlightSchedulePlanWith3DaysBefore(
        @WebParam(name = "listOfFlightSchedulePlan", targetNamespace = "")
        List<FlightSchedulePlan> listOfFlightSchedulePlan,
        @WebParam(name = "departureDate", targetNamespace = "")
        XMLGregorianCalendar departureDate);

}
