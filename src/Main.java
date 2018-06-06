
import computer.Computer;
import course.Course;
import student.Student;

public class Main {

    public static void main(String[] args) {

        Student Milica = new Student("Milica", "Subotic", 1993);
        Milica.info();
        System.out.println("");

        Course QA = new Course();
        QA.setName("Quality Assurance");
        QA.setNumberOfClasses(36);
        QA.showData();
        System.out.println("");

        Computer Laptop = new Computer(2.4, 16, 500);
        Laptop.showData();
        System.out.println("");

        Milica.getCourse();
        Milica.getComputer();
    }

}
