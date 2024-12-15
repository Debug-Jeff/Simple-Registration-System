public class Course {
    private int courseId;
    private String courseName;
    private int cost;

    public Course(int courseId, String CourseName, int cost){
        this.courseId = courseId;
        this.courseName = CourseName;
        this.cost = cost;
    }

    public int getCourseId(){
        return courseId;
    }

    public String getCourseName(){
        return courseName;
    }

    public int getCost(){
        return cost;
    }

    public void displayCourseInfo(){
        System.out.printf("Course ID: %d, Course Name: %s , Cost: %d \n", courseId, courseName, cost);
    }
}
