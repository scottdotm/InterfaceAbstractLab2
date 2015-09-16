package lab1;

/**
 * Describe responsibilities here.
 *
 * @author      Scott
 * @version     1.00
 */


public class IntroJavaCourse extends ProgrammingCourse {

    @Override
    public String Prerequisites() {
        super.setPrerequisites("Prerequisites are: Intro to Programming");
        return this.getPrerequisites();
    }
}