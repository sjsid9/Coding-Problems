import java.util.Scanner;

public class ArrayMiroorInverseSecondArray {

	public static void main(String args[]) {
		Scanner s = new Scanner(System.in);

		int n = s.nextInt();
		int[] arr = new int[n];
		int[] arr1 = new int[n];
		int[] rev = new int[n];
		int c = 0;
		int d = 0;

		for (int i = 0; i < arr.length; i++) {
			arr[i] = s.nextInt();
		}

		for (int i = 0; i < arr1.length; i++) {
			arr1[i] = s.nextInt();
		}

		for (int i = arr.length - 1; i >= 0; i--) {
			rev[c] = arr[i];
			c++;
		}

		for (int i = 0; i < arr1.length; i++) {
			if (arr1[i] == rev[i]) {
				d++;
			}
		}
		if (d == n) {
			System.out.println("true");
		} else {
			System.out.println("false");
		}
	}
}
