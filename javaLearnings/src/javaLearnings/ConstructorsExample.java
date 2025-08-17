package javaLearnings;

public class PersonD {
	String Name;
	int Age;
	int RollNo;

	// Parameterized constructor
	PersonD(String n, int A, int R) {
		Name = n;
		Age = A;
		RollNo = R;
	}

	public static void main(String[] args) {
		// Correct way: pass arguments
		PersonD p = new PersonD("Naveen", 22, 12345);

		System.out.println("Person details: " + p.Name + ", Age: " + p.Age + ", RollNo: " + p.RollNo);
	}
}
