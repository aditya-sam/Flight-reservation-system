package frs;

public class Contact {
        private String phone;
        private String name;
        private String email;

        public String getContactDetails(){
            System.out.println("Contact details are:");
            return "name: "+name+" "+"phone: "+phone+" "+"email: "+email;
        }

        void newContactDetails(String name, String phone, String email){
            this.name =name;
            this.phone =phone;
            this.email =email;
        }

        /*String updateContactDetails() {
            return "name: " + name + " " + "phone: " + phone + " " + "email: " + email;
        }*/
}
