package javaLearnings;

public class Printer {

	public void print(int number) {
		System.out.println("Printing intger value " + number);
	}

	public void print(double number) {
		System.out.println("Printing intger value " + number);
	}

	public void print(String Text) {
		System.out.println("Printing Text " + Text);
	}

	public static void main(String[] args) {

		Printer p = new Printer();
		p.print(20);
		p.print(25);
		p.print("Hello!!");

	}

}
