package BitManipulation;

public class SetTheBit {
	public static void main(String[] args) {

		int n = 57;
		int k = 1;

		int mask = 1 << k;

		System.out.println(Integer.toBinaryString(n));

		n = n | mask;

		System.out.println(Integer.toBinaryString(n));

	}
}
