package javaLearnings;

public class Circle {

	static double area(double radius) {
		return Math.PI * radius * radius;
	}

	public static void main(String[] args) {
		double result = area(10.5);
		System.out.println("Area of circle: " + result);
	}

}
