package inf;

public class StackImpl <T> implements Stack<T> {
	private T[] v;
	private int count;
	public StackImpl(int size) {
		v = (T[])new Object[size];
		count = 0;
	}
	@Override
	public void push(T item) {
		v[count++] = item;
	}

	@Override
	public T pop() {
		return v[--count];
	}

	@Override
	public int size() {
		return count;
	}

}
