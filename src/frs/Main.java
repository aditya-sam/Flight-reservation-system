package frs;

public class Main {

    public static void main(String[] args) {

        Passenger p = new Passenger();
        /*System.out.println(p.getPassengerDetails());

        System.out.println();*/

        Flight f = new Flight();
        f.flightDetails("6E 444","Indigo");
        /*System.out.println(f.checkSeatAvailability());

        System.out.println();*/

        RegularTicket rT = new RegularTicket("ABC123","Delhi","Bangalore","12:45 PM",
                "2:30 PM",3500,false, f, p, "veg meal");
        /*if(rT.isCancelled()){
            System.out.println("flight is cancelled!");
        }else{
            System.out.println(rT.getRegularTicketDetails());
        }*/

        System.out.println();

        TouristTicket tT = new TouristTicket("XYZ321","Delhi","Bangalore","12:45 PM",
                "2:30 PM",7000,false, f, p,"GreenLeaf, bangalore", new String[]{"A", "B", "C", "D"});
        /*if(tT.isCancelled()){
            System.out.println("flight is cancelled!");
        }else{
            System.out.println(tT.getTouristTicketDetails());
        }*/
        printTicketDetails(rT);
        printTicketDetails(tT);

    }
    public static void printTicketDetails(RegularTicket regularTicket){
        System.out.println(regularTicket.pnr);
    }
    public static void printTicketDetails(TouristTicket touristTicket){
        System.out.println(touristTicket.pnr);
    }
}
