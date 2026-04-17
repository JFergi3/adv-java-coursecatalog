package lab1;

/**
 * Represents an introductory programming course.
 * NOTE: this class has NO PREREQUISITES! Do not change this fact.
 * getPrerequisites() returns "None" — a concrete, well-defined answer.
 *
 * @author your name goes here
 * @version 1.00
 */
public class IntroToProgrammingCourse extends Course {

    public IntroToProgrammingCourse(String courseName, String courseNumber) {
        super(courseName, courseNumber);
    }

    /**
     * This course has no prerequisites; always returns "None".
     * No setter is needed or appropriate.
     */
    @Override
    public String getPrerequisites() {
        return "None";
    }
}
