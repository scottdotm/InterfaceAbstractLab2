package lab1;

import javax.swing.JOptionPane;

/**
 * Describe responsibilities here. NOTE: this class has NO PREREQUISITES!
 * Do not change this fact.
 *
 * @author      Scott
 * @version     1.00
 */

public class IntroToProgrammingCourse extends ProgrammingCourse {
    @Override
    public String Prerequisites() {
        setPrerequisites("There are no prerequisites for this course");
        return getPrerequisites();
    }
}