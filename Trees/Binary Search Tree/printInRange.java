public void printInRange(int ll, int hl) {
		printInRange(this.root, ll, hl);
		printInRangeLT(this.root, ll, hl);
	}

	private void printInRangeLT(Node node, int ll, int hl) { // Less Visited Nodes

		if (node == null) {
			return;
		}

		if (node.data >= ll && node.data <= hl) {
			printInRangeLT(node.left, ll, hl);
			System.out.print(node.data + " ");
			printInRangeLT(node.right, ll, hl);
		} else if (node.data < ll) {
			printInRangeLT(node.right, ll, hl);
		} else if (node.data > hl) {
			printInRangeLT(node.left, ll, hl);
		}

	}

	private void printInRange(Node node, int ll, int hl) { // Visited All the nodes

		if (node == null) {
			return;
		}

		printInRange(node.left, ll, hl);
		if (node.data >= ll && node.data <= hl) {
			System.out.print(node.data + " ");
		}
		printInRange(node.right, ll, hl);
	}
