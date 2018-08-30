import java.util.Scanner;

public class CONTAINED_IN_AN_ARRAY {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int[] arr = new int[n];
		for (int i = 0; i < n; i++) {
			arr[i] = s.nextInt();
		}
		int elm = s.nextInt();
		System.out.println(containedInAnArray(arr, 0, elm));
	}

	public static boolean containedInAnArray(int[] arr, int vidx, int elm) {

		if (vidx == arr.length - 1) {
			return false;
		}

		if (elm != arr[vidx]) {
			return containedInAnArray(arr, vidx + 1, elm);
		} else {
			return true;
		}

	}

}
