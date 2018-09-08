public void ReversePR() {

		ReversePRH(this.head, this.head.next);
		Node temp = this.head;
		this.head = this.tail;
		this.tail = temp;
		this.tail.next = null;

	}

	private void ReversePRH(Node prev, Node curr) {

		if (curr == null) {
			return;
		}

		ReversePRH(curr, curr.next);
		curr.next = prev;

	}
