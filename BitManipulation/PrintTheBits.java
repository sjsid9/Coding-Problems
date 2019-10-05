package BitManipulation;

public class PrintTheBits {
	public static void main(String[] args) {

		int n = 57;

		for (int i = 31; i >= 0; i--) {

			int mask = 1 << i;

			if ((n & mask) == 0) {
				System.out.print(0);
			} else {
				System.out.print(1);
			}

		}

	}
}
