package javaLearnings;

//Defining a class
public class CarN {
	// Attributes (fields)
	String brand;
	int year;

	// Method (behavior)
	void drive() {
		System.out.println(brand + " is driving...");
	}
}

//Main class to run
public class Car {
	public static void main(String[] args) {
		// Creating objects
		CarN car1 = new CarN();
		car1.brand = "Toyota";
		car1.year = 2020;

		CarN car2 = new CarN();
		car2.brand = "Honda";
		car2.year = 2022;

		// Using objects
		car1.drive();
		car2.drive();

		System.out.println(car1.brand + " model year: " + car1.year);
		System.out.println(car2.brand + " model year: " + car2.year);
	}
}
