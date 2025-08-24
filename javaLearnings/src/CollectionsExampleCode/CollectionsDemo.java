package CollectionsExampleCode;

import java.util.*;

public class CollectionsDemo {
	public static void main(String[] args) {
		// ----- LIST -----
		List<String> list = new ArrayList<>();
		list.add("Apple");
		list.add("Banana");
		list.add("Apple"); // allows duplicates
		System.out.println("List: " + list);

		// ----- SET -----
		Set<String> set = new HashSet<>();
		set.add("Dog");
		set.add("Cat");
		set.add("Dog"); // duplicate ignored
		System.out.println("Set: " + set);

		// ----- QUEUE -----
		Queue<Integer> queue = new LinkedList<>();
		queue.add(10);
		queue.add(20);
		queue.add(30);
		System.out.println("Queue (FIFO): " + queue);
		System.out.println("Queue Poll: " + queue.poll());

		// ----- MAP -----
		Map<Integer, String> map = new HashMap<>();
		map.put(1, "One");
		map.put(2, "Two");
		map.put(1, "Uno"); // overwrite
		System.out.println("Map: " + map);
	}
}
