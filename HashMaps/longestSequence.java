

		// int[] arr = { 2, 12, 9, 16, 10, 5, 3, 20, 25, 11, 1, 8, 6 };

		// System.out.println(longestSequence(arr));

	private static ArrayList<Integer> longestSequence(int[] arr) {

		ArrayList<Integer> ans = new ArrayList<>();
		HashMap<Integer, Boolean> map = new HashMap<>();

		for (int i = 0; i < arr.length; i++) {

			if (map.containsKey(arr[i] - 1)) {
				map.put(arr[i], false);
			} else {
				map.put(arr[i], true);
			}

			if (map.containsKey(arr[i] + 1)) {
				map.put(arr[i + 1], false);
			}
		}

		ArrayList<Integer> keys = new ArrayList<>(map.keySet());
		int seqStarting = -1;
		int mcount = Integer.MIN_VALUE;
		for (Integer key : keys) {

			int count = 0;
			while (map.containsKey(key + count)) {
				count++;
			}

			if (count > mcount) {
				mcount = count;
				seqStarting = key;
			}
		}

		for (int i = 0; i < mcount; i++) {
			ans.add(seqStarting + i);
		}

		return ans;
	}
