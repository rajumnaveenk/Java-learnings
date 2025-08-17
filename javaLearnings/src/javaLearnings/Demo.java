package javaLearnings;

class Demo {
	Demo getObject() {
		return this; // Returning current object
	}

	void message() {
		System.out.println("Hello from this keyword!");
	}

	public static void main(String[] args) {
		new Demo().getObject().message(); // Method chaining
	}
}
