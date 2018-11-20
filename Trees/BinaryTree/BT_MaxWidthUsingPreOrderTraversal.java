	public void MaxWidthPreOrderTraversal() {

		int h = this.height();
		int[] count = new int[h + 1];
		MaxWidthPreOrderTraversal(this.root, count, 0);
		int max = Integer.MIN_VALUE;
		for (int i = 0; i < count.length; i++) {
			if (max < count[i]) {
				max = count[i];
			}
		}
		System.out.println(max);
	}

	private void MaxWidthPreOrderTraversal(Node node, int[] count, int i) {

		if (node == null) {
			return;
		}

		count[i] = count[i] + 1;

		MaxWidthPreOrderTraversal(node.left, count, i + 1);
		MaxWidthPreOrderTraversal(node.right, count, i + 1);

	}
