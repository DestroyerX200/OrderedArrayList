public class OrderedArrayList<T extends Comparable<T>> extends NoNullArrayList<T> {
	private int orderedIndexOf(T value) {
		for (int i = 0; i < size(); i++) {
			if (value.compareTo(get(i)) <= 0) {
				return i;
			}
		}
		return size();
	}
	public boolean add(T value) {
		super.add(orderedIndexOf(value), value);
		return true;
	}
	public void add(int index, T value) {
		add(value);
	}
}