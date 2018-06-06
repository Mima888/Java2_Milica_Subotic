package course;

public class Course {

    private String courseName;
    private int numberOfClasses;

    public Course(String courseName, int numberOfClasses) {
        
        this.courseName = courseName;
        this.numberOfClasses = numberOfClasses;
    }
//    public Course() {
//
//    }
    
    public void showData() {
        System.out.println("Course name is: " + getCourseName());
        System.out.println("Number of classes is: " + getNumberOfClasses());
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public int getNumberOfClasses() {
        return numberOfClasses;
    }

    public void setNumberOfClasses(int numberOfClasses) {
        this.numberOfClasses = numberOfClasses;
    }

}
