package course;

public class Course {

    private String name;
    private int numberOfClasses;

//    public Course(String name, int numberOfClasses) {
//        
//        this.name = name;
//        this.numberOfClasses = numberOfClasses;
//    }
    public Course() {

    }
    
    public void showData() {
        System.out.println("Course name is: " + getName());
        System.out.println("Number of classes is: " + getNumberOfClasses());
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getNumberOfClasses() {
        return numberOfClasses;
    }

    public void setNumberOfClasses(int numberOfClasses) {
        this.numberOfClasses = numberOfClasses;
    }

}
