package frs;

public class RegularTicket {
    int id = 200;
    String pnr;
    String departure;
    String destination;
    String departureTime;
    String arrivalTime;
    int seatNum =0;
    int ticketPrice;
    boolean isCancelled;
    String specialService;

    public String getRegularTicketDetails(){
        count();
        System.out.println("Ticket details are: ");
        return "id: "+this.id+" pnr: "+this.pnr+" departure: "+this.departure+" destination: "+this.destination+
                " departure time: "+this.departureTime+" arrival time: "+arrivalTime+"seat no.: "+seatNum+
                "price: "+ticketPrice+"special service: "+this.specialService;
    }
    void ticketDetails(String pnr, String departure,String destination,String departureTime,String arrivalTime,
                       int ticketPrice){
        this.pnr=pnr;
        this.departure=departure;
        this.destination=destination;
        this.departureTime=departureTime;
        this.arrivalTime=arrivalTime;
        this.ticketPrice=ticketPrice;
        checkSpecialService(this.specialService);
    }

    String checkSpecialService(String specialService){
        return this.specialService = specialService;
    }
    void count(){
        id += 1;
        seatNum += 1;
    }
}
