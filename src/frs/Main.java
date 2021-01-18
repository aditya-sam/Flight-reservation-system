package frs;

public class Main {

    public static void main(String[] args) {

        Passenger p = new Passenger();
        System.out.println(p.getPassengerDetails());

        System.out.println();

        Flight f = new Flight();
        f.flightDetails("6E 444","Indigo");
        System.out.println(f.checkSeatAvailability());

        System.out.println();

        RegularTicket rT = new RegularTicket("ABC123","Delhi","Bangalore","12:45 PM",
                "2:30 PM",3500,"veg meal", f, p);
        System.out.println(rT.getRegularTicketDetails());

        System.out.println();

        TouristTicket tT = new TouristTicket("XYZ321","Delhi","Bangalore","12:45 PM",
                "2:30 PM",7000,"GreenLeaf, bangalore", new String[]{"A", "B", "C", "D"}, f, p);
        System.out.println(tT.getTouristTicketDetails());
    }
}
