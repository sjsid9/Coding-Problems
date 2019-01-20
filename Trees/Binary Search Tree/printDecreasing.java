public void printDec() {
		printDec(this.root);
	}

	private void printDec(Node node) {

		if (node == null) {
			return;
		}

		printDec(node.right);
		System.out.print(node.data + " ");
		printDec(node.left);

	}
