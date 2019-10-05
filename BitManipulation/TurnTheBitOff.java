package BitManipulation;

public class TurnTheBitOff {
	public static void main(String[] args) {

		int n = 57;
		int k = 3;

		System.out.println(Integer.toBinaryString(n));

		int mask = 1 << k;

		int revmask = ~mask;

		n = n & revmask;

		System.out.println(Integer.toBinaryString(n));

	}
}
