private class help {
		int max = Integer.MIN_VALUE;
		int min = Integer.MAX_VALUE;
	}

	public void verticalWidth() {
		help h = new help();
		verticalWidth(this.root, h, 0);
		System.out.println(h.max + Math.abs(h.min));
	}

	private void verticalWidth(Node node, help h, int curr) {

		if (node == null) {
			return;
		}

		verticalWidth(node.left, h, curr - 1);

		if (h.min > curr) {
			h.min = curr;
		}

		if (h.max < curr) {
			h.max = curr;
		}

		verticalWidth(node.right, h, curr + 1);

	}
