
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
    }
    
}
