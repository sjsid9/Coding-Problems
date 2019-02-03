// Print paths from root to leaf
	public void printPaths() {
		printPaths(this.root, "");
	}

	private void printPaths(Node root, String output) {
		if (root == null)
			return;

		if (root.left == null && root.right == null) {
			output = output + root.data + " #";
			System.out.print(output);
			return;
		}

		printPaths(root.left, output + root.data + " ");
		printPaths(root.right, output + root.data + " ");

	}
