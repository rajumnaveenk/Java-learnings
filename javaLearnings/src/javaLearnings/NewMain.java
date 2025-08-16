package javaLearnings;

//Define a class
class Dog {
	// Attributes (fields)
	String name;
	int age;

	// Method (behavior)
	void bark() {
		System.out.println(name + " is barking!");
	}
}

//Main class
public class NewMain {
	public static void main(String[] args) {
		// Create first object
		Dog dog1 = new Dog();
		dog1.name = "Buddy";
		dog1.age = 3;

		// Create second object
		Dog dog2 = new Dog();
		dog2.name = "Charlie";
		dog2.age = 5;

		// Call methods
		dog1.bark();
		dog2.bark();

		// Print attributes
		System.out.println(dog1.name + " is " + dog1.age + " years old.");
		System.out.println(dog2.name + " is " + dog2.age + " years old.");
	}
}
