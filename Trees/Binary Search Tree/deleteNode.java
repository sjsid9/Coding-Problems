public void deleteNode(int item) {

		if (item == this.root.data) {
			if (this.root.left == null && this.root.right == null) {
				this.root = null;
			} else if (this.root.left != null && this.root.right == null) {
				this.root = this.root.left;
			} else if (this.root.left == null && this.root.right != null) {
				this.root = this.root.right;
			} else {
				delete(null, this.root, true, item);
			}

		} else {
			delete(null, this.root, true, item);
		}

	}

	private void delete(Node parent, Node node, boolean ilc, int item) {

		if (item > node.data) {
			delete(node, node.right, false, item);
		} else if (item < node.data) {
			delete(node, node.left, true, item);
		} else {

			if (node.left == null && node.right == null) {
				if (ilc) {
					parent.left = null;
				} else {
					parent.right = null;
				}
			} else if (node.left != null && node.right == null) {

				if (ilc) {
					parent.left = node.left;
				} else {
					parent.right = node.left;
				}

			} else if (node.left == null && node.right != null) {

				if (ilc) {
					parent.left = node.right;
				} else {
					parent.right = node.right;
				}

			} else {
				int max = max(node.left);
				node.data = max;
				delete(node, node.left, true, max);
			}

		}

	}
