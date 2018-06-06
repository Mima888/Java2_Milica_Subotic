
import student.Student;

public class Main {

    public static void main(String[] args) {

        Student Milica = new Student("Milica", "Subotic", 1993);
        Milica.info();
        System.out.println("");

//        Course QA = new Course("QA", 36);
//        QA.setName("Quality Assurance");
//        QA.setNumberOfClasses(36);
//        QA.showData();
//        System.out.println("");

//        Computer Laptop = new Computer(2.4, 16, 500);
//        Laptop.showData();
//        System.out.println("");

//        Milica.getCourse();
//        Milica.getComputer();

          Student Nikola = new Student();
          Nikola.setFirstName("Nikola");
          Nikola.setLastName("Stojokvic");
          Nikola.setYearOfBirth(1989);
          
          Nikola.getCourse().setCourseName("PHP");
          Nikola.getCourse().setNumberOfClasses(39);
          
          Nikola.getComputer().setProcessTact(3.10);
          Nikola.getComputer().setMemory(16);
          Nikola.getComputer().setHardDrive(2500);
          
          Nikola.info();
        
        
    }

}
