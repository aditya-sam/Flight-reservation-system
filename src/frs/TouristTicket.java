package frs;

import java.util.Arrays;

public class TouristTicket {
    int id;
    String pnr;
    String departure;
    String destination;
    String departureTime;
    String arrivalTime;
    int seatNum;
    int ticketPrice;
    boolean isCancelled;
    String hotelAddress;
    String[] touristLocation=new String[5];

    public String getTouristTicketDetails(){
        count();
        return "id: "+this.id+" pnr: "+this.pnr+" departure: "+this.departure+" destination: "+this.destination+
                " departure time: "+this.departureTime+" arrival time: "+arrivalTime+
                "Hotel address: "+hotelAddress+"Tourist Location: "+ Arrays.toString(touristLocation);
    }
    void ticketDetails(String pnr, String departure,String destination,String departureTime,String arrivalTime,
                       int ticketPrice, String hotelAddress, String[] touristLocation){
        this.pnr=pnr;
        this.departure=departure;
        this.destination=destination;
        this.departureTime=departureTime;
        this.arrivalTime=arrivalTime;
        this.ticketPrice=ticketPrice;
        this.hotelAddress=hotelAddress;
        this.touristLocation=touristLocation;
    }
    void count(){
        id += 1;
        seatNum += 1;
    }
}
