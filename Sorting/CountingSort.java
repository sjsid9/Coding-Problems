
public class CountingSort {
	public static void main(String[] args) {

		char arr[] = { 'g', 'e', 'e', 'k', 's', 'f', 'o', 'r', 'g', 'e', 'e', 'k', 's' };
		countingSort(arr);

		for (char c : arr) {
			System.out.print(c + " ");
		}

	}

	private static void countingSort(char[] arr) {

		// Created the Output array
		char ouput[] = new char[arr.length];

		// Created the count array
		int count[] = new int[256];

		// Count the number of times a letter occurred
		for (int i = 0; i < arr.length; i++) {
			++count[arr[i]];
		}

		// Keep on adding previous index value to current index value

		for (int i = 1; i <= 255; i++) {
			count[i] += count[i - 1];
		}

		for (int i = 0; i < arr.length; i++) {
			System.out.println(count[arr[i]] - 1);
			ouput[count[arr[i]] - 1] = arr[i];
			--count[arr[i]];
		}

		for (int i = 0; i < arr.length; i++) {
			arr[i] = ouput[i];
		}

	}
}
