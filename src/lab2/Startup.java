/*
 *  Scott
 */
package lab2;

/*  
 *  
 *  
 *  
 *  
 *
 * @ Scott
 */
public class Startup {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       IntroToProgrammingCourse course1 = new IntroToProgrammingCourse("Programming 101","2345");
                                course1.setCredits(3.0);
       
       
       System.out.println(course1.getCourseName() + " " +
                          course1.getCourseNumber() + " " +
                          course1.getCredits());  
                          
    
    
        IntroJavaCourse course2 = new IntroJavaCourse("Java 101","4567");
                        course2.setCredits(3.5);
                        course2.setPrerequisites("Intro to Programming");
       
            System.out.println(course2.getCourseName() + " " +
                               course2.getCourseNumber() + " " +
                               course2.getCredits() + " " + 
                               course2.getPrerequisites());


        AdvancedJavaCourse course3 = new AdvancedJavaCourse("Java 201","7890");
                           course3.setCredits(4.0);
                           course3.setPrerequisites("Intro Java");
       
            System.out.println(course3.getCourseName() + " " +
                               course3.getCourseNumber() + " " +
                               course3.getCredits() + " " + 
                               course3.getPrerequisites());
    }
}
