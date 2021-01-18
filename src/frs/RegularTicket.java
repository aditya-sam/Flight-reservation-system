package frs;

public class RegularTicket {
    private int id = 200;
    private String pnr;
    private String departure;
    private String destination;
    private String departureTime;
    private String arrivalTime;
    private int seatNum =0;
    private int ticketPrice;
    private boolean isCancelled;
    Flight flight;
    Passenger passenger;
    private String specialService;

    RegularTicket(String pnr, String departure,String destination,String departureTime,String arrivalTime,
                  int ticketPrice,String specialService,Flight flight,Passenger passenger){
        this.pnr=pnr;
        this.departure=departure;
        this.destination=destination;
        this.departureTime=departureTime;
        this.arrivalTime=arrivalTime;
        this.ticketPrice=ticketPrice;
        this.specialService=specialService;
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

    public String getSpecialService() {
        return specialService;
    }

    public void setSpecialService(String specialService) {
        this.specialService = specialService;
    }


    public String getRegularTicketDetails(){
        count();
        System.out.println("Regular ticket details are: ");
        return "id: "+this.id+" pnr: "+this.pnr+" departure: "+this.departure+" destination: "+this.destination+
                " departure time: "+this.departureTime+" arrival time: "+arrivalTime+" seat no.: "+seatNum+
                " price: "+ticketPrice+" special service: "+this.specialService+" "+flight+" "+passenger;
    }
    /*void ticketDetails(String pnr, String departure,String destination,String departureTime,String arrivalTime,
                       int ticketPrice){
        this.pnr=pnr;
        this.departure=departure;
        this.destination=destination;
        this.departureTime=departureTime;
        this.arrivalTime=arrivalTime;
        this.ticketPrice=ticketPrice;
        checkSpecialService(this.specialService);
    }
*/
    /*String checkSpecialService(String specialService){
        return this.specialService = specialService;
    }*/
    void count(){
        id += 1;
        seatNum += 1;
    }
}
