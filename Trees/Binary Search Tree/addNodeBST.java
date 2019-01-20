public void addNode(int item) {
		addNode(this.root, item);
	}

	private void addNode(Node node, int item) {

		if (item > node.data && node.right == null) {
			Node nn = new Node();
			node.right = nn;
			nn.data = item;
			return;
		}

		if (item < node.data && node.left == null) {
			Node nn = new Node();
			node.left = nn;
			nn.data = item;
			return;
		}

		if (item > node.data) {
			addNode(node.right, item);
		} else if (item < node.data) {
			addNode(node.left, item);
		}

	}
