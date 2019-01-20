public void kthLargest(int num) {
		count count = new count();
		kthLargest(this.root, num, count);
	}

	private class count {
		int count = 0;
	}

	private void kthLargest(Node node, int num, count count) {

		if (node == null) {
			return;
		}

		kthLargest(node.right, num, count);
		count.count++;
		if (count.count == num) {
			System.out.println(node.data);
			return;
		}
		kthLargest(node.left, num, count);

	}
