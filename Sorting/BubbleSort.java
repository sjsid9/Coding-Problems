
public class BubbleSort {

	public static void main(String[] args) {

		int[] arr = { 88, 66, 55, 44, 22, 11, 5, 1, -8 };
		bubbleSort(arr);
		for (int val : arr) {
			System.out.println(val);
		}
	}

	public static void bubbleSort(int[] arr) {

		int counter = 0;

		for (counter = 0; counter < arr.length - 1; counter++) {

			for (int j = 0; j < arr.length - 1 - counter; j++) {

				if (arr[j] > arr[j + 1]) {
					int temp = arr[j + 1];
					arr[j + 1] = arr[j];
					arr[j] = temp;
				}

			}

		}

	}
}