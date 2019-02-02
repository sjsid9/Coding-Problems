public boolean isPalindromeRecursion() {
		Count c = new Count();
		isPalindromeRecursion(this.head, this.head, c, 0);
		if ((c.c + 1) / 2 == c.x) {
			return true;
		} else {
			return false;
		}
	}

	private class Count {
		private int c = 0;
		private int x = 0;
	}

	private Node isPalindromeRecursion(Node left, Node right, Count c, int count) {

		if (right == null) {
			c.c = count;
			return left;
		}

		Node nl = isPalindromeRecursion(left, right.next, c, count + 1);
		if (count >= c.c / 2) {
			if (nl.data == right.data) {
				c.x += 1;
			}
		}

		return nl.next;

	}
