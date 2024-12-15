public class Accountant extends Person{
    private int salary;

    public Accountant(int id, String fName, String lName, int salary, Address address) {
        super(id, fName, lName, address);
        this.salary = salary;
    }
}
