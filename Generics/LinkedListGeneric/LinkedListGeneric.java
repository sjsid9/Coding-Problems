package LinkedListGeneric;

public class LinkedListGeneric<T> {

	private class Node {
		T data;
		Node next;
	}

	Node head;
	Node tail;
	int size;

	public int size() {
		return this.size;
	}

	public boolean isEmpty() {
		return this.size == 0;
	}

	public T getAt(int idx) throws Exception {

		if (this.size == 0) {
			throw new Exception("LL is Empty");
		}

		if (idx < 0 || idx >= size) {
			throw new Exception("Invalid Index");
		}

		Node temp = this.head;

		for (int i = 0; i < idx; i++) {
			temp = temp.next;
		}

		return temp.data;

	}

	public Node getNodeAt(int idx) throws Exception {

		if (this.size == 0) {
			throw new Exception("LL is Empty");
		}

		if (idx < 0 || idx >= size) {
			throw new Exception("Invalid Index");
		}

		Node temp = this.head;

		for (int i = 0; i < idx; i++) {
			temp = temp.next;
		}

		return temp;

	}

	public T getFirst() throws Exception {

		if (this.size == 0) {
			throw new Exception("LL is Empty");
		}

		return this.head.data;
	}

	public T getLast() throws Exception {

		if (this.size == 0) {
			throw new Exception("LL is Empty");
		}

		return this.tail.data;
	}

	public void addLast(T item) {

		Node nn = new Node();

		nn.data = item;
		nn.next = null;

		if (size > 0) {
			this.tail.next = nn;
		}

		if (size == 0) {
			this.head = nn;
			this.tail = nn;
			this.size++;
		} else {
			this.tail = nn;
			this.size++;
		}

	}

	public void addFirst(T item) {

		Node nn = new Node();

		nn.data = item;
		nn.next = this.head;

		if (size > 0) {
			this.head = nn;
			this.size++;
		}

		if (size == 0) {
			this.head = nn;
			this.tail = nn;
			this.size++;
		}

	}

	public void addAt(T item, int idx) throws Exception {

		if (idx < 0 || idx > size) {
			throw new Exception("Invalid Index");
		}

		if (idx == 0) {
			addFirst(item);
		} else if (idx == size) {
			addLast(item);
		} else {
			Node nn = new Node();
			nn.data = item;
			nn.next = null;

			Node nn1 = getNodeAt(idx - 1);
			Node np1 = nn1.next;
			// Node np1 = getNodeAt(idx);

			nn1.next = nn;
			nn.next = np1;
			this.size++;
		}
	}

	public T removeFirst() throws Exception {

		if (this.size == 0) {
			throw new Exception("LL is Empty");
		}
		T rv = this.head.data;
		if (this.size == 1) {
			this.head = null;
			this.tail = null;
			this.size = 0;
		} else {
			this.head = this.head.next;
			this.size--;
		}
		return rv;
	}

	public T removeLast() throws Exception {

		if (this.size == 0) {
			throw new Exception("LL is Empty");
		}

		T rv = this.tail.data;
		if (this.size == 1) {
			this.head = null;
			this.tail = null;
			this.size = 0;
		} else {
			Node nn = getNodeAt(this.size - 2);
			this.tail = nn;
			this.tail.next = null;
			this.size--;
		}
		return rv;
	}

	public T removeAt(int idx) throws Exception {

		if (idx < 0 || idx >= size) {
			throw new Exception("Invalid Index");
		}
		T rv;
		if (idx == 0) {
			return removeFirst();
		} else if (idx == this.size - 1) {
			return removeLast();
		} else {
			Node pn = getNodeAt(idx - 1);
			Node nn = pn.next;
			rv = nn.data;
			pn.next = nn.next;
			nn.next = null;
			this.size--;
			return rv;
		}

	}

	public void display() {
		System.out.println("-------------------------------");
		Node temp = this.head;

		while (temp != null) {
			System.out.print(temp.data + " ");
			temp = temp.next;
		}
		System.out.println(".");
		System.out.println("-------------------------------");

	}
}
