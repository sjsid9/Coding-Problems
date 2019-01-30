package HashMap;

public class HMClient {
	public static void main(String[] args) {
		HashMap<String, Integer> map = new HashMap<String, Integer>();

		map.put("USA", 10);
		map.put("DUB", 50);
		map.put("UK", 100);
		map.put("IND", 175);
		map.put("SL", 105);

//		map.display();

		map.put("USA", 562);
		map.put("KAZ", 622);
		map.put("hh", 687);
		map.put("ds", 884);
		map.put("dsa", 52);
		map.put("ADD", 22);
		map.put("fes", 582);
		map.display();

//		System.out.println(map.get("DUB"));
//
//		System.out.println(map.containsKey("USA"));
//		System.out.println(map.containsKey("PAK"));
//		System.out.println(map.keySet());
//		System.out.println(map.remove("KAZ"));
//		map.display();
//
//		System.out.println(map.keySet());

	}
}
