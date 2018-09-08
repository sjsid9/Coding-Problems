public class LinkedList {

	private class Node {
		int data;
		Node next;
	}

	Node head;
	Node tail;
	int size;
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

public int getAt(int idx) throws Exception {

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
public int size() {
		return this.size;
	}

	public boolean isEmpty() {
		return this.size == 0;
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
	public int getFirst() throws Exception {

		if (this.size == 0) {
			throw new Exception("LL is Empty");
		}

		return this.head.data;
	}
public int getLast() throws Exception {

		if (this.size == 0) {
			throw new Exception("LL is Empty");
		}

		return this.tail.data;
	}
public void addLast(int item) {

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

public void addFirst(int item) {

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

public void addAt(int item, int idx) throws Exception {

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

public int removeFirst() throws Exception {

		if (this.size == 0) {
			throw new Exception("LL is Empty");
		}
		int rv = this.head.data;
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
public int removeLast() throws Exception {

		if (this.size == 0) {
			throw new Exception("LL is Empty");
		}

		int rv = this.tail.data;
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


}