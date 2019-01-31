package HeapGeneric;

import java.util.ArrayList;

public class HeapGeneric<T extends Comparable<T>> {

	ArrayList<T> data = new ArrayList<>();

	public void add(T item) {
		this.data.add(item);
		upheapify(this.data.size() - 1);
	}

	private void upheapify(int ci) {

		int pi = (ci - 1) / 2;
		if (isLarger(data.get(ci), data.get(pi)) > 0) {
			swap(pi, ci);
			upheapify(pi);
		}

	}

	private void swap(int pi, int ci) {

		T ith = this.data.get(pi);
		T jth = this.data.get(ci);

		this.data.set(pi, jth);
		this.data.set(ci, ith);

	}

	public void display() {
		System.out.println(data);
	}

	private int size() {
		return this.data.size();
	}

	public boolean isEmpty() {
		return this.size() == 0;
	}

	public T get() {
		return this.data.get(0);
	}

	public T remove() {

		swap(0, this.data.size() - 1);
		T rv = this.data.remove(this.data.size() - 1);
		downheapify(0);
		return rv;
	}

	private void downheapify(int pi) {

		int lci = 2 * pi + 1;
		int rci = 2 * pi + 2;
		int mini = pi;

		if (lci < this.data.size() && isLarger(data.get(lci), data.get(pi)) > 0) {
			mini = lci;
		}

		if (rci < this.data.size() && isLarger(data.get(rci), data.get(pi)) > 0) {
			mini = rci;
		}

		if (mini != pi) {
			swap(pi, mini);
			downheapify(pi);
		}

	}

	public int isLarger(T t, T o) {
		return t.compareTo(o);
	}

}
