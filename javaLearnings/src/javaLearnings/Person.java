package javaLearnings;

public class Person {

	public void sayHello(String name) {
		System.out.println("Hello " + name + " how are you !!");
	}

	public static void main(String[] args) {

		Person p = new Person();
		p.sayHello("Naveen");

	}

}
