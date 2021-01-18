package frs;

public abstract class Ticket {
    private static int id;
    private String pnr;
    private String departure;
    private String destination;
    private String departureTime;
    private String arrivalTime;
    private static int seatNum =0;
    private int ticketPrice;
    private boolean isCancelled;
    Flight flight;
    Passenger passenger;

    static {
        id = 200;
        seatNum =0;
    }

    Ticket(String pnr, String departure, String destination, String departureTime, String arrivalTime, int ticketPrice,
           boolean isCancelled, Flight flight,Passenger passenger){
        count();
        this.pnr=pnr;
        this.departure=departure;
        this.destination=destination;
        this.departureTime=departureTime;
        this.arrivalTime=arrivalTime;
        this.ticketPrice=ticketPrice;
        this.isCancelled=isCancelled;
        this.flight=flight;
        this.passenger=passenger;
    }

    void count(){
        id++;
        seatNum++;
    }
    public boolean isCancelled() {
        return isCancelled;
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
}
