package frs;

public class Passenger {
    private int id;
    private static int idCounter = 0;
    Contact contact;
    Address address;

    Passenger(){
        idCount();
        this.id = idCounter;
        this.contact= new Contact("1234","Abu Taha","abu@gmail.com");
        this.address= new Address("8th mile","Bangalore","Karnataka");
    }

    public void idCount(){
        idCounter++;
    }
    public int getPassengerCount(){
        return idCounter;
    }

    public String getPassengerDetails(){
        idCount();
        System.out.println("Passenger details are: ");
        return "id: "+id+" "+this.contact.getContactDetails()+" "+this.address.getContactAddress();
    }

    private static class Address {
        private String street;
        private String city;
        private String state;

        Address(String street, String city, String state){
            this.street=street;
            this.city=city;
            this.state=state;
        }

        public String getStreet() {
            return street;
        }

        public void setStreet(String street) {
            this.street = street;
        }

        public String getCity() {
            return city;
        }

        public void setCity(String city) {
            this.city = city;
        }

        public String getState() {
            return state;
        }

        public void setState(String state) {
            this.state = state;
        }

        public String getContactAddress(){
            return (street+" "+city+" "+state);
        }
        /*public void newAddressDetails(String street, String city, String state){
            this.street =street;
            this.city =city;
            this.state =state;
        }*/
    /*String updateAddressDetails(){
        return (street+" "+city+" "+state);
    }*/
    }

    private static class Contact {
        private String phone;
        private String name;
        private String email;

        Contact(String phone, String name, String email){
            this.phone=phone;
            this.name=name;
            this.email=email;
        }

        public String getPhone() {
            return phone;
        }

        public void setPhone(String phone) {
            this.phone = phone;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getEmail() {
            return email;
        }

        public void setEmail(String email) {
            this.email = email;
        }

        public String getContactDetails(){
            return "name: "+name+" "+"phone: "+phone+" "+"email: "+email;
        }

        /*public void newContactDetails(String name, String phone, String email){
            this.name =name;
            this.phone =phone;
            this.email =email;
        }*/

        /*String updateContactDetails() {
            return "name: " + name + " " + "phone: " + phone + " " + "email: " + email;
        }*/


    }
}

