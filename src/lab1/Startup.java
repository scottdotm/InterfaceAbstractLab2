/*
 *  Scott
 */
package lab1;

/* 5. In the startup class document what you think is good or bad about this
 *  architecture from the perspective of using abstraction and inheritance.
 *  (Remember, a startup class must have a main method)
 *-----------------------------------------------------------------------------
 *  In terms of interface inheritence this is a good way to use an abstract class due to all 3 courses being program courses (the abstract super-class) making it an "is a" relationship.
 *  Advantage for when you create an array of objects also needed for polymorphism.
 *
 * 6. When declaring variables in your startup class consider using the 
 *  Liskov Substitution principle. This is where you declare a variable using
 *  it's abstract type. For example, you could do this:
 *
 *  MyAbstractSuperClass course = new AdvancedJavaCourse();
 *
 *  instead of this:
 *
 *  AdvancedJavaCourse course = new AdvancedJavaCourse();
 *
 *  Consider when this is advantageous and when it isn't. Provide a comment that explains your position.
 *-----------------------------------------------------------------------------------------------
 *  Liskov Substitution Principle (LSP) was used, because each function which operates upon a reference to the base class is able to operate upon derivatives of that base class(without knowing it) - ProgrammingCourse -
 *     
 * @author Scott
 */
public class Startup {

    /**
     * @param args the command line arguments
     */
    
    public static void main(String[] args) {
        ProgrammingCourse course1 = new IntroToProgrammingCourse();
        
        ProgrammingCourse course2 = new IntroJavaCourse();
        
        ProgrammingCourse course3 = new AdvancedJavaCourse();

        course1.setCourseName("Intro to Programming");
        course1.setCourseNumber("102-1");
        course1.setCredits(2);

        course2.setCourseName("Intro to Java");
        course2.setCourseNumber("101-5");
        course2.setCredits(3.5);

        course3.setCourseName("Advanced Java");
        course3.setCourseNumber("102-4");
        course3.setCredits(4);
        
        System.out.println("These are the Programming Courses offered");
        
        System.out.println("-------------------");
        
        System.out.println("Course Name: " + course1.getCourseName());
        System.out.println("Credits: " + course1.getCredits());
        System.out.println("Course Number: " + course1.getCourseNumber());
        System.out.println(course1.Prerequisites());

        System.out.println("-------------------");

        System.out.println("Course Name: " + course2.getCourseName());
        System.out.println("Credits: " + course2.getCredits());
        System.out.println("Course Number: " + course2.getCourseNumber());
        System.out.println(course2.Prerequisites());

        System.out.println("-------------------");

        System.out.println("Course Name: " + course3.getCourseName());
        System.out.println("Credits: " + course3.getCredits());
        System.out.println("Course Number: " + course3.getCourseNumber());
        System.out.println(course3.Prerequisites());

    }

}