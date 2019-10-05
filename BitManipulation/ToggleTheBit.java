package BitManipulation;

public class ToggleTheBit {

	public static void main(String[] args) {

		int n = 57;
		int k = 1;

		System.out.println(Integer.toBinaryString(n));

		int mask = 1 << k;

		n = n ^ mask;

		System.out.println(Integer.toBinaryString(n));

	}

}
