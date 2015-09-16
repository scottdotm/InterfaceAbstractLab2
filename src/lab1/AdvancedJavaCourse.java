package lab1;

import javax.swing.JOptionPane;

/**
 * Describe responsibilities here.
 *
 * @author      Scott
 * @version     1.00
 */
public class AdvancedJavaCourse extends ProgrammingCourse {

    @Override
    public String Prerequisites() {
        super.setPrerequisites("Prerequisites are: Intro to Programming and Intro to Java");
        return this.getPrerequisites();
    }

}