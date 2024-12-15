public class Student extends Person{
    private int gradeYear;
    private Course course;

    public Student(int id, String fName, String lName, int gradeYear, Course course, Address address) {
        super(id, fName, lName, address);
        this.gradeYear = gradeYear;
        this.course = course;
    }
}

