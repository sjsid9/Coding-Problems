import java.util.Scanner;

public class RECURSION_PATTERN_1_TRIANGLE {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		printTriangleRec(n);

	}

	private static void printTriangleRec(int n) {

		if (n == 0) {
			return;
		}

		printTriangleRec(n - 1);
		for (int i = 0; i < n; i++) {
			System.out.print("*\t");
		}
		System.out.println();

	}

}
