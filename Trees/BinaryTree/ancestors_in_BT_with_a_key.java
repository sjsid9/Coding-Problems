// A key is given we have to print the ancestors till the root node
	public void ancestorsInBTwithKey(int key) {
		ancestorsInBTwithKey(this.root, key);
	}

	private boolean ancestorsInBTwithKey(Node node, int key) {

		if (node == null) {
			return false;
		}

		if (node.data == key) {

			return true;
		}

		boolean lf = ancestorsInBTwithKey(node.left, key);
		boolean rf = ancestorsInBTwithKey(node.right, key);

		if (lf || rf) {
			System.out.println(node.data);
		}

		return lf || rf;

	}
