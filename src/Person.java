public class Person {
    private int id;   /*Attribute/Properties */
    private String fName;
    private String lName;
    private Address address;

    public Person(int id, String fName, String lName, Address address) { /*Constructor */
        this.id = id;
        this.fName = fName;
        this.lName = lName;
        this.address = address;
    }

    public void setId(int id){   /*Setters - AF*/
        this.id = id;
    }

    public void setFName(String fName){
        this.fName = fName;
    }

    public void setSName(String lName){
        this.lName = lName;
    }

    public int getId() {  /*Getters Accessor Function/methods */
        return id;
    }

    public String getFName() {  /*Accessor Function */
        return fName;
    }

    public String getLName() {  /*Accessor Function */
        return lName;
    }


}
