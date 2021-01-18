package frs;

public class RegularTicket extends Ticket{
    Flight flight;
    Passenger passenger;
    private String specialService;
    int id=getId(), ticketPrice=getTicketPrice(), seatNum=getSeatNum();
    String pnr=getPnr(), departure=getDeparture(), destination=getDestination(), departureTime=getDepartureTime(),
    arrivalTime=getArrivalTime();

    RegularTicket(String pnr, String departure, String destination, String departureTime, String arrivalTime,
                  int ticketPrice, boolean isCancelled, Flight flight, Passenger passenger,String specialService) {
        super(pnr, departure, destination, departureTime, arrivalTime, ticketPrice, isCancelled, flight, passenger);
        this.specialService=specialService;
    }


  /*  public String getSpecialService() {
        return specialService;
    }

    public void setSpecialService(String specialService) {
        this.specialService = specialService;
    }
*/

    public String getRegularTicketDetails(){

        System.out.println("Regular ticket details are: ");
        return "id: "+this.id+" pnr: "+this.pnr+" departure: "+this.departure+" destination: "+this.destination+
                " departure time: "+this.departureTime+" arrival time: "+arrivalTime+" seat no.: "+seatNum+
                " price: "+ticketPrice+" special service: "+this.specialService;
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

}
