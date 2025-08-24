package CollectionsExampleCode;

import java.util.Stack;

public class StackExample {

	public static void main(String[] args) {
		Stack<Integer> StackData = new Stack<>();

		StackData.push(10);
		StackData.push(20);
		StackData.push(30);

		System.out.println("Stack list :" + StackData);
		System.out.println("Stack list :" + StackData.peek());

	}

}
