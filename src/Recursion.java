//import java.util.ArrayList;
import java.util.List;

public class Recursion {

	/**
	 * Remove duplicate consecutive items from a list, changing the list parameter.
	 * For example, if list = { a, b, b, b, c, b, c, c} then after calling unique
	 * the list will contain {a, b, c, b, c}. Only consecutive duplicates are
	 * removed. Objects are compared using their own equals method.
	 * 
	 * @param list
	 *            of any kind of object. The elements are not null.
	 * @return reference to the list parameter with consecutive duplicates removed.
	 */
	public static List<?> unique(List<?> list) {
		if (list.size() == 1)
			return list;
		List<?> sub = list.subList(1, list.size());
		if (list.get(0).equals(list.get(1))) {
			sub.remove(0);
			unique(list);
		} else {
			unique(sub);
		}
		return list;
	}

	public static void printList(List<?> list) {
		for (Object o : list) {
			System.out.print(o);
		}
	}

	public static int fibonacci(int n) {
		if (n == 0)
			return 0;
		if (n == 1)
			return 1;
		return fibonacci(n - 1) + fibonacci(n - 2);
	}

	public int fibonacciHelper(int n, int sum) {
		if(n == 0)
			return 0;
		if (n == 1)
			return 1;
		return 0;
	}

	public static void main(String[] args) {
//		List<String> list = new ArrayList<String>();
//		list.add("a");
//		list.add("b");
//		list.add("b");
//		list.add("b");
//		list.add("c");
//		list.add("b");
//		list.add("b");
//		list.add("c");
//		list.add("c");
//		printList(unique(list));
		System.out.println(fibonacci(45));
	}
}
