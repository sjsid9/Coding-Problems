public void ReverseDR() {
		HeapMover mover = new HeapMover();
		mover.left = this.head;
		// ReverseDR(this.head, this.head, 0);
		//Without using extra space
		ReverseDRHM(mover, this.head, 0);

	}

	private void ReverseDRHM(HeapMover mover, Node right, int count) {

		if (right == null) {
			return;
		}

		ReverseDRHM(mover, right.next, count + 1);
		if (count >= size / 2) {
			int temp = mover.left.data;
			mover.left.data = right.data;
			right.data = temp;
		}

		mover.left = mover.left.next;

	}

	private Node ReverseDR(Node left, Node right, int count) {

		if (right == null) {
			return left;
		}

		Node nl = ReverseDR(left, right.next, count + 1);
		if (count >= this.size / 2) {
			int temp = nl.data;
			nl.data = right.data;
			right.data = temp;
		}

		return nl.next;

	}

	private class HeapMover {

		Node left;
	}
