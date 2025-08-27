public class ClassExample {
    // Instance variables (fields)
    private String name;
    private int age;
    
    // Constructor
    public ClassExample(String name, int age) {
        this.name = name;
        this.age = age;
    }
    
    // Getter methods
    public String getName() {
        return name;
    }
    
    public int getAge() {
        return age;
    }
    
    // Setter methods
    public void setName(String name) {
        this.name = name;
    }
    
    public void setAge(int age) {
        this.age = age;
    }
    
    // Method to display information
    public void displayInfo() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }
    
    // Main method to test the class
    public static void main(String[] args) {
        // Creating objects of the class
        ClassExample person1 = new ClassExample("Alice", 25);
        ClassExample person2 = new ClassExample("Bob", 30);
        
        // Using methods
        person1.displayInfo();
        System.out.println();
        person2.displayInfo();
        
        // Using getter and setter
        System.out.println("\nUpdating person1's age:");
        person1.setAge(26);
        System.out.println("New age: " + person1.getAge());
    }
}
