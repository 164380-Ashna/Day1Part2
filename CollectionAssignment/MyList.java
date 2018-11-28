package CollectionAssignment;

import java.util.ArrayList;

public class MyList<T> {

	T t;

	public void add(T t) {
		this.t = t;

	}

	ArrayList<T> arr = new ArrayList<T>();

	public void addthis() {
		arr.add(t);
	}

	public void removethis() {
		arr.remove(t);
	}

	public T getAll() {
		return (T) arr;

	}

	public T get() {
		return t;
	}

}
