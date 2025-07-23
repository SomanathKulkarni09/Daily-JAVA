// Class with encapsulation
class Person {
    // private fields (data hiding)
    private String name;
    private int age;

    // public setter method for name
    public void setName(String name) {
        this.name = name;
    }

    // public getter method for name
    public String getName() {
        return name;
    }

    // public setter method for age
    public void setAge(int age) {
        if (age > 0) {
            this.age = age;
        } else {
            System.out.println("Age must be positive.");
        }
    }

    // public getter method for age
    public int getAge() {
        return age;
    }
}

// Main class to test encapsulation
public class Main {
    public static void main(String[] args) {
        Person p = new Person();

        // Set values using setters
        p.setName("Alice");
        p.setAge(25);

        // Get values using getters
        System.out.println("Name: " + p.getName());
        System.out.println("Age: " + p.getAge());
    }
}
