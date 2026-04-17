package lab1;

public class CourseDriver {

    public static void main(String[] args) {


        Course introProg = new IntroToProgrammingCourse("Intro to Programming", "CS-100");
        introProg.setCredits(3.0);
        System.out.println(introProg);


        IntroJavaCourse introJavaConc = new IntroJavaCourse("Intro to Java", "CS-101");
        introJavaConc.setCredits(3.0);
        introJavaConc.setPrerequisites("CS-100");
        // widen to Course after subclass setup
        System.out.println(introJavaConc);

        AdvancedJavaCourse advJavaConc = new AdvancedJavaCourse("Advanced Java", "CS-202");
        advJavaConc.setCredits(4.0);
        advJavaConc.setPrerequisites("CS-101");
        System.out.println(advJavaConc);


        System.out.println("\n--- All Courses (polymorphic loop) ---");
        Course[] catalog = { introProg, introJavaConc, advJavaConc};
        for (Course c : catalog) {
            System.out.println(c);
        }
    }
}
