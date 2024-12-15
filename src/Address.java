public class Address {
    private String postalAddress;
    private String streetAddress;

    public Address(String postalAddress, String streetAddress){
        this.postalAddress = postalAddress;
        this.streetAddress = streetAddress;
    }

    public String getPostalAddress(){
        return postalAddress;
    }

    public String getStreetAddress(){
        return streetAddress;
    }

    public void setPostalAddress(String postalAddress){
        this.postalAddress = postalAddress;
    }

    public void setStreetAddress(String streetAddress){
        this.streetAddress = streetAddress;
    }
}
