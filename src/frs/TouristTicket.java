package frs;

import java.util.Arrays;

public class TouristTicket extends Ticket{
    private String hotelAddress;
    private String[] touristLocation;
    Flight flight;
    Passenger passenger;
    int id=getId(), ticketPrice=getTicketPrice(), seatNum=getSeatNum();
    String pnr=getPnr(), departure=getDeparture(), destination=getDestination(), departureTime=getDepartureTime(),
            arrivalTime=getArrivalTime();

    TouristTicket(String pnr, String departure, String destination, String departureTime, String arrivalTime,
                  int ticketPrice, boolean isCancelled, Flight flight, Passenger passenger, String hotelAddress, String[] touristLocation) {
        super(pnr, departure, destination, departureTime, arrivalTime, ticketPrice, isCancelled, flight, passenger);
        this.hotelAddress = hotelAddress;
        this.touristLocation=touristLocation;
    }
/*

    public String getHotelAddress() {
        return hotelAddress;
    }

    public void setHotelAddress(String hotelAddress) {
        this.hotelAddress = hotelAddress;
    }

    public String[] getTouristLocation() {
        return touristLocation;
    }

    public void setTouristLocation(String[] touristLocation) {
        this.touristLocation = touristLocation;
    }*/

    public String getTouristTicketDetails(){
        count();
        System.out.println("Tourist ticket details are: ");
        return "id: "+id+" pnr: "+pnr+" departure: "+this.departure+" destination: "+this.destination+
                " departure time: "+this.departureTime+" arrival time: "+arrivalTime+"Price: "+ticketPrice+
                " Hotel address: "+hotelAddress+" Tourist Location: "+ Arrays.toString(touristLocation)+" seat no: "+seatNum;
    }
    /*void ticketDetails(String pnr, String departure,String destination,String departureTime,String arrivalTime,
                       int ticketPrice, String hotelAddress, String[] touristLocation){
        this.pnr=pnr;
        this.departure=departure;
        this.destination=destination;
        this.departureTime=departureTime;
        this.arrivalTime=arrivalTime;
        this.ticketPrice=ticketPrice;
        this.hotelAddress=hotelAddress;
        this.touristLocation=touristLocation;
    }*/
}
