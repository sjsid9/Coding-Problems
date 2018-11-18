package HashMaps;

import java.util.ArrayList;
import java.util.HashMap;

public class HashMap_Demo {

	public static void main(String[] args) {

		int[] arr1 = { 1, 2, 3, 0, 1, 7, 8, 1, 2, 7, 7 };
		int[] arr2 = { 1, 1, 2, 2, 2, 3, 3, 3 };
		ArrayInterSection(arr1, arr2);

	}

	private static void ArrayInterSection(int[] arr1, int[] arr2) {

		HashMap<Integer, Integer> map = new HashMap<>();
		ArrayList<Integer> ans = new ArrayList<>();

		for (int i = 0; i < arr1.length; i++) {

			if (map.containsKey(arr1[i])) {
				int n = map.get(arr1[i]);
				map.put(arr1[i], n + 1);
			} else {
				map.put(arr1[i], 1);
			}

		}

		for (int i = 0; i < arr2.length; i++) {

			if (map.containsKey(arr2[i]) && map.get(arr2[i]) > 0) {
				int n = map.get(arr2[i]);
				map.put(arr2[i], n - 1);
				ans.add(arr2[i]);
			}

		}

		System.out.println(ans);

	}

}

