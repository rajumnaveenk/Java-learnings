package javaLearnings;

public class PersonMainNew {
	public static void main(String[] args) {
		PersonNew p1 = new PersonNew("Naveen", 25);

		System.out.println("Name: " + p1.getName());
		System.out.println("Age: " + p1.getAge());

		p1.setName("Kumar");
		p1.setAge(30);

		System.out.println("Updated Name: " + p1.getName());
		System.out.println("Updated Age: " + p1.getAge());

		p1.setAge(-5); // Invalid age
	}
}
