package BitManipulation;

public class IsBitSet {
	public static void main(String[] args) {

		int n = 57;
		int k = 2;

		int mask = 1 << k;

//		System.out.println(mask);
		
		if ((n & mask) == 0) {
			System.out.println("Not Set");
		} else {
			System.out.println("Set");
		}

		System.out.println(Integer.toBinaryString(n));
	}
}
