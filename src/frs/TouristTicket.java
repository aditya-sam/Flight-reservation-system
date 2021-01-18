package frs;

import java.util.Arrays;

public class TouristTicket {
    private int id;
    private String pnr;
    private String departure;
    private String destination;
    private String departureTime;
    private String arrivalTime;
    private int seatNum;
    private int ticketPrice;
    private boolean isCancelled;
    private String hotelAddress;
    Flight flight;
    Passenger passenger;

    TouristTicket(String pnr, String departure,String destination,String departureTime,String arrivalTime,
                  int ticketPrice, String hotelAddress, String[] touristLocation, Flight flight,Passenger passenger){
        this.pnr=pnr;
        this.departure=departure;
        this.destination=destination;
        this.departureTime=departureTime;
        this.arrivalTime=arrivalTime;
        this.ticketPrice=ticketPrice;
        this.hotelAddress=hotelAddress;
        this.touristLocation=touristLocation;
        this.flight=flight;
        this.passenger=passenger;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getPnr() {
        return pnr;
    }

    public void setPnr(String pnr) {
        this.pnr = pnr;
    }

    public String getDeparture() {
        return departure;
    }

    public void setDeparture(String departure) {
        this.departure = departure;
    }

    public String getDestination() {
        return destination;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    public String getDepartureTime() {
        return departureTime;
    }

    public void setDepartureTime(String departureTime) {
        this.departureTime = departureTime;
    }

    public String getArrivalTime() {
        return arrivalTime;
    }

    public void setArrivalTime(String arrivalTime) {
        this.arrivalTime = arrivalTime;
    }

    public int getSeatNum() {
        return seatNum;
    }

    public void setSeatNum(int seatNum) {
        this.seatNum = seatNum;
    }

    public int getTicketPrice() {
        return ticketPrice;
    }

    public void setTicketPrice(int ticketPrice) {
        this.ticketPrice = ticketPrice;
    }

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
    }

    private String[] touristLocation;

    public String getTouristTicketDetails(){
        count();
        System.out.println("Tourist ticket details are: ");
        return "id: "+this.id+" pnr: "+this.pnr+" departure: "+this.departure+" destination: "+this.destination+
                " departure time: "+this.departureTime+" arrival time: "+arrivalTime+
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
    void count(){
        id += 1;
        seatNum += 1;
    }
}
