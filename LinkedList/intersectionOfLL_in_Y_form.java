public int intersectPointinYform(Node headA, Node headB) {
		HashMap<Integer, Integer> map = new HashMap<>();

		while (headA != null) {
			map.put(headA.data, 1);
			headA = headA.next;
		}

		while (headB != null) {
			if (map.containsKey(headB.data)) {
				return headB.data;
			} else {
				map.put(headB.data, 1);
				headB = headB.next;
			}
		}
		return -1;
	}
