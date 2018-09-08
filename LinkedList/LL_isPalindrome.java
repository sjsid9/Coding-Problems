public boolean isPalindrome() throws Exception {

		int left = 0;
		int right = this.size - 1;
		int count = 0;
		while (left < right) {

			Node ln = getNodeAt(left);
			Node rn = getNodeAt(right);

			if (ln.data == rn.data) {
				count++;
			}

			left++;
			right--;
		}

		if (count == this.size / 2) {
			return true;
		} else {
			return false;
		}

	}
