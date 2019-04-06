public void dft() {

		LinkedList<Pair> stack = new LinkedList<>();
		HashMap<String, Boolean> processed = new HashMap<>();

		ArrayList<String> keys = new ArrayList<>(this.vertices.keySet());

		for (String key : keys) {

			if (processed.containsKey(key)) {
				continue;
			}

			Pair sp = new Pair(key, key, this.vertices.get(key));
			stack.addFirst(sp);

			while (!stack.isEmpty()) {

				Pair rp = stack.removeFirst();

				if (processed.containsKey(rp.vname)) {
					continue;
				}

				processed.put(rp.vname, true);

				System.out.println(rp.vname + " via " + rp.psf);

				ArrayList<String> nbrs = new ArrayList<>(rp.vtx.nbrs.keySet());

				for (String nbr : nbrs) {
					if (processed.containsKey(nbr)) {
						continue;
					}
					Pair np = new Pair(nbr, rp.psf + nbr, this.vertices.get(nbr));
					stack.addFirst(np);
				}

			}

		}

	}


