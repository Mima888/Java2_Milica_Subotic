package student;

import computer.Computer;
import course.Course;

public class Student {

    private String firstName;
    private String lastName;
    private int yearOfBirth;
    private Course course = new Course("QA", 36);
    private Computer computer = new Computer(2.4, 16, 500);

    public Student(String firstName, String lastName, int yearOfBirth) {

        this.firstName = firstName;
        this.lastName = lastName;
        this.yearOfBirth = yearOfBirth;

    }
    
    public Student() {}

//    public Student() {
//
//        Course QA = new Course("QA", 36);
//        Computer Laptop = new Computer(2.4, 16, 500);
//    }

    public void info() {

        System.out.println("First name is: " + getFirstName());
        System.out.println("Last name is: " + getLastName());
        System.out.println("Year of birth is: " + getYearOfBirth());
        System.out.println("Course name is: " + getCourse().getCourseName());
        System.out.println("Number of classes is: " + getCourse().getNumberOfClasses());
        System.out.println("Process tact is: " + getComputer().getProcessTact());
        System.out.println("Memory is: " + getComputer().getMemory());
        System.out.println("Hard driver is: " + getComputer().getHardDrive());
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getYearOfBirth() {
        return yearOfBirth;
    }

    public void setYearOfBirth(int yearOfBirth) {
        this.yearOfBirth = yearOfBirth;
    }

    public Course getCourse() {
        return this.course;
    }

    public void setCourse(Course course) {
        this.course = course;
    }

    public Computer getComputer() {
        return this.computer;

    }

    public void setComputer(Computer computer) {
        this.computer = computer;
    }

}
