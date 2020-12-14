public class Tester {
	public static void main(String[] args) {
		NoNullArrayList<String> a = new NoNullArrayList<String>(5);
		System.out.println(a.add("woah"));
		try {
			System.out.println("method call: a.add(null)");
			a.add(null);
		}
		catch (IllegalArgumentException e) {
			System.out.println("IllegalArgumentException caught");
		}
		try {
			System.out.println("method call: a.add(2, null)");
			a.add(2, null);
		}
		catch (IllegalArgumentException e) {
			System.out.println("IllegalArgumentException caught");
		}
		System.out.println(a);
		a.add("hey!");
		a.add("hii");
		System.out.println(a);
		System.out.println("method call: a.set(1, \"hey is for horses!\")");
		a.set(1, "hey is for horses!");
		System.out.println(a);
		try {
			System.out.println("method call: a.add(2, null)");
			a.set(0, null);
		}
		catch (IllegalArgumentException e) {
			System.out.println("IllegalArgumentException caught");
		}

		// Testing private helper method (made it public temporarily):
		// OrderedArrayList<Integer> orderedA = new OrderedArrayList<Integer>();
		// orderedA.add(1); orderedA.add(1); orderedA.add(2); orderedA.add(3);
		// orderedA.add(5); orderedA.add(8); orderedA.add(13); orderedA.add(21);
		// System.out.println(orderedA);
		// System.out.println("method call: orderedA.orderedIndexOf(12) [should return 6]");
		// System.out.println(orderedA.orderedIndexOf(12));

		OrderedArrayList<Integer> orderedB = new OrderedArrayList<Integer>(2);
		orderedB.add(16); orderedB.add(32); orderedB.add(5, 4); orderedB.add(8);
		orderedB.add(64); orderedB.add(1, 2); orderedB.add(1); orderedB.add(128);
		System.out.println(orderedB);
		System.out.println("method call: orderedB.set(5, 125)");
		System.out.println(orderedB.set(5, 125));
		System.out.println(orderedB);

	} 
}