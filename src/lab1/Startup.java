/*
 *  Scott
 */
package lab1;

/*  I don't know when the Liskvov substituion principle is useful or not.  It didn't
 *  make any difference in my results. I guess I don't really understand inheritance,
 *  I can't get any inherited methods to work.
 *  This coding is somewhat cumbersome, I would prefer using interface methods.  
 *
 * @author Scott
 */
public class Startup {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       ProgrammingCourse course1 = new IntroToProgrammingCourse("Programming 101","2345");
                         course1.setCredits(3.0);
       
       
       System.out.println("Course Name = " + course1.getCourseName() + 
                          " Course Number = " + course1.getCourseNumber() +
                          " Credits = " + course1.getCredits());  
                          
    
    
        ProgrammingCourse course2 = new IntroJavaCourse("Java 101","4567");
                          course2.setCredits(3.5);
            
       
            System.out.println("Course Name = " + course2.getCourseName() + 
                               " Course Number = " + course2.getCourseNumber() +
                               " Credits = " + course2.getCredits()); 
                                


        ProgrammingCourse course3 = new AdvancedJavaCourse("Advanced Java - Java 201","7890");
                          course3.setCredits(4.0);
                           
       
            System.out.println("Course Name = " + course3.getCourseName() + 
                               " Course Number = " + course3.getCourseNumber() +
                               " Credits = " + course3.getCredits() );  
                               
    }
}
