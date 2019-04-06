public boolean isConnected() {

		LinkedList<Pair> queue = new LinkedList<>();
		HashMap<String, Boolean> processed = new HashMap<>();

		ArrayList<String> keys = new ArrayList<>(this.vertices.keySet());

		int count = 0;

		for (String key : keys) {

			if (processed.containsKey(key)) {
				continue;
			}

			count++;

			Pair sp = new Pair(key, key, this.vertices.get(key));
			queue.addLast(sp);

			while (!queue.isEmpty()) {

				Pair rp = queue.removeFirst();

				if (processed.containsKey(rp.vname)) {
					continue;
				}

				processed.put(rp.vname, true);

				ArrayList<String> nbrs = new ArrayList<>(rp.vtx.nbrs.keySet());

				for (String nbr : nbrs) {
					if (processed.containsKey(nbr)) {
						continue;
					}
					Pair np = new Pair(nbr, rp.psf + nbr, this.vertices.get(nbr));
					queue.addLast(np);
				}

			}
		}

		if (count == 1) {
			return true;
		} else {
			return false;
		}

	}


