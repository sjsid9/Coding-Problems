public void Fold() throws Exception {
		HeapMover mover = new HeapMover();
		mover.left = this.head;
		Fold(mover, this.head, 0);

	}
private void Fold(HeapMover mover, Node right, int count) {

		if (right == null) {
			return;
		}

		Fold(mover, right.next, count + 1);

		if (count > size / 2) {
			Node ahead = mover.left.next;
			mover.left.next = right;
			right.next = ahead;
			mover.left = ahead;
		} else if (count == size / 2) {
			this.tail = right;
			this.tail.next = null;
		}
	}
private class HeapMover {

		Node left;
	}
