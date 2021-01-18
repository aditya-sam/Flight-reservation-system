package frs;

public class Flight {
    int id = 100;
    String flightNum;
    String airlineName;
    int capacity = 60;
    int numOfSeatBooked = 0;

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

