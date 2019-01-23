public void detectLoop() {
		Node rv = detectLoop(this.head);
		if (rv != null) {
			removeLoop(rv, this.head);
		}
	}

	private Node detectLoop(Node node) {

		Node p = node;
		Node q = node;
		while (p != null && q != null && q.next != null) {
			p = p.next;
			q = q.next.next;
			if (p == q) {
				return p;
			}
		}
		return null;
	}

	private void removeLoop(Node p, Node node) {

		Node q = node;
		while (p.next != q) {
			p = p.next;
			q = q.next;
		}
		p.next = null;

	}
