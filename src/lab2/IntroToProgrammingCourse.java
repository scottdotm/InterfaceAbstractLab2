package lab2;

import javax.swing.JOptionPane;

/**
 * Describe responsibilities here.
 *
 * @author      Scott
 * @version     1.00
 */
public class IntroToProgrammingCourse implements Course {
    private String courseName;
    private String courseNumber;
    private double courseCredits;

    public final String CourseName() {
        courseName = "Intro to Programming";
        return courseName;
    }

    public final String CourseNumber() {
        courseNumber = "102-1";
        return courseNumber;
    }

    public final double CourseCredits() {
        courseCredits = 2;
        return courseCredits;
    }

    public final String Prerequisites() {
        return null;
    }


    
}
