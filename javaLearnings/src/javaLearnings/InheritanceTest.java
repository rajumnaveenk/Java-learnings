package javaLearnings;

class step_one {

	void stepOne() {
		System.out.println("This step one!!");
	}
}

class step_twp extends step_one {

	void stepTwo() {
		System.out.println("This step Two!!");
	}
}

public class InheritanceTest {
	public static void main(String[] args) {

		step_twp abc = new step_twp();
		abc.stepOne();
		abc.stepTwo();

	}
}