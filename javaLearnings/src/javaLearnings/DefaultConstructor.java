package javaLearnings;

class Student {

	String name;
	int age;

	Student() {
		name = "Naveen";
		age = 20;
	}

	void display() {
		System.out.println("Name: " + name + ", Age: " + age);
	}

}

public class DefaultConstructor {
	public static void main(String[] args) {
		Student s1 = new Student();
		s1.display();

	}
}
