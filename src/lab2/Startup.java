/*
 *  Scott
 */
package lab2;

/*  
 *  5. In the startup class document what you think is good or bad about this
 *  architecture from the perspective of using abstraction and inheritance.
 *------------------------------------------------------------------------
 *  All three courses (Intro to programming, intro to java, and advanced java) "play the roll of" a programming course given this, the interface super class is properly implemented and is used to full benifit.

 *  6. In your solution when can Liskov Substitution principle be used and when
 *  is it not possible. Write down your answer by providing a comment in the
 *  startup class.
 *------------------------------------------------------------------------  
 *  Just like the abstract class version, this version uses Liskov Substitution Principle (LSP)due to the reference to the base class is able to operate upon derivatives of that base class(without knowing it) - ProgrammingCourse -
 *
 * @ Scott
 *
 */
public class Startup {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ProgrammingCourse course1 = new IntroToProgrammingCourse();
        
        ProgrammingCourse course2 = new IntroJavaCourse();
        
        ProgrammingCourse course3 = new AdvancedJavaCourse();

        System.out.println("These are the Programming Courses offered");
        
        System.out.println("-------------------");
        
        System.out.println("Course Name: " + course1.CourseName());
        System.out.println("Course Number: " + course1.CourseNumber());
        System.out.println("Course Credits: " + course1.CourseCredits());
        System.out.println("Prerequisites: " + course1.Prerequisites());

        System.out.println("-------------------");

        System.out.println("Course Name: " + course2.CourseName());
        System.out.println("Course Number: " + course2.CourseNumber());
        System.out.println("Course Credits: " + course2.CourseCredits());
        System.out.println("Prerequisites: " + course2.Prerequisites());

        System.out.println("-------------------");

        System.out.println("Course Name: " + course3.CourseName());
        System.out.println("Course Number: " + course3.CourseNumber());
        System.out.println("Course Credits: " + course3.CourseCredits());
        System.out.println("Prerequisites: " + course3.Prerequisites());
    }
}