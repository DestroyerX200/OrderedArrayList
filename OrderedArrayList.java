public class OrderedArrayList<T extends Comparable<T>> extends NoNullArrayList<T> {
	private int orderedIndexOf(T value) {
		for (int i = 0; i < size(); i++) {
			if (value.compareTo(get(i)) <= 0) {
				return i;
			}
		}
		return size();
	}
	public OrderedArrayList() {
		super();
	}
	public OrderedArrayList(int startingCapacity) {
		super(startingCapacity);
	}
	public boolean add(T value) {
		super.add(orderedIndexOf(value), value);
		return true;
	}
	public void add(int index, T value) {
		add(value);
	}
	public T set(int index, T value) {
		T removedValue = remove(index);
		add(value);
		return removedValue;
	}
}