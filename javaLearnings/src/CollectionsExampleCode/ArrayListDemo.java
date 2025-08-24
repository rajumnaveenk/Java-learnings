package CollectionsExampleCode;

import java.util.*;

public class ArrayListDemo {
	public static void main(String[] args) {
		List<String> list = new ArrayList<>();
		list.add("Java");
		list.add("Python");
		list.add("C++");
		System.out.println("ArrayList: " + list);

		list.remove("Python"); // remove element
		System.out.println("After remove: " + list);

		System.out.println("Get index 1: " + list.get(1));
	}
}
