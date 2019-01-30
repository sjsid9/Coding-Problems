package HashMap;

import java.util.ArrayList;
import java.util.LinkedList;

public class HashMap<K, V> {

	private class HMNode {
		K key;
		V value;

		public HMNode(K key, V value) {
			this.key = key;
			this.value = value;
		}
	}

	private LinkedList<HMNode>[] bucketArray;
	private int size;

	public HashMap() {
		this(5);
	}

	public HashMap(int cap) {
		this.bucketArray = new LinkedList[cap];
		this.size = 0;

		for (int i = 0; i < bucketArray.length; i++) {
			bucketArray[i] = new LinkedList<>();
		}

	}

	public int hashFunction(K key) {
		int bi = key.hashCode();
		int pv = Math.abs(bi) % bucketArray.length;

		return pv;
	}

	public int findInBucket(LinkedList<HMNode> bucket, K ktbf) {

		for (int i = 0; i < bucket.size(); i++) {
			HMNode node = bucket.get(i);
			if (node.key.equals(ktbf)) {
				return i;
			}
		}
		return -1;
	}

	public void put(K key, V value) {

		int bi = hashFunction(key);
		LinkedList<HMNode> ll = this.bucketArray[bi];

		int si = findInBucket(ll, key);

		if (si == -1) {
			HMNode node = new HMNode(key, value);
			ll.addLast(node);
			this.size++;
		} else {
			HMNode node = ll.get(si);
			node.value = value;
		}

		double avg = this.size / this.bucketArray.length;

		if (avg > 2.0) {
			rehash();
		}

	}

	private void rehash() {

		LinkedList<HMNode>[] oba = this.bucketArray;

		this.bucketArray = new LinkedList[2 * oba.length];
		this.size = 0;

		for (int i = 0; i < bucketArray.length; i++) {
			bucketArray[i] = new LinkedList<>();
		}

		for (int i = 0; i < oba.length; i++) {
			LinkedList<HMNode> ll = oba[i];

			for (int j = 0; j < ll.size(); j++) {
				HMNode node = ll.get(j);
				this.put(node.key, node.value);
			}

		}

	}

	public void display() {

		for (int i = 0; i < bucketArray.length; i++) {

			LinkedList<HMNode> ll = bucketArray[i];
			System.out.print("Bucket " + i + " : ");
			for (int j = 0; j < ll.size(); j++) {
				HMNode node = ll.get(j);
				System.out.print(node.key + " @ " + node.value + ",");
			}
			System.out.println();
		}

	}

	public V get(K key) {

		int bi = hashFunction(key);
		LinkedList<HMNode> ll = this.bucketArray[bi];

		int si = findInBucket(ll, key);

		if (si == -1) {
			return null;
		} else {
			HMNode node = ll.get(si);
			return node.value;
		}
	}

	public boolean containsKey(K key) {

		int bi = hashFunction(key);
		LinkedList<HMNode> ll = this.bucketArray[bi];

		int si = findInBucket(ll, key);

		if (si == -1) {
			return false;
		} else {
			return true;
		}
	}

	public V remove(K key) {

		int bi = hashFunction(key);
		LinkedList<HMNode> ll = this.bucketArray[bi];

		int si = findInBucket(ll, key);

		if (si == -1) {
			return null;
		} else {
			this.size--;
			return ll.remove(si).value;
		}
	}

	public ArrayList<K> keySet() {

		ArrayList<K> ans = new ArrayList<>();

		for (int i = 0; i < bucketArray.length; i++) {

			LinkedList<HMNode> ll = bucketArray[i];

			for (int j = 0; j < ll.size(); j++) {
				HMNode node = ll.get(j);
				ans.add(node.key);
			}

		}
		return ans;
	}

}
