package frs;

public class Passenger {
    int id = 0;

    public void idCount(){
        id += 1;
    }

    public int getPassengerDetails(){
        idCount();
        System.out.println("Passenger details are: ");
        return id;
    }
}
