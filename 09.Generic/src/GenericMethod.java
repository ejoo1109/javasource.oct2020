

public class GenericMethod {
	public <T extends Comparable<T>> T min(T x, T y) {
		return x.compareTo(y) < 0 ? x : y;
	}
}
