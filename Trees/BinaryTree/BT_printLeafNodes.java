	public void printLeafNodes() {
		printLeafNodes(this.root);
	}

	private void printLeafNodes(Node node) {

		if (node == null) {
			return;
		}

		printLeafNodes(node.left);
		if (node.left == null && node.right == null) {
			System.out.println(node.data);
		}
		printLeafNodes(node.right);

	}
