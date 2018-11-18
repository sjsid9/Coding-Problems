package HashMaps;

import java.util.ArrayList;
import java.util.HashMap;

public class HashMap_Demo {

	public static void main(String[] args) {
		
		isIsogramString("geeks");
		isIsogramString("machine");

	}

	
	private static void isIsogramString(String str) {

		HashMap<Character, Integer> map = new HashMap<>();

		for (int i = 0; i < str.length(); i++) {

			char c = str.charAt(i);

			if (map.containsKey(c)) {
				int n = map.get(c);
				map.put(c, n + 1);
			} else {
				map.put(c, 1);
			}

		}

		ArrayList<Character> ans = new ArrayList<>(map.keySet());
		boolean flag = false;
		for (char ch : ans) {
			int val = map.get(ch);
			if (val > 1) {
				flag = true;
				break;
			}
		}

		if (flag) {
			System.out.println(0);
		} else {
			System.out.println(1);
		}

	}

}

