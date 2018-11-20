	public void printDiagonal() throws Exception {
		HashMap<Integer, Integer> hm = new HashMap<>();
		int level = 0;
		DiagonalSum(this.root, level, hm);
		System.out.println(hm);
	}
	
	private void DiagonalSum(Node node, int level, HashMap<Integer, Integer> hm) throws Exception {

		if (node == null) {
			return;
		}

		Integer i = hm.get(level);

		if (i == null) {
			i = new Integer(0);
			i += node.data;
		} else {
			i += node.data;
		}
		hm.put(level, i);

		DiagonalSum(node.left, level + 1, hm);
		DiagonalSum(node.right, level, hm);

	}
