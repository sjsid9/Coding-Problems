private class HeapMover {
		int sum = 0;
	}

	public void replaceWithSumLarger() {
		HeapMover mover = new HeapMover();
		replaceWithSumLarger(this.root, mover);
	}

	private void replaceWithSumLarger(Node node, HeapMover mover) {

		if (node == null) {
			return;
		}

		replaceWithSumLarger(node.right, mover);

		int val = node.data;
		node.data = mover.sum;
		mover.sum += val;

		replaceWithSumLarger(node.left, mover);

	}
