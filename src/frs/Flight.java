package frs;

public class Flight {
    private int id = 100;
    private String flightNum;
    private String airlineName;
    private int capacity = 60;
    private int numOfSeatBooked = 0;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFlightNum() {
        return flightNum;
    }

    public void setFlightNum(String flightNum) {
        this.flightNum = flightNum;
    }

    public String getAirlineName() {
        return airlineName;
    }

    public void setAirlineName(String airlineName) {
        this.airlineName = airlineName;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public int getNumOfSeatBooked() {
        return numOfSeatBooked;
    }

    public void setNumOfSeatBooked(int numOfSeatBooked) {
        this.numOfSeatBooked = numOfSeatBooked;
    }

    public String checkFlightDetails(){
        bookingCount();
        System.out.println("Flight details are:");
        return "id: "+id+" flight number: "+flightNum+" airline: "+airlineName;
    }

    void flightDetails(String flightNum, String airlineName){
        idCount();
        this.flightNum = flightNum;
        this.airlineName = airlineName;
    }

    String checkSeatAvailability(){
        if(capacity==numOfSeatBooked){
            return "Sorry, no seats available!";
        }else {
            return checkFlightDetails();
        }
    }
    void idCount(){
        id += 1;
    }

    void bookingCount(){
        numOfSeatBooked += 1;
    }
}

