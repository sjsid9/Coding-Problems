import java.util.Scanner;

public class Arrays_targetSumPairs {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int arr[] = new int[n];
		for (int i = 0; i < n; i++) {
			arr[i] = s.nextInt();
		}
		int target = s.nextInt();
		int a, b;
		for (int i = 0; i < n; i++) {
			a = arr[i];
			b = target - arr[i];

			for (int j = 0; j < n; j++) {
				if (b == arr[j]) {
					if (a < b) {
						System.out.println(a + " and " + b);
					}
				}
			}

		}

	}
}
