
public class SelectionSort {
	public static void main(String[] args) {

		int[] arr = { 88, 11, 44, 99, 55, 51, 21 };
		selectionSort(arr);
		for (int val : arr) {
			System.out.println(val);
		}
	}

	public static void selectionSort(int[] arr) {

		int counter = 0;
		int min = 0;

		for (counter = 0; counter < arr.length - 1; counter++) {

			min = counter;

			for (int j = counter + 1; j < arr.length; j++) {

				if (arr[j] < arr[min]) {
					min = j;
				}
			}

			int temp = arr[min];
			arr[min] = arr[counter];
			arr[counter] = temp;

		}

	}

}