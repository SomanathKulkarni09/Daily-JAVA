// Parent class
class Person {
    void showInfo() {
        System.out.println("I am a person.");
    }
}

// Child class
class Student extends Person {
    void showStudentInfo() {
        System.out.println("I am a student.");
    }
}

// Main class to run the program
public class InheritanceStud {
    public static void main(String[] args) {
        Student s = new Student();
        s.showInfo();          // Inherited from Person
        s.showStudentInfo();   // From Student class
    }
}
