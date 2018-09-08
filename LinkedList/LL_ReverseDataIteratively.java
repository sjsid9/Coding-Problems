	public void ReverseDI() throws Exception {

		int left = 0;
		int right = this.size - 1;

		while (left < right) {

			Node ln = getNodeAt(left);
			Node rn = getNodeAt(right);

			int temp = ln.data;
			ln.data = rn.data;
			rn.data = temp;

			left++;
			right--;

		}

	}
