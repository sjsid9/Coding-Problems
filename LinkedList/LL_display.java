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
}