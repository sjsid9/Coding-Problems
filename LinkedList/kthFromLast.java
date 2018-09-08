public int kthFromLast(int k) {
		Node temp = this.head;
		for (int i = 0; i < k; i++) {
			temp = temp.next;
		}
		int a = kthFromLast(this.head, temp);
		return a;
	}

	private int kthFromLast(Node slow, Node fast) {

		if (fast == null) {
			return slow.data;
		}

		return kthFromLast(slow.next, fast.next);

	}
