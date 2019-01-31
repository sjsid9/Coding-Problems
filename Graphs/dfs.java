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

	public boolean dfs(String src, String dst) {

		HashMap<String, Boolean> processed = new HashMap<>();
		LinkedList<Pair> stack = new LinkedList<>();
		Pair sp = new Pair(src, src, vertices.get(src));

		stack.addFirst(sp);

		while (!stack.isEmpty()) {

			Pair rp = stack.removeFirst();

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
					stack.addFirst(nbrPair);
				}

			}
		}

		return false;

	}
