	public boolean hasPath(String src, String dst, HashMap<String, Boolean> processed) {

		processed.put(src, true);

		if (containsEdge(src, dst)) {
			return true;
		}

		Vertex vtx = this.vertices.get(src);
		ArrayList<String> nbrs = new ArrayList<>(vtx.nbrs.keySet());

		for (String nbr : nbrs) {

			if (!processed.containsKey(nbr)) {

				if (hasPath(nbr, dst, processed)) {
					return true;
				}
			}
		}
		return false;
	}

