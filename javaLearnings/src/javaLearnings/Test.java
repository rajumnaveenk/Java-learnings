package javaLearnings;

public class Test {

	void show(Test obj) {
		System.out.println("Method is called using object reference");
	}

	void call() {
		show(this);
	}

	public static void main(String[] args) {
		Test t = new Test();
		t.call();
	}

}
