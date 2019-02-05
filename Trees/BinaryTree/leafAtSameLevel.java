
// Ques : if all the leaf nodes are at same level return true else false


	class PairSame_Level {
		boolean sl = true;
		int level = 0;
		boolean flag = false;
	}

	public boolean checkSameLevelLeafNodes() {
		PairSame_Level pair = new PairSame_Level();
		checkSameLevelLeafNodes(this.root, pair, 0);
		return pair.sl;
	}

	private void checkSameLevelLeafNodes(Node node, PairSame_Level mp, int level) {
		if (node == null) {
			return;
		}

		if (node.left == null && node.right == null) {
			int temp = mp.level;
			mp.level = level;

			if (temp != level) {
				if (mp.flag == false) {
					mp.flag = true;
				} else {
					mp.sl = false;
				}
			} else {
				if (mp.sl) {
					mp.sl = true;
				}
			}

		}

		checkSameLevelLeafNodes(node.left, mp, level + 1);
		checkSameLevelLeafNodes(node.right, mp, level + 1);

	}
