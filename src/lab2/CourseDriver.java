package lab2;

public class CourseDriver {

    public static void main(String[] args) {

        IntroToProgrammingCourse introProgConcrete =
                new IntroToProgrammingCourse("Intro to Programming", "CS-100");
        introProgConcrete.setCredits(3.0);

        Course[] catalog = getCourses(introProgConcrete);
        for (Course course : catalog) {
            System.out.println(course);
        }
    }

    private static Course[] getCourses(IntroToProgrammingCourse introProgConcrete) {
        IntroJavaCourse introJavaConcrete = new IntroJavaCourse("Intro to Java", "CS-101");
        introJavaConcrete.setCredits(3.0);
        introJavaConcrete.setPrerequisites("CS-100");

        AdvancedJavaCourse advancedJavaConcrete =
                new AdvancedJavaCourse("Advanced Java", "CS-202");
        advancedJavaConcrete.setCredits(4.0);
        advancedJavaConcrete.setPrerequisites("CS-101");

        return new Course[]{introProgConcrete, introJavaConcrete, advancedJavaConcrete};
    }
}
