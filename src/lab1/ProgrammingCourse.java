/*
 *     Scott
 *     
 *     
 *     
 *    
 *     
 */
package lab1;

public abstract class ProgrammingCourse {
    
    private String courseName;
    private String courseNumber;
    private double credits;
    
    public abstract void setCourseName(String courseName);
    public abstract void setCourseNumber(String courseNumber); 
    public abstract void setCredits(double credits); 
    
    public final String getCourseName(){
        return courseName;
    }; 
    
    public final String getCourseNumber(){
        return courseNumber;
    };
    
    public final double getCredits(){
        return credits;
    }; 
}
