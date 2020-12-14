public class Tester {
	public static void main(String[] args) {
		NoNullArrayList<String> a = new NoNullArrayList<String>();
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
	} 
}