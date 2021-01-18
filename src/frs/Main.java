package frs;

public class Main {

    public static void main(String[] args) {
        Contact c = new Contact();
        c.newContactDetails("Abu Taha","1234","abu@gmail.com");
        System.out.println(c.getContactDetails());

        System.out.println();

        Address a = new Address();
        a.newAddressDetails("8th mile","Bangalore","Karnataka");
        System.out.println(a.getContactAddress());

        System.out.println();

        Passenger p = new Passenger();
        System.out.println(p.getPassengerDetails());

        System.out.println();

        Flight f = new Flight();
        f.flightDetails("6E 444","Indigo");
        System.out.println(f.checkSeatAvailability());

        System.out.println();

        RegularTicket rT = new RegularTicket();
        rT.checkSpecialService("veg meal");
        rT.ticketDetails("ABC123","Delhi","Bangalore","12:45 PM","2:30 PM",3500);
        System.out.println(rT.getRegularTicketDetails());

        System.out.println();

        TouristTicket tT = new TouristTicket();
        tT.ticketDetails("XYZ321","Delhi","Bangalore","12:45 PM","2:30 PM",7000,"GreenLeaf, bangalore", new String[]{"A", "B", "C", "D"});
        System.out.println(tT.getTouristTicketDetails());
    }
}
