	public int lca(int a, int b) {
		return lca(this.root, a, b).data;
	}

	private Node lca(Node node, int a, int b) {

		if (node == null) {
			return null;
		}

		if (node.data == a || node.data == b) {
			return node;
		}

		Node ln = lca(node.left, a, b);
		Node rn = lca(node.right, a, b);

		if (ln != null && rn != null) {
			return node;
		} else {
			return (ln != null ? ln : rn);
		}

	}
