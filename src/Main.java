import java.util.Scanner;


public class Main {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        Course [] courses = {
                new Course(202, "Data Communication", 20000),
                new Course(203, "Database Communication", 18000),
                new Course(204, "Automata Theory", 30000),
                new Course(205, "Mathematics for Science", 25000),
                new Course(206, "Data Structure and Algorithm", 28000),
                new Course(207, "Calculus", 27000),
        };

        System.out.println("******************* WELCOME TO STUDENT REGISTRATION SYSTEM *******************\n");
        System.out.print("Enter Student ID: ");
        String id = input.next();
        System.out.println();

        System.out.print("Enter First Name: ");
        String fName = input.next();
        System.out.println();

        System.out.print("Enter Last Name: ");
        String lName = input.next();
        System.out.println();

        System.out.print("Enter Grade Year: ");
        int gradeYear = input.nextInt();
        System.out.println();

        System.out.print("Enter Postal Address: ");
        String postalAddress = input.next();
        System.out.println();

        System.out.print("Enter Street Address: ");
        String streetAddress = input.next();
        System.out.println();

        System.out.print("Available Courses:");

        for (Course cs : courses) {
            cs.displayCourseInfo();
        }
        boolean found = false;

        do {
            System.out.print("\nEnter Course ID: ");
            int courseID = input.nextInt();
            System.out.println();

            for (Course cs : courses) {
                if (cs.getCourseId() == courseID) {
                    System.out.println("Course Name:" + cs.getCourseName());
                    System.out.println("Cost:" + cs.getCost());
                    found = true;
                    break;
                }
            }

            if (found == false) {
                System.out.println("Course does not exist!");
            }

        } while (found == false);
    }
}


