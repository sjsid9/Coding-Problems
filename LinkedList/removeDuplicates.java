	public void removeDuplicates() {
		removeDuplicates(this.head);
	}

	private void removeDuplicates(Node head) {
		Node temp = head;

		while (head.next != null) {
			if (head.data == head.next.data) {
				head.next = head.next.next;
			} else {
				head = head.next;
			}
		}
	}
