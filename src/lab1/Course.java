package lab1;


public abstract class Course {
    
    private String courseName;
    private String courseNumber;
    private double credits;
    
    public Course(String courseName, String courseNumber) {
        this.setCourseName(courseName);
        this.setCourseNumber(courseNumber);
    }
    
    public String getCourseName() {
        return courseName;
    }
    
    public void setCourseName(String courseName) {
        if (courseName == null || courseName.isEmpty()) {
            System.out.println("Error: courseName cannot be null or empty string");
            System.exit(0);
        }
        this.courseName = courseName;
    }

    public String getCourseNumber() {
        return courseNumber;
    }
    
    public final void setCourseNumber(String courseNumber) {
        if (courseNumber == null || courseNumber.isEmpty()) {
            System.out.println("Error: courseNumber cannot be null or empty string");
            System.exit(0);
        }
        this.courseNumber = courseNumber;
    }

    public final double getCredits() {
        return credits;
    }
    
    public final void setCredits(double credits) {
        if (credits < 0.5 || credits > 4.0) {
            System.out.println("Error: credits must be in the range 0.5 to 4.0");
            System.exit(0);
        }
        this.credits = credits;
    }
    
    public abstract String getPrerequisites();
    
    @Override
    public String toString() {
        return getClass().getSimpleName()
                + " | Name: " + courseName
                + " | Number: " + courseNumber
                + " | Credits: " + credits
                + " | Prerequisites: " + getPrerequisites();
    }

}

