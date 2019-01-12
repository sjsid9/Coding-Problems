import java.util.ArrayList;
import java.util.HashMap;

public class Graph {

	private class Vertex {
		HashMap<String, Integer> nbrs = new HashMap<>();
	}

	HashMap<String, Vertex> vertices = new HashMap<>();

	public int numVertex() {
		return this.vertices.size();
	}

	public boolean containsVertex(String vname) {
		return this.vertices.containsKey(vname);
	}

	public void addVertex(String vname) {

		if (this.vertices.containsKey(vname)) {
			return;
		}

		Vertex vtx = new Vertex();
		vertices.put(vname, vtx);

	}

	public void removeVertex(String vname) {

		if (!this.vertices.containsKey(vname)) {
			return;
		}

		Vertex vtx = this.vertices.get(vname);
		ArrayList<String> nbrs = new ArrayList<>(vtx.nbrs.keySet());

		for (String nbr : nbrs) {
			removeEdge(nbr, vname);
		}

		this.vertices.remove(vname);

	}

	public int numEdge() {

		ArrayList<String> keys = new ArrayList<>(this.vertices.keySet());
		int ans = 0;
		for (String key : keys) {

			Vertex vtx = this.vertices.get(key);
			ans += vtx.nbrs.size();
		}

		return ans / 2;

	}

	public boolean containsEdge(String vname1, String vname2) {

		Vertex vtx1 = this.vertices.get(vname1);
		Vertex vtx2 = this.vertices.get(vname2);

		if (vtx1 == null || vtx2 == null || !vtx1.nbrs.containsKey(vname2)) {
			return false;
		}

		return true;

	}

	public void addEdge(String vname1, String vname2, int cost) {

		Vertex vtx1 = this.vertices.get(vname1);
		Vertex vtx2 = this.vertices.get(vname2);

		if (vtx1 == null || vtx2 == null || vtx1.nbrs.containsKey(vname2)) {
			return;
		}

		vtx1.nbrs.put(vname2, cost);
		vtx2.nbrs.put(vname1, cost);

	}

	public void removeEdge(String vname1, String vname2) {

		Vertex vtx1 = this.vertices.get(vname1);
		Vertex vtx2 = this.vertices.get(vname2);

		if (vtx1 == null || vtx2 == null || !vtx1.nbrs.containsKey(vname2)) {
			return;
		}

		vtx1.nbrs.remove(vname2);
		vtx2.nbrs.remove(vname1);
	}

	public void display() {

		ArrayList<String> keys = new ArrayList<>(this.vertices.keySet());

		for (String key : keys) {

			String str = key + " -> ";
			Vertex vtx = vertices.get(key);
			str += vtx.nbrs;

			System.out.println(str);

		}

	}
}
