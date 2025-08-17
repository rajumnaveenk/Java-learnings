package javaLearnings;

// Person class
class Person {
    String name;
    int age;

    // Constructor with parameters
    Person(String n, int a) {
        this.name = n;
        this.age = a;
    }

    // Method to display details
    void display() {
        System.out.println("Person Name: " + this.name + " Age: " + this.age);
    }
}

// Main class
public class PersonMain {
    public static void main(String[] args) {
        // Create object by passing arguments to constructor
        Person p1 = new Person("Naveen", 56);

        // Call display method
        p1.display();
    }
}
