	public boolean isFullTree() {
		return isFullTree(this.root);
	}

	private boolean isFullTree(Node node) {

		if (node == null) {
			return true;
		}

		if (node.right != null && node.left != null) {

		} else if (node.right != null && node.left == null) {
			return false;
		} else if (node.right == null && node.left != null) {
			return false;
		}

		boolean lc = isFullTree(node.left);
		boolean rc = isFullTree(node.right);

		return lc && rc;

	}
