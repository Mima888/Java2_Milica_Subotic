package student;

import course.Course;

public class Student {

    private String firstName;
    private String lastName;
    private int yearOfBirth;
    private Course course;

    public Student(String firstName, String lastName, int yearOfBirth) {
        
        this.firstName = firstName;
        this.lastName = lastName;
        this.yearOfBirth = yearOfBirth;
    }
    
    public void info() {
        
        System.out.println("First name is: " + getFirstName());
        System.out.println("Last name is: " + getLastName());
        System.out.println("Year of birth is: " + getYearOfBirth());
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

}
