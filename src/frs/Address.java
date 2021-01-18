package frs;

public class Address {
    private String street;
    private String city;
    private String state;


    public String getContactAddress(){
        System.out.println("Address details are:");
        return (street+" "+city+" "+state);
    }
    void newAddressDetails(String street, String city, String state){
        this.street =street;
        this.city =city;
        this.state =state;
    }
    /*String updateAddressDetails(){
        return (street+" "+city+" "+state);
    }*/
}
