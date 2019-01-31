private class Pair {

		private String vname;
		private String psf;
		private Vertex vtx;

		public Pair(String vname, String psf, Vertex vtx) {
			this.vname = vname;
			this.psf = psf;
			this.vtx = vtx;
		}

	}

	public boolean bfs(String src, String dst) {

		HashMap<String, Boolean> processed = new HashMap<>();
		LinkedList<Pair> queue = new LinkedList<>();
		Pair sp = new Pair(src, src, vertices.get(src));

		queue.addLast(sp);

		while (!queue.isEmpty()) {

			Pair rp = queue.removeFirst();

			if (processed.containsKey(rp.vname)) {
				continue;
			}

			processed.put(rp.vname, true);

			if (containsEdge(rp.vname, dst)) {
				System.out.println(rp.psf + dst);
				return true;
			}

			ArrayList<String> nbrs = new ArrayList<>(rp.vtx.nbrs.keySet());
			for (String nbr : nbrs) {

				if (!processed.containsKey(nbr)) {
					Pair nbrPair = new Pair(nbr, rp.psf + nbr, vertices.get(nbr));
					queue.addLast(nbrPair);
				}

			}
		}

		return false;

	}
