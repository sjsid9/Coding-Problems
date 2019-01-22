public long productTree() {
		return productTree(this.root);
	}

	private long productTree(Node node) {

		if (node == null) {
			return 1;
		}

		long ls = productTree(node.left);
		long rs = productTree(node.right);

		return node.data * ls * rs;

	}
