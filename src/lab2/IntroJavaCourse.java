package lab2;

/**
 * Describe responsibilities here.
 *
 * @author      Scott
 * @version     1.00
 */
public class IntroJavaCourse implements Course {
    private String courseName;
    private String courseNumber;
    private double courseCredits;
    private String prerequisites;

    public final String CourseName() {
        courseName = "Intro to Java";
        return courseName;
    }

    public final String CourseNumber() {
        courseNumber = "101-5";
        return courseNumber;
    }

    public final double CourseCredits() {
        courseCredits = 3.5;
        return courseCredits;
    }

    public final String Prerequisites() {
        prerequisites = "Intro to programming";
        return prerequisites;
    }

    
}
