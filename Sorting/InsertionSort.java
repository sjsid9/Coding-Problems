import java.util.Scanner;

public class InsertionSort {
	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		int n = s.nextInt();

		int arr[] = new int[n];

		for (int i = 0; i < n; i++) {
			arr[i] = s.nextInt();
		}
		;
		insertionSort(arr);

		for (int val : arr) {
			System.out.println(val);
		}
		s.close();
	}

	private static void insertionSort(int[] arr) {

		for (int counter = 1; counter < arr.length; counter++) {
			int val = arr[counter];
			int j = counter - 1;
			while (j >= 0 && arr[j] > val) {
				arr[j + 1] = arr[j];
				j--;
			}
			arr[j + 1] = val;
		}

	}
}