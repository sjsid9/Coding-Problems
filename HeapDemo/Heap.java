package HeapDemo;

import java.util.ArrayList;

public class Heap {

	ArrayList<Integer> data = new ArrayList<>();

	public void add(int item) {
		this.data.add(item);
		upheapify(this.data.size() - 1);
	}

	private void upheapify(int ci) {

		int pi = (ci - 1) / 2;
		if (data.get(pi) > data.get(ci)) {
			swap(pi, ci);
			upheapify(pi);
		}

	}

	private void swap(int pi, int ci) {

		int ith = this.data.get(pi);
		int jth = this.data.get(ci);

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

	public int remove() {
		
		swap(0, this.data.size() - 1);
		int rv = this.data.remove(this.data.size()-1);
		downheapify(0);
		return rv;
	}

	private void downheapify(int pi) {

		int lci = 2 * pi + 1;
		int rci = 2 * pi + 2;
		int mini = pi;

		if (lci < this.data.size() && data.get(pi) > data.get(lci)) {
			mini = lci;
		}

		if (rci < this.data.size() && data.get(pi) > data.get(rci)) {
			mini = rci;
		}

		if (mini != pi) {
			swap(pi, mini);
			downheapify(pi);
		}

	}

}
